package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Stack;

public class StackTest {

/*
    // 20 有效的括号 栈 模拟
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        char[] left = new char[128];
        char[] right = new char[128];
        left['('] = ')';
        right[')'] = '(';
        left['{'] = '}';
        right['}'] = '{';
        left['['] = ']';
        right[']'] = '[';
        for (char c : chars) {
            if (left[c] != 0)
                stack.push(c);
            else if (stack.isEmpty() || stack.pop() != right[c])
                return false;
        }
        return stack.isEmpty();
    }
*/

    /*
        // 155 最小栈 栈 优先队列
        public static class MinStack {
            private final PriorityQueue<Integer> priorityQueue;
            private final Stack<Integer> stack;

            public MinStack() {
                stack = new Stack<>();
                priorityQueue = new PriorityQueue<>();
            }

            public void push(int val) {
                stack.push(val);
                priorityQueue.offer(val);
            }

            public void pop() {
                int val = stack.pop();
                priorityQueue.remove(val);
            }

            public int top() {
                return stack.peek();
            }

            public int getMin() {
                return priorityQueue.peek();
            }
        }
    */

/*
    // 155 最小栈 栈
    public static class MinStack {
        private final Stack<Integer> minStack;
        private final Stack<Integer> stack;

        public MinStack() {
            stack = new Stack<>();
            minStack = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if (minStack.isEmpty() || val <= minStack.peek())
                minStack.push(val);
        }

        public void pop() {
            if (minStack.peek().equals(stack.pop()))
                minStack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return minStack.peek();
        }
    }
*/


/*
    // 394 字符串解码 栈
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();

        int num = 0;
        StringBuilder curStr = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (Character.isDigit(c))
                num = num * 10 + c - '0';
            else if (c == '[') {
                numStack.push(num);
                strStack.push(curStr.toString());
                num = 0;
                curStr = new StringBuilder();
            } else if (c == ']') {
                int times = numStack.pop();
                StringBuilder temp = new StringBuilder(strStack.pop());
                while (times-- > 0)
                    temp.append(curStr);
                curStr = temp;
            } else curStr.append(c);
        }
        return curStr.toString();
    }
*/

/*
    // 739 每日温度 栈 单调栈
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

    @Test
    public void test() {
    }
}
