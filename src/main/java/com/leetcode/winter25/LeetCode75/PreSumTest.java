package com.leetcode.winter25.LeetCode75;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/1/9 16:39
 */
public class PreSumTest {

/*
	// 1732. 找到最高海拔 前缀和
	public int largestAltitude(int[] gain) {
		int preSum = 0, ans = 0;
		for (int num : gain) {
			preSum += num;
			ans = Math.max(ans, preSum);
		}
		return ans;
	}
*/

/*
	// 724. 寻找数组的中心下标 前缀和
	public int pivotIndex(int[] nums) {
		int len = nums.length;

		int[] pre = new int[len];
		pre[0] = nums[0];
		for (int i = 1; i < len; i++) {
			pre[i] = pre[i - 1] + nums[i];
		}
		int[] suf = new int[len];
		suf[len - 1] = nums[len - 1];
		for (int i = len - 2; i >= 0; i--) {
			suf[i] = suf[i + 1] + nums[i];
		}

		for (int i = 0; i < len; i++) {
			if (pre[i] == suf[i])
				return i;
		}
		return -1;
	}
*/

	@Test
	public void test() {
	}
}
