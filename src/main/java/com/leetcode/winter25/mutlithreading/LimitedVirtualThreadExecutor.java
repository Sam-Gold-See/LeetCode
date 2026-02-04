package com.leetcode.winter25.mutlithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;

/**
 * @author HuangChunXin
 * @date 2026/2/2 10:36
 */
public class LimitedVirtualThreadExecutor implements Executor, AutoCloseable {

	private final ExecutorService executor;
	private final Semaphore semaphore;

	public LimitedVirtualThreadExecutor(int maxThreads) {
		this.executor = Executors.newVirtualThreadPerTaskExecutor();
		this.semaphore = new Semaphore(maxThreads);
	}

	@Override
	public void execute(Runnable command) {
		try {
			semaphore.acquire();
			executor.submit(() -> {
				try {
					command.run();
				} catch (Exception e) {
					System.err.println("执行任务时发生异常");
				} finally {
					semaphore.release();
				}
			});
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

	@Override
	public void close() {
		executor.close();
	}
}
