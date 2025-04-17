package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

public class TwoPointerTest {

/*
    // 283 移动零 双指针
    public void moveZeroes(int[] nums) {
        int l = 0, r = 0;
        int len = nums.length;
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
    // 11 盛最多水的容器 双指针
    public int maxArea(int[] heights) {
        int l = 0, r = heights.length - 1;
        int ans = Integer.MIN_VALUE;
        while (l < r) {
            ans = Math.max(ans, Math.min(heights[l], heights[r]) * (r - l));
            if (heights[l] < heights[r])
                l++;
            else
                r--;
        }
        return ans;
    }
*/

/*
    // 15 三数之和 双指针
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < nums.length - 2; k++) {
            if (nums[k] > 0)
                break;
            if (k > 0 && nums[k] == nums[k - 1])
                continue;
            int i = k + 1;
            int j = nums.length - 1;
            while (i < j) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum < 0)
                    while (i < j && nums[i] == nums[++i]) ;
                else if (sum > 0)
                    while (i < j && nums[j] == nums[--j]) ;
                else {
                    res.add(new ArrayList<>(Arrays.asList(nums[i], nums[j], nums[k])));
                    while (i < j && nums[i] == nums[++i]) ;
                    while (i < j && nums[j] == nums[--j]) ;
                }
            }
        }
        return res;
    }
*/

/*
    // 42 接雨水 双指针
    public int trap(int[] height) {
        int ans = 0;
        int l = 0, r = height.length - 1;
        int preMax = 0, sufMax = 0;
        while (l < r) {
            preMax = Math.max(preMax, height[l]);
            sufMax = Math.max(sufMax, height[r]);
            if (preMax < sufMax)
                ans += preMax - height[l++];
            else
                ans += sufMax - height[r--];
        }
        return ans;
    }
*/

    @Test
    public void test() {
    }
}
