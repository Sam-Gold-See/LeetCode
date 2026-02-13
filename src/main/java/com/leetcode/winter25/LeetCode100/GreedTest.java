package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/2/25 15:21
 */
public class GreedTest {

/*
	// 121. 买卖股票的最佳时机 贪心
	public int maxProfit(int[] prices) {
		int ans = 0;
		int cost = Integer.MAX_VALUE;
		for (int price : prices) {
			cost = Math.min(cost, price);
			ans = Math.max(price - cost, ans);
		}
		return ans;
	}
*/

/*
	// 55. 跳跃游戏 贪心
	public boolean canJump(int[] nums) {
		int mx = 0;
		for (int i = 0; i < nums.length; i++) {
			if (i > mx) {
				return false;
			}
			mx = Math.max(mx, i + nums[i]);
		}
		return true;
	}
*/

/*
	// 45. 跳跃游戏 II 贪心
	public int jump(int[] nums) {
		int len = nums.length;
		int ans = 0;
		int nextR = 0;
		int curR = 0;
		for (int i = 0; i < len - 1; i++) {
			nextR = Math.max(nextR, nums[i] + i);
			if (i == curR) {
				curR = nextR;
				ans++;
			}
		}
		return ans;
	}
*/

	@Test
	public void test() {
	}
}
