package com.leetcode.winter25.mutlithreading;

/**
 * T1、T2、T3三个线程确保三者严格顺序执行 (join)
 *
 * @author HuangChunXin
 * @date 2026/1/26 18:06
 */
public class ThreadJoinDemo {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Task("T1"), "T1");
		Thread t2 = new Thread(new Task("T2"), "T2");
		Thread t3 = new Thread(new Task("T3"), "T3");

		t1.start();

		try {
			t1.join();

			t2.start();

			t2.join();

			t3.start();

			t3.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("所有线程执行完毕");
	}

	static class Task implements Runnable {
		private String name;

		public Task(String name) {
			this.name = name;
		}

		@Override
		public void run() {
			System.out.println(name + "开始执行");
			try {
				Thread.sleep((long) (Math.random() * 1000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println(name + "执行完毕");
		}
	}
}
