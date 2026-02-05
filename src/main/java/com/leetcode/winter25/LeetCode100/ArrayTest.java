package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * @author HuangChunXin
 * @date 2026/2/5 17:19
 */
public class ArrayTest {

/*
	// 53. 最大子数组和 贪心
	public int maxSubArray(int[] nums) {
		int sum = 0, ans = Integer.MIN_VALUE;
		for (int num : nums) {
			sum += num;
			ans = Math.max(sum, ans);
			sum = Math.max(sum, 0);
		}
		return ans;
	}
*/

/*
	// 56. 合并区间 排序
	public int[][] merge(int[][] intervals) {
		Arrays.sort(intervals, (Comparator.comparingInt(o -> o[0])));
		List<int[]> list = new ArrayList<>();
		int pos = -1;
		for (int[] interval : intervals) {
			if (pos >= 0 && interval[0] <= list.get(pos)[1]) {
				list.get(pos)[1] = Math.max(interval[1], list.get(pos)[1]);
			} else {
				list.add(interval);
				pos++;
			}
		}
		return list.toArray(new int[list.size()][]);
	}
*/

/*
	// 189. 轮转数组
	public void rotate(int[] nums, int k) {
		int len = nums.length;
		k %= len;
		reverse(nums, 0, len - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, len - 1);
	}

	private void reverse(int[] nums, int l, int r) {
		while (l < r) {
			int temp = nums[l];
			nums[l++] = nums[r];
			nums[r--] = temp;
		}
	}
*/

/*
	// 238. 除了自身以外数组的乘积 前后缀
	public int[] productExceptSelf(int[] nums) {
		int len = nums.length;
		int[] ans = new int[len];
		int[] suf = new int[len];
		suf[len - 1] = 1;
		for (int i = len - 2; i >= 0; i--) {
			suf[i] = suf[i + 1] * nums[i + 1];
		}
		int pre = 1;
		for (int i = 0; i < len; i++) {
			ans[i] = pre * suf[i];
			pre *= nums[i];
		}
		return ans;
	}
*/

	@Test
	public void test() {
	}
}
