package com.leetcode.winter25.mutlithreading;

/**
 * 三线呈顺序打出1-100
 *
 * @author HuangChunXin
 * @date 2026/1/26 15:22
 */
public class AlternatePrintingThreeThreads {

	private int currentNumber = 1;
	private final Object lock = new Object();
	private int turn = 0;

	public static void main(String[] args) {
		AlternatePrintingThreeThreads ap = new AlternatePrintingThreeThreads();

		Thread printer0 = new Thread(() -> ap.printNumbers(0));
		Thread printer1 = new Thread(() -> ap.printNumbers(1));
		Thread printer2 = new Thread(() -> ap.printNumbers(2));

		printer0.start();
		printer1.start();
		printer2.start();
	}

	/**
	 * 根据turn的值打印对应范围数字
	 */
	private void printNumbers(int offset) {
		while (currentNumber <= 100) {
			synchronized (lock) {
				while ((turn % 3) != offset) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				if (currentNumber <= 100 && (currentNumber - 1) % 3 == offset) {
					System.out.println("Thread " + offset + " printed: " + currentNumber++);
				}

				turn = (turn + 1) % 3;
				lock.notifyAll();
			}
		}
	}
}
