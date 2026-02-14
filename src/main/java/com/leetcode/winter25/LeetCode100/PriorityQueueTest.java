package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/2/25 14:14
 */
public class PriorityQueueTest {

/*
	// 215. 数组中的第K个最大元素 优先队列
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int num : nums) {
			if (pq.size() < k) {
				pq.offer(num);
			} else {
				Integer topNum = pq.peek();
				if (num > topNum) {
					pq.poll();
					pq.offer(num);
				}
			}
		}
		return pq.peek();
	}
*/

/*
	// 347. 前K个高频元素 优先队列
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (Integer key : map.keySet()) {
			pq.offer(new int[]{key, map.get(key)});
		}
		int[] ans = new int[k];
		int i = 0;
		while (i++ < k) {
			ans[i - 1] = pq.poll()[0];
		}
		return ans;
	}
*/

	@Test
	public void test() {
	}
}
