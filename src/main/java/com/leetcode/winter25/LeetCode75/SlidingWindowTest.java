package com.leetcode.winter25.LeetCode75;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/1/9 15:53
 */
public class SlidingWindowTest {

/*
	// 643. 子数组最大平均数 I 滑动窗口
	public double findMaxAverage(int[] nums, int k) {
		double ans = 0, sum = 0;
		for (int i = 0; i < k; i++) {
			sum += nums[i];
		}
		ans = sum / k;
		for (int i = k; i < nums.length; i++) {
			sum = sum + nums[i] - nums[i - k];
			ans = Math.max(ans, sum / k);
		}
		return ans;
	}
*/

/*
	// 1456. 定长子串中元音的最大数目 滑动窗口
	public int maxVowels(String s, int k) {
		Character[] vowels = {'a', 'e', 'i', 'o', 'u'};
		Set<Character> vowelSet = new HashSet<>(Arrays.asList(vowels));
		int ans = 0;
		int vowelNum = 0;
		for (int i = 0; i < k; i++) {
			ans += vowelSet.contains(s.charAt(i)) ? 1 : 0;
		}
		int cnt = ans;
		for (int i = k; i < s.length(); i++) {
			cnt += vowelSet.contains(s.charAt(i)) ? 1 : 0;
			cnt -= vowelSet.contains(s.charAt(i - k)) ? 1 : 0;
			ans = Math.max(ans, cnt);
		}
		return ans;
	}
*/

/*
	// 1004. 最大连续1的个数 III 滑动窗口
	public int longestOnes(int[] nums, int k) {
		int ans = 0, cnt = 0;
		int l = 0;
		for (int r = 0; r < nums.length; r++) {
			cnt += 1 - nums[r];
			while (cnt > k) {
				cnt -= 1 - nums[l++];
			}
			ans = Math.max(ans, r - l + 1);
		}
		return ans;
	}
*/

/*
	// 1493. 删掉一个元素以后全为 1 的最长子数组 滑动窗口
	public int longestSubarray(int[] nums) {
		int ans = 0, l = 0, cnt = 0;
		for (int r = 0; r < nums.length; r++) {
			cnt += 1 - nums[r];
			while (cnt > 1) {
				cnt -= 1 - nums[l++];
			}
			ans = Math.max(ans, r - l);
		}
		return ans;
	}
*/

	@Test
	public void test() {
	}
}
