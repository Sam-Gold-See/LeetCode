package com.leetcode.winter25.LeetCode75;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/1/12 12:53
 */
public class QueueTest {

/*
	// 933. 最近的请求次数 队列
	public static class RecentCounter {

		Deque<Integer> queue;

		public RecentCounter() {
			queue = new ArrayDeque<>();
		}

		public int ping(int t) {
			queue.offerLast(t);
			while (queue.peek() < t - 3000) {
				queue.pollFirst();
			}
			return queue.size();
		}
	}
*/

/*
	// 649. Dota2 参议院 队列
	public String predictPartyVictory(String senate) {
		int n = senate.length();
		Deque<Integer> radiant = new ArrayDeque<>();
		Deque<Integer> dire = new ArrayDeque<>();
		for (int i = 0; i < n; i++) {
			if (senate.charAt(i) == 'R') {
				radiant.offerLast(i);
			} else {
				dire.offerLast(i);
			}
		}
		while (!radiant.isEmpty() && !dire.isEmpty()) {
			int radiantIndex = radiant.pollFirst();
			int direIndex = dire.pollFirst();
			if (radiantIndex < direIndex) {
				radiant.offerLast(radiantIndex + n);
			} else {
				dire.offerLast(direIndex + n);
			}
		}
		return !radiant.isEmpty() ? "Radiant" : "Dire";
	}
*/

	@Test
	public void test() {
	}
}
