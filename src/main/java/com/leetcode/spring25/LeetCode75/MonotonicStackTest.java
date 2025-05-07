package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

import java.util.Stack;

public class MonotonicStackTest {

/*
    // 739 每日温度 单调栈
    public int[] dailyTemperatures(int[] temperatures) {
        int len = temperatures.length;
        int[] ans = new int[len];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < len; i++) {
            while (!stack.isEmpty() && temperatures[i] > temperatures[stack.peek()]) {
                int pre = stack.pop();
                ans[pre] = i - pre;
            }
            stack.push(i);
        }
        return ans;
    }
*/

/*
    // 739 每日温度 单调栈
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> stack = new Stack<>();
        for (int i = n - 1; i >= 0; i--) {
            int t = temperatures[i];
            while (!stack.isEmpty() && t >= temperatures[stack.peek()])
                stack.pop();
            if (!stack.isEmpty())
                ans[i] = stack.peek() - i;
            stack.push(i);
        }
        return ans;
    }
*/

    @Test
    public void test() {
    }
}
