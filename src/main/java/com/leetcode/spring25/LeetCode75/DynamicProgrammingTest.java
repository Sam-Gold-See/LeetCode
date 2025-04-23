package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

public class DynamicProgrammingTest {

/*
    // 1137 第 N 个泰波那契数 DP
    public int tribonacci(int n) {
        if (n == 0)
            return 0;
        else if (n <= 2)
            return 1;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++)
            dp[i] = dp[i - 3] + dp[i - 2] + dp[i - 1];
        return dp[n];
    }
*/

/*
    // 746 使用最小花费爬楼梯 DP
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        int[] dp = new int[len + 1];
        dp[0] = dp[1] = 0;
        for (int i = 2; i <= len; i++)
            dp[i] = Math.min(dp[i - 2] + cost[i - 2], dp[i - 1] + cost[i - 1]);
        return dp[len];
    }
*/

/*
    // 198 打家劫舍 DP
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return nums[0];
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++)
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        return Math.max(dp[len - 1], dp[len - 2]);
    }
*/

    @Test
    public void test() {
    }
}
