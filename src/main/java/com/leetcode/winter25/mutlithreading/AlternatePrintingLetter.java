package com.leetcode.winter25.mutlithreading;

/**
 * 两个线程交替打印AbCdEf字母
 *
 * @author HuangChunXin
 * @date 2026/1/26 17:17
 */
public class AlternatePrintingLetter {

	private static final Object lock = new Object();
	private static char currentLetter = 'A';
	private static boolean printUpperCase = true;

	public static void main(String[] args) {
		Thread upperCasePrinter = new Thread(() -> printLetters(true));
		Thread lowerCasePrinter = new Thread(() -> printLetters(false));

		upperCasePrinter.start();
		lowerCasePrinter.start();
	}

	private static void printLetters(boolean isUpperCaseThread) {
		while (currentLetter <= 'Z') {
			synchronized (lock) {
				while (printUpperCase != isUpperCaseThread) {
					try {
						lock.wait();
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}

				if (currentLetter > 'Z') {
					break;
				}

				if (isUpperCaseThread) {
					System.out.print(currentLetter);
				} else {
					System.out.print(Character.toLowerCase(currentLetter));
				}

				printUpperCase = !printUpperCase;
				currentLetter++;

				lock.notifyAll();
			}
		}
	}
}
