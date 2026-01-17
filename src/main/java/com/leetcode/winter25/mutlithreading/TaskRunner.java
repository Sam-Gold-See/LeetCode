package com.leetcode.winter25.mutlithreading;

import java.util.*;
import java.util.concurrent.*;

/**
 * 一批任务Tasks需要支持动态指定批次、按批次执行这批任务
 *
 * @author HuangChunXin
 * @date 2026/1/27 10:37
 */
public class TaskRunner {

	public static void runTasksInBatches(List<Runnable> tasks, List<List<Integer>> batches) throws ExecutionException, InterruptedException {
		try (ExecutorService executor = Executors.newFixedThreadPool(10)) {

			List<Future<Void>> futures = new ArrayList<>();
			Set<Integer> allBatchTaskIndexes = new HashSet<>();

			for (int i = 0; i < batches.size(); i++) {
				for (int index : batches.get(i)) {
					Future<Void> future = (Future<Void>) executor.submit(tasks.get(index));
					futures.add(future);
					allBatchTaskIndexes.add(index);
				}

				for (Future<Void> f : futures) {
					f.get();
				}
				futures.clear();
				System.out.println("====第" + i + "批执行完毕");
			}

			for (int i = 0; i < tasks.size(); i++) {
				if (!allBatchTaskIndexes.contains(i)) {
					executor.submit(tasks.get(i));
				}
			}

			executor.shutdown();
			while (!executor.isTerminated()) {

			}
		}
	}

	public static void main(String[] args) {
		List<Runnable> tasks = createTasks();

		List<Integer> batch1 = new ArrayList<>(Arrays.asList(1,3,5,7));
		List<Integer> batch2 = new ArrayList<>(Arrays.asList(11,13,15,17));

		List<List<Integer>> batches = new ArrayList<>();
		batches.add(batch1);
		batches.add(batch2);

		try {
			runTasksInBatches(tasks, batches);
			System.out.println("所有任务执行完毕");
		} catch (Exception e){
			e.printStackTrace();
		}
	}

	private static List<Runnable> createTasks() {
		List<Runnable> tasks = new ArrayList<>();
		for (int i = 0; i < 30; i++) {
			final int taskId = i;
			tasks.add(() -> System.out.println("执行任务 #" + taskId));
		}
		return tasks;
	}
}
