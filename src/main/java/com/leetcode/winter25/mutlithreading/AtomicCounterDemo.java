package com.leetcode.winter25.mutlithreading;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * 线程安全，100个线程每个线程累加100次
 *
 * @author HuangChunXin
 * @date 2024/1/26 16:35
 */
public class AtomicCounterDemo {

	private static final AtomicInteger counter = new AtomicInteger(0);

	public static void main(String[] args) throws InterruptedException {
		// 使用虚拟线程执行器
		try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) {

			int threadCount = 100;
			CountDownLatch latch = new CountDownLatch(threadCount);

			for (int i = 0; i < threadCount; i++) {
				executor.submit(() -> {
					try {
						for (int j = 0; j < 100; j++) {
							counter.incrementAndGet();
						}
					} finally {
						// 任务完成后减少计数器
						latch.countDown();
					}
				});
			}

			// 等待所有任务完成
			latch.await();

			System.out.println("Final count: " + counter.get());
		}
	}
}
