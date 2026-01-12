package com.leetcode.winter25.mutlithreading;

/**
 * 两个线程一个打印abcd一个打印1234，交替打印出 a1b2c3d4 循环十轮
 *
 * @author HuangChunXin
 * @date 2026/1/26 17:37
 */
public class AlternatePrintingDemo {

	private static final Object lock = new Object();
	private static int state = 0;
	private static int round = 0;

	public static void main(String[] args) {
		Thread printLetters = new Thread(() -> {
			for (int i = 0; i < 40; i++) {
				synchronized (lock) {
					while (state != 0) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

					if (round < 10) {
						char letter = (char) ('a' + i % 4);
						System.out.print(letter);
						state = 1;
						lock.notifyAll();
					}
				}
			}
		});

		Thread printNumbers = new Thread(() -> {
			for (int i = 0; i < 40; i++) {
				synchronized (lock) {
					while (state != 1) {
						try {
							lock.wait();
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}

					if (round < 10) {
						int number = i % 4 + 1;
						System.out.print(number);

						if ((i + 1) % 4 == 0) {
							round++;
						}

						state = 0;
						lock.notifyAll();
					}
				}
			}
		});

		printNumbers.start();
		printLetters.start();
	}
}
