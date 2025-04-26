package com.leetcode.spring25.Else;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

public class DynamicProgrammingTest {

/*
    // 70 爬楼梯 DP
    public int climbStairs(int n) {
        if (n <= 2)
            return n;
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
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
    // 377 组合总和 IV DP
    public int combinationSum4(int[] nums, int target) {
        Arrays.sort(nums);

        int[] dp = new int[target + 1];
        dp[0] = 1;
        for (int i = 0; i <= target; i++)
            for (int num : nums)
                if (i - num >= 0)
                    dp[i] += dp[i - num];
        return dp[target];
    }
*/

/*
    // 2466 统计构造好字符串的方案数 DP
    public int countGoodStrings(int low, int high, int zero, int one) {
        int mod = (int) 1e9 + 7;
        int[] dp = new int[high + 1];

        dp[0] = 1;
        for (int i = 1; i <= high; i++) {
            if (i - zero >= 0)
                dp[i] = (dp[i] + dp[i - zero]) % mod;
            if (i - one >= 0)
                dp[i] = (dp[i] + dp[i - one]) % mod;
        }

        int ans = 0;
        for (int i = low; i <= high; i++)
            ans = (ans + dp[i]) % mod;
        return ans;
    }
*/

/*
    private static final int MOD = 1000000007;
    private static final int MAX_LENGTH = 100001;

    private static final long[] f = new long[MAX_LENGTH];
    private static final long[] g = new long[MAX_LENGTH];

    private void init() {
        f[0] = g[0] = 1;
        f[1] = g[1] = 1;
        f[2] = g[2] = 2;
        f[3] = g[3] = 4;
        for (int i = 4; i < MAX_LENGTH; i++) {
            f[i] = (f[i - 1] + f[i - 2] + f[i - 3]) % MOD;
            g[i] = (g[i - 1] + g[i - 2] + g[i - 3] + g[i - 4]) % MOD;
        }
    }

    // 2266 统计打字方案数 DP
    public int countTexts(String pressedKeys) {
        init();
        long ans = 1;
        int cnt = 0;
        char[] chars = pressedKeys.toCharArray();
        int len = chars.length;
        for (int i = 0; i < len; i++) {
            char c = chars[i];
            cnt++;
            if (i == len - 1 || c != chars[i + 1]) {
                ans = ans * (c != '7' && c != '9' ? f[cnt] : g[cnt]) % MOD;
                cnt = 0;
            }
        }
        return (int) ans;
    }
*/

/*
    // 198 打家劫舍 DP
    public int rob(int[] nums) {
        if (nums.length < 2)
            return nums[0];
        int len = nums.length;
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++)
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        return dp[len - 1];
    }
*/

/*
    // 213 打家劫舍 II DP
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return nums[0];
        return Math.max(rob(nums, 0, len - 1), rob(nums, 1, len));
    }

    public int rob(int[] nums, int start, int end) {
        if (end - start < 2)
            return nums[start];
        int len = nums.length;
        int[] dp = new int[len];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start + 1]);
        for (int i = start + 2; i < end; i++)
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        return dp[end - 1];
    }
*/

    @Test
    public void test() {
    }
}
