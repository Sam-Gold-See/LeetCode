package com.leetcode.winter25.mutlithreading;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 生产者-消费者模式 (ReentrantLock Condition)
 *
 * @author HuangChunXin
 * @date 2026/1/27 11:39
 */
public class ProducerConsumerWithReentrantLock {

	private static final int BUFFER_SIZE = 10;
	private static int count = 0;
	private static Object[] buffer = new Object[BUFFER_SIZE];
	private static int in = 0;
	private static int out = 0;
	private static final ReentrantLock lock = new ReentrantLock();
	private static final Condition notFull = lock.newCondition();
	private static final Condition notEmpty = lock.newCondition();

	static class Producer extends Thread {

		@Override
		public void run() {
			for (int num = 0; num < 100; num++) {
				lock.lock();
				try {
					while (count == BUFFER_SIZE) {
						System.out.println("队列已满-生产者等待");
						notFull.await();
					}
					buffer[in] = num;
					in = (in + 1) % BUFFER_SIZE;
					count++;
					System.out.println("生产数据-" + num + " | 缓冲区元素数量-" + count);
					notEmpty.signal();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				} finally {
					lock.unlock();
				}
			}
		}
	}

	static class Consumer extends Thread {
		@Override
		public void run() {
			while (true) {
				lock.lock();
				try {
					while (count == 0) {
						System.out.println("队列为空-消费者等待");
						notEmpty.await();
					}

					Object data = buffer[out];
					out = (out + 1) % BUFFER_SIZE;
					count--;
					System.out.println("消费数据-" + data + " | 缓冲区元素数量-" + count);
					notFull.signal();
				} catch (InterruptedException e) {
					Thread.currentThread().interrupt();
				} finally {
					lock.unlock();
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
