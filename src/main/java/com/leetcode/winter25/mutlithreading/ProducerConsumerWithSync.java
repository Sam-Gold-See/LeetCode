package com.leetcode.winter25.mutlithreading;

/**
 * 生产者-消费者模式 (synchronized wait() notify())
 *
 * @author HuangChunXin
 * @date 2026/1/27 11:21
 */
public class ProducerConsumerWithSync {

	private static final int BUFFER_SIZE = 10;
	private static int count = 0;
	private static Object[] buffer = new Object[BUFFER_SIZE];
	private static int inBuffer = 0;
	private static int outBuffer = 0;
	private static final Object lock = new Object();

	static class Producer extends Thread {

		@Override
		public void run() {
			for (int num = 0; num < 100; num++) {
				synchronized (lock) {
					while (count == BUFFER_SIZE) {
						try {
							System.out.println("====队列已满-生产者等待");
							lock.wait();
						} catch (InterruptedException e) {
							Thread.currentThread().interrupt();
						}
					}

					buffer[inBuffer] = num;
					inBuffer = (inBuffer + 1) % BUFFER_SIZE;
					count++;
					System.out.println("生产数据-" + num + " | 缓冲区元素数量-" + count);
					lock.notifyAll();
				}
			}
		}
	}

	static class Consumer extends Thread {

		@Override
		public void run() {
			while (true) {
				synchronized (lock) {
					while (count == 0) {
						try {
							System.out.println("====队列为空-消费者等待");
							lock.wait();
						} catch (InterruptedException e) {
							Thread.currentThread().interrupt();
						}
					}

					Object data = buffer[outBuffer];
					outBuffer = (outBuffer + 1) % BUFFER_SIZE;
					count--;
					System.out.println("消费数据-" + data + " | 缓冲区元素数量-" + count);
					lock.notifyAll();
				}
			}
		}
	}

	public static void main(String[] args) {
		Producer producer = new Producer();
		Consumer consumer = new Consumer();
		producer.start();
		consumer.start();
	}
}
