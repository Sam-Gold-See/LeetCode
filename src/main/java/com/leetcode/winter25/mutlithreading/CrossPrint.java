package com.leetcode.winter25.mutlithreading;

/**
 * 线程交叉打印12A34B56C (wait() & notifyAll())
 *
 * @author HuangChunXin
 * @date 2026/1/26 16:49
 */
public class CrossPrint {

	private static final Object lock = new Object();
	private static boolean printNumber = true;

	public static void main(String[] args) {
		Thread printNumberThread = new Thread(() -> {
			for (int i = 1; i <= 52; i += 2) {
				synchronized (lock) {
					while (!printNumber) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(i);
					System.out.println(i + 1);
					printNumber = false;
					lock.notifyAll();
				}
			}
		});
		Thread printLetterThread = new Thread(() -> {
			for (char c = 'A'; c <= 'Z'; c++) {
				synchronized (lock) {
					while (printNumber) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}
					System.out.println(c);
					printNumber = true;
					lock.notifyAll();
				}
			}
		});

		printNumberThread.start();
		printLetterThread.start();
	}
}
