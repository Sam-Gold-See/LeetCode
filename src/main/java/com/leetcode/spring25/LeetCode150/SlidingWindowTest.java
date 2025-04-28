package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

public class SlidingWindowTest {

/*
    // 209 长度最小的子数组 滑动窗口
    public int minSubArrayLen(int target, int[] nums) {
        int ans = Integer.MAX_VALUE;
        int len = nums.length;
        int l = 0, r = 0, sum = 0;
        while(r < len){
            sum += nums[r];
            if(sum >= target){
                while(sum - nums[l] >= target && l < r)
                    sum -= nums[l++];
                ans = Math.min(r - l + 1, ans);
            }
            r++;
        }
        return ans == Integer.MAX_VALUE ? 0 : ans;
    }
*/

/*
    // 3 无重复字符的最长子串 滑动窗口
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int l = 0, r = 0, len = s.length();
        int[] map = new int[128];
        while (r < len) {
            char now = s.charAt(r);
            map[now]++;
            if (map[now] > 1) {
                while (l < r && map[now] != 1)
                    map[s.charAt(l++)]--;
            }
            ans = Math.max(r - l + 1, ans);
            r++;
        }
        return ans;
    }
*/

    @Test
    public void test() {
    }
}
