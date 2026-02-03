package com.leetcode.winter25.LeetCode75;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author HuangChunXin
 * @date 2026/2/1 14:55
 */
public class BinarySearchTest {

/*
	// 34. 在排序数组中查找元素的第一个和最后一个位置 二分
	public int[] searchRange(int[] nums, int target) {
		int l = search(nums, target);
		if (l == nums.length || nums[l] != target) {
			return new int[]{-1, -1};
		}
		int r = search(nums, target + 1) - 1;
		return new int[]{l, r};
	}

	private int search(int[] nums, int target) {
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] >= target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}
*/

/*
	// 374. 猜数字大小 二分
	public int guessNumber(int n) {
		int l = 1, r = n;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			int res = guess(mid);
	        if (res == 0) {
	            return mid;
	        } else if (res < 0) {
	            r = mid - 1;
	        } else {
	            l = mid + 1;
	        }
		}
		return l;
	}
*/

/*
	// 2300. 咒语和药水的成功对数 二分
	public int[] successfulPairs(int[] spells, int[] potions, long success) {
		int m = spells.length, n = potions.length;
		Arrays.sort(potions);
		int[] ans = new int[m];
		for (int i = 0; i < m; i++) {
			int l = 0, r = n - 1;
			while (l <= r) {
				int mid = l + (r - l) / 2;
				long num = (long) spells[i] * potions[mid];
				if (num >= success) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			}
			ans[i] = n - l;
		}
		return ans;
	}
*/

/*
	// 162. 寻找峰值 二分
	public int findPeakElement(int[] nums) {
		int n = nums.length;
		if (n == 1) {
			return 0;
		}
		int l = 0, r = n - 2;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] >= nums[mid + 1]) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}
*/

/*
	// 875. 爱吃香蕉的珂珂 二分
	public int minEatingSpeed(int[] piles, int h) {
		int l = 1, r = 0;
		for (int pile : piles) {
			r = Math.max(r, pile);
		}
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (judge(piles, mid, h)) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}

	private boolean judge(int[] piles, int k, int h) {
		long cnt = 0;
		for (int pile : piles) {
			cnt += (pile + k - 1) / k;
		}
		return cnt <= h;
	}
*/

	@Test
	public void test() {
	}
}
