package com.leetcode.winter25.LeetCode75;

import org.junit.Test;

import java.util.PriorityQueue;

/**
 * @author HuangChunXin
 * @date 2026/2/1 14:43
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
	// 2336. 无限集中的最小数字 优先队列
	class SmallestInfiniteSet {

		boolean[] vis = new boolean[1001];
		PriorityQueue<Integer> pq = new PriorityQueue<>(Integer::compare);
		int idx = 1;

		public SmallestInfiniteSet() {
		}

		public int popSmallest() {
			int ans = -1;
			if (!pq.isEmpty()) {
				ans = pq.poll();
				vis[ans] = false;
			} else {
				ans = idx++;
			}
			return ans;
		}

		public void addBack(int num) {
			if (num >= idx || vis[num]) {
				return;
			}
			if (num == idx - 1) {
				idx--;
			} else {
				pq.offer(num);
				vis[num] = true;
			}
		}
	}
*/

	@Test
	public void test() {
	}
}
