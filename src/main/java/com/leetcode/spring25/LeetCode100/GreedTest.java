package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GreedTest {

/*
    // 121 买卖股票的最佳时机 贪心
    public int maxProfit(int[] prices) {
        int cost = Integer.MAX_VALUE, profit = 0;
        for(int price : prices){
            cost = Math.min(cost, price);
            profit = Math.max(profit, price - cost);
        }
        return profit;
    }
*/

/*
    // 55 跳跃游戏 贪心
    public boolean canJump(int[] nums) {
        int mx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > mx)
                return false;
            mx = Math.max(mx, nums[i] + i);
        }
        return true;
    }
*/

/*
    // 45 跳跃游戏 II 贪心
    public int jump(int[] nums) {
        int curR = 0, nextR = 0;
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {
            nextR = Math.max(nextR, i + nums[i]);
            if (i == curR) {
                curR = nextR;
                ans++;
            }
        }
        return ans;
    }
*/

/*
    // 763 划分字母区间 贪心
    public List<Integer> partitionLabels(String s) {
        List<Integer> ans = new ArrayList<>();
        int len = s.length();
        if (0 == len)
            return null;

        int[] map = new int[26];
        for (int i = 0; i < len; i++)
            map[s.charAt(i) - 'a'] = i;

        int l = 0;
        while (l < len) {
            char curLeft = s.charAt(l);
            int r = map[curLeft - 'a'];
            for (int i = l + 1; i < r; i++)
                if (map[s.charAt(i) - 'a'] > r)
                    r = map[s.charAt(i) - 'a'];
            ans.add(r - l + 1);
            l = r + 1;
        }
        return ans;
    }
*/

    @Test
    public void test() {
    }
}
