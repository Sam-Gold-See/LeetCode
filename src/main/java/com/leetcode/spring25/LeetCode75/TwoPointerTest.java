package com.leetcode.spring25.LeetCode75;


import org.junit.Test;

public class TwoPointerTest {

    /*
        // 283 移动零 双指针
        public void moveZeroes(int[] nums) {
            int len = nums.length;
            int l = 0, r = 0;
            while (r < len) {
                if (nums[r] != 0)
                    nums[l++] = nums[r];
                r++;
            }
            while (l < len)
                nums[l++] = 0;
        }
    */

/*
    // 392 判断子序列 双指针
    public boolean isSubsequence(String s, String t) {
        int is = 0, it = 0;
        if (s.isEmpty())
            return true;
        while (it < t.length() && is < s.length()) {
            if (t.charAt(it++) == s.charAt(is))
                is++;
        }
        return is == s.length();
    }
*/

/*
    // 11 盛最多水的容器 双指针
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1;
        int ans = Integer.MIN_VALUE;
        while (l < r) {
            ans = Math.max(ans, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r]) {
                l++;
            } else r--;
        }
        return ans;
    }
*/

/*
    // 1679 K和数对的最大数目 哈希
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int ans = 0;
        for (int num : nums) {
            int c = map.getOrDefault(k - num, 0);
            if (c > 0) {
                map.put(k - num, c - 1);
                ans++;
            } else
                map.put(num, map.getOrDefault(num, 0) + 1);
        }
        return ans;
    }
*/

    @Test
    public void test() {
    }
}
