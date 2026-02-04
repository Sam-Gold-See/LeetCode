package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/2/4 16:24
 */
public class TwoPointerTest {

/*
	// 283. 移动零 双指针
	public void moveZeroes(int[] nums) {
		int l = 0, r = 0, n = nums.length;
		while (r < n) {
			if (nums[r] != 0) {
				nums[l++] = nums[r];
			}
			r++;
		}
		while (l < n) {
			nums[l++] = 0;
		}
	}
*/

/*
	// 11. 盛最多水的容器 双指针
	public int maxArea(int[] height) {
		int len = height.length, l = 0, r = len - 1;
		int ans = 0;
		while (l < r) {
			int lh = height[l], rh = height[r];
			ans = Math.max(ans, (r - l) * Math.min(lh, rh));
			if (lh <= rh) {
				l++;
			} else {
				r--;
			}
		}
		return ans;
	}
*/

/*
	// 15. 三数之和 双指针
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		int len = nums.length;
		if (len < 3) {
			return ans;
		}
		for (int i = 0; i < len - 2; i++) {
			if (nums[i] > 0) {
				break;
			}
			if (i > 0 && nums[i] == nums[i - 1]) {
				continue;
			}
			int j = i + 1, k = len - 1;
			while (j < k) {
				int sum = nums[i] + nums[j] + nums[k];
				if (sum == 0) {
					ans.add(List.of(nums[i], nums[j], nums[k]));
					while (j < k && nums[j] == nums[j + 1]) {
						j++;
					}
					while (j < k && nums[k] == nums[k - 1]) {
						k--;
					}
					j++;
					k--;
				} else if (sum < 0) {
					j++;
				} else {
					k--;
				}
			}
		}
		return ans;
	}
*/

	@Test
	public void test() {
	}
}
