package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

public class SlidingWindowTest {

/*
    // 643 子数组最大平均数 I 滑动窗口
    public double findMaxAverage(int[] nums, int k) {
        double ans = 0, sum = 0;
        for (int i = 0; i < k; i++)
            sum += nums[i];
        ans = sum / k;
        for (int i = k; i < nums.length; i++) {
            sum = sum + nums[i] - nums[i - k];
            ans = Math.max(ans, sum / k);
        }
        return ans;
    }
*/

/*
    // 1456 定长子串中元音的最大数目 滑动窗口
    public int maxVowels(String s, int k) {
        HashSet<Character> set = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u'));
        char[] chars = s.toCharArray();
        boolean[] nums = new boolean[chars.length];
        for (int i = 0; i < nums.length; i++)
            nums[i] = set.contains(chars[i]);
        int ans = 0, cnt;
        for (int i = 0; i < k; i++)
            ans += nums[i] ? 1 : 0;
        cnt = ans;
        for (int i = k; i < chars.length; i++) {
            cnt += nums[i] ? 1 : 0;
            cnt -= nums[i - k] ? 1 : 0;
            ans = Math.max(ans, cnt);
        }
        return ans;
    }
*/

/*
    // 1004 最大连续1的个数 III 滑动窗口
    public int longestOnes(int[] nums, int k) {
        int ans = 0;
        int cnt = 0;
        int l = 0;
        for (int r = 0; r < nums.length; r++) {
            cnt += 1 - nums[r];
            while(cnt > k)
                cnt -= 1 - nums[l++];
            ans = Math.max(ans, r - l + 1);
        }
        return ans;
    }
*/

/*
    // 1493 删掉一个元素以后全为1的最长子数组 滑动窗口
    public int longestSubarray(int[] nums) {
        int ans = 0, l = 0, cnt = 0;
        for (int r = 0; r < nums.length; r++) {
            cnt += nums[r] == 0 ? 1 : 0;
            while (cnt > 1)
                cnt -= nums[l++] == 0 ? 1 : 0;
            ans = Math.max(ans, r - l + 1);
        }
        return ans - 1;
    }
*/

    @Test
    public void test() {

    }
}
