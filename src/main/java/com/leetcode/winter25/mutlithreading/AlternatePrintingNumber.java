package com.leetcode.winter25.mutlithreading;

/**
 * 双线程顺序打印1-100
 *
 * @author HuangChunXin
 * @date 2026/1/26 15:06
 */
public class AlternatePrintingNumber {

	private int currentNumber = 1; // 当前要打印的数字
	private final Object lock = new Object();

	public static void main(String[] args) {
		AlternatePrintingNumber ap = new AlternatePrintingNumber();

		Thread oddPrinter = new Thread(() -> ap.printNumber(true));
		oddPrinter.start();

		Thread evenPrinter = new Thread(() -> ap.printNumber(false));
		evenPrinter.start();
	}

	/**
	 * 根据isOdd标志打印奇数或偶数
	 */
	private void printNumber(boolean isOdd) {
		while (currentNumber <= 100) {
			synchronized (lock) {
				while ((isOdd && currentNumber % 2 == 0) || (!isOdd && currentNumber % 2 == 1)) {
					try {
						// 如果线程不该打印，则等待
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				if (currentNumber <= 100) {
					System.out.println("Thread " + (isOdd ? "Odd" : "Even") + " printed: " + currentNumber++);
					lock.notifyAll();
				}
			}
		}
	}
}
