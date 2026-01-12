package com.leetcode.winter25.mutlithreading;

/**
 * 两个线程交替打印出a1b2c3...z26
 *
 * @author HuangChunXin
 * @date 2026/1/26 17:30
 */
public class AlternatePrintingLetterAndNumber {

	private static final Object lock = new Object();
	private static int count = 1;
	private static boolean printNumber = false;

	public static void main(String[] args) {
		Thread printNumberThread = new Thread(() -> {
			while (count <= 26) {
				synchronized (lock) {
					while (!printNumber) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (count <= 26) {
						System.out.print(count);
						count++;
						printNumber = false;
						lock.notifyAll();
					}
				}
			}
		});

		Thread printLetterThread = new Thread(() -> {
			while (count <= 26) {
				synchronized (lock) {
					while (printNumber) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					if (count <= 26) {
						System.out.print((char) ('a' + count - 1));
						printNumber = true;
						lock.notifyAll();
					}
				}
			}
		});

		printNumberThread.start();
		printLetterThread.start();
	}
}
