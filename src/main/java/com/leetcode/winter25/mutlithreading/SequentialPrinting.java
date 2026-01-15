package com.leetcode.winter25.mutlithreading;

/**
 * 线程A、B、C分别打印1、2、3顺序执行10次
 *
 * @author HuangChunXin
 * @date 2026/1/26 15:32
 */
public class SequentialPrinting {

	private int count = 0;
	private final Object lock = new Object();

	public static void main(String[] args) {
		SequentialPrinting printer = new SequentialPrinting();

		Thread threadA = new Thread(() -> printer.printNumber(1), "A");
		Thread threadB = new Thread(() -> printer.printNumber(2), "B");
		Thread threadC = new Thread(() -> printer.printNumber(3), "C");

		threadA.start();
		threadB.start();
		threadC.start();
	}

	private void printNumber(int numberToPoint) {
		for (int i = 0; i < 10; i++) {
			synchronized (lock) {
				while (count %  3 != numberToPoint - 1) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				if (count < 30) {
					System.out.println("Thread " + Thread.currentThread().getName() + " printed: " + numberToPoint);
					count++;
					lock.notifyAll();
				}
			}
		}
	}
}