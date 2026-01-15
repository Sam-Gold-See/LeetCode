package com.leetcode.winter25.mutlithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 线程交叉打印12A34B56C (ReentrantLock & Condition)
 *
 * @author HuangChunXin
 * @date 2026/1/26 17:07
 */
public class CrossPrintWithLock {

	private static final Lock lock = new ReentrantLock();
	private static final Condition printNumberCondition = lock.newCondition();
	private static final Condition printLetterCondition = lock.newCondition();
	private static boolean printNumber = true;

	public static void main(String[] args) {
		Thread printNumberThread = new Thread(() -> {
			lock.lock();
			try {
				for (int i = 1; i <= 52; i++) {
					while (!printNumber) {
						printNumberCondition.await();
					}
					System.out.println(i);
					System.out.println(i + 1);
					printNumber = false;
					printLetterCondition.signal();
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			} finally {
				lock.unlock();
			}
		});

		Thread printLetterThread = new Thread(() -> {
			lock.lock();
			try {
				for (char c = 'A' ; c <= 'Z';c++) {
					while (printNumber) {
						printLetterCondition.await();
					}
					System.out.println(c);
					printNumber = true;
					printNumberCondition.signal();
				}
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}finally {
				lock.unlock();
			}
		});

		printNumberThread.start();
		printLetterThread.start();
	}
}
