package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicProgrammingTest {

/*
    // 70 爬楼梯 DP
    public int climbStairs(int n) {
        int[] f = new int[n + 5];
        f[1] = 1;
        f[2] = 2;
        for (int i = 3; i <= n; i++)
            f[i] = f[i - 1] + f[i - 2];
        return f[n];
    }
*/

/*
    // 118 杨辉三角 DP
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        if (numRows == 0)
            return ans;
        ans.add(new ArrayList<>());
        ans.get(0).add(1);
        for (int i = 2; i <= numRows; i++) {
            List<Integer> temp = new ArrayList<>();
            List<Integer> preRow = ans.get(i - 2);
            temp.add(1);
            for (int j = 1; j < i - 1; j++)
                temp.add(preRow.get(j - 1) + preRow.get(j));
            temp.add(1);
            ans.add(temp);
        }
        return ans;
    }
*/

/*
    // 198 打家劫舍 DP
    public int rob(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return nums[0];
        int[] f = new int[len];
        f[0] = nums[0];
        f[1] = Math.max(nums[0], nums[1]);
        for (int i = 2; i < len; i++)
            f[i] = Math.max(f[i - 1], f[i - 2] + nums[i]);
        return f[len - 1];
    }
*/

/*
    // 279 完全平方数 DP 完全背包
    public int numSquares(int n) {

    }
*/

/*
    // 322 零钱兑换 DP
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for (int i = 1; i <= amount; i++)
            for (int coin : coins)
                if (i - coin >= 0 && dp[i - coin] != amount + 1)
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
        return dp[amount] == amount + 1 ? -1 : dp[amount];
    }
*/

/*
    // 139 单词拆分 DP
    public boolean wordBreak(String s, List<String> wordDict){

    }
*/

/*
    // 300 最长递增子序列 DP
    public int lengthOfLIS(int[] nums) {
        int len = nums.length;
        int[] dp = new int[len];
        int res = 0;
        Arrays.fill(dp, 1);
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < i; j++)
                if (nums[i] > nums[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
            res = Math.max(res, dp[i]);
        }
        return res;
    }
*/

/*
    // 152 乘积最大子数组 DP
    public int maxProduct(int[] nums) {

    }
*/

/*
    // 416 分割等和子集 DP
    public boolean canPartition(int[] nums) {

    }
*/

    @Test
    public void test() {
    }
}
