package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

import java.util.HashMap;

/**
 * @author HuangChunXin
 * @date 2026/2/5 10:57
 */
public class SubStringTest {

/*
	// 560. 和为 K 的子数组 前缀和 哈希
	public int subarraySum(int[] nums, int k) {
		int ans = 0, sum = 0;
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int num : nums) {
			map.put(sum, map.getOrDefault(sum, 0) + 1);
			sum += num;
			ans += map.getOrDefault(sum - k, 0);
		}
		return ans;
	}
*/

	@Test
	public void test() {
	}
}
