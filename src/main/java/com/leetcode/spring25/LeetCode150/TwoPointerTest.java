package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

import java.util.*;

public class TwoPointerTest {

/*
    // 125 验证回文串 模拟
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for (char c : s.toCharArray())
            if (Character.isLetter(c) || Character.isDigit(c))
                sb.append(c);
        String goal = sb.toString().toLowerCase();
        int l = 0, r = goal.length() - 1;
        char[] chars = goal.toCharArray();
        while (l < r) {
            if (chars[l] != chars[r])
                return false;
            l++;
            r--;
        }
        return true;
    }
*/

/*
    // 392 判断子序列 双指针 模拟
    public boolean isSubsequence(String s, String t) {
        int is = 0, it = 0;
        if (s.isEmpty())
            return true;
        while (it < t.length() && is < s.length())
            if (t.charAt(it++) == s.charAt(is))
                is++;
        return is == s.length();
    }
*/

/*
    // 167 两数之和 II - 输入有序数组 哈希
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < numbers.length; i++) {
            int goal = target - numbers[i];
            if (map.containsKey(goal))
                return new int[]{map.get(goal), i + 1};
            else
                map.put(numbers[i], i + 1);
        }
        return new int[2];
    }
*/

/*
    // 167 两数之和 II - 输入有序数组 双指针
    public int[] twoSum(int[] numbers, int target) {
        int l = 0, r = numbers.length - 1;
        while (l <= r) {
            int sum = numbers[l] + numbers[r];
            if (sum == target)
                return new int[]{l + 1, r + 1};
            else if (sum < target)
                l++;
            else
                r--;
        }
        return new int[2];
    }
*/

/*
    // 11 盛最多水的容器 双指针
    public int maxArea(int[] height) {
        int ans = Integer.MIN_VALUE;
        int l = 0, r = height.length - 1;
        while (l < r) {
            ans = Math.max(ans, Math.min(height[l], height[r]) * (r - l));
            if (height[l] < height[r])
                l++;
            else r--;
        }
        return ans;
    }
*/

/*
    // 15 三数之和 双指针
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if (len < 3)
            return ans;
        for (int i = 0; i < len - 2; i++) {
            if (nums[i] > 0)
                break;
            if (i > 0 && nums[i] == nums[i - 1])
                continue;
            int j = i + 1, k = len - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1])
                        j++;
                    while (j < k && nums[k] == nums[k - 1])
                        k--;
                    j++;
                    k--;
                } else if (sum < 0)
                    j++;
                else if (sum > 0)
                    k--;
            }
        }
        return ans;
    }
*/

    @Test
    public void test() {
    }
}
