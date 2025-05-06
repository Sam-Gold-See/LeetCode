package com.leetcode.spring25.Else;

import org.junit.Test;

public class ElseTest {

/*
    // 509 斐波那契数 DP
    public int fib(int n) {
        if (n < 2)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }
*/

/*
    // 275 H 指数 II 模拟
    public int hIndex(int[] citations) {
        int len = citations.length;
        int h = 0, i = len - 1;
        while (i >= 0 && citations[i] > h) {
            h++;
            i--;
        }
        return h;
    }
*/

/*
    // 1920 基于排列构建数组 模拟
    public int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        for(int i = 0;i < len; i++)
            ans[i] = nums[nums[i]];
        return ans;
    }
*/

    @Test
    public void test() {
    }
}
