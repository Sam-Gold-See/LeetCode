package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/2/25 14:13
 */
public class StackTest {

/*
	// 20. 有效的括号 栈
	public boolean isValid(String s) {
		char[] chars = s.toCharArray();
		char[] left = new char[128];
		char[] right = new char[128];
		left['('] = ')';
		right[')'] = '(';
		left['{'] = '}';
		right['}'] = '{';
		left['['] = ']';
		right[']'] = '[';
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (left[c] != 0) {
				stack.push(c);
			}else if (stack.isEmpty() || stack.pop() != right[c]) {
				return false;
			}
		}
		return stack.isEmpty();
	}
*/

/*
	// 155. 最小栈 栈
	class MinStack {

		private Stack<Integer> numStack;
		private Stack<Integer> minStack;

		public MinStack() {
			numStack = new Stack<>();
			minStack = new Stack<>();
		}

		public void push(int val) {
			numStack.push(val);
			if (minStack.isEmpty() || minStack.peek() >= val) {
				minStack.push(val);
			}
		}

		public void pop() {
			if (Objects.equals(numStack.pop(), minStack.peek()))
				minStack.pop();
		}

		public int top() {
			return numStack.peek();
		}

		public int getMin() {
			return minStack.peek();
		}
	}
*/

/*
	// 394. 字符串解码 栈
	public String decodeString(String s) {
		StringBuilder str = new StringBuilder();
		int num = 0;
		LinkedList<Integer> numStack = new LinkedList<>();
		LinkedList<String> strStack = new LinkedList<>();
		for (Character c : s.toCharArray()) {
			if (c == '[') {
				numStack.addLast(num);
				strStack.addLast(str.toString());
				num = 0;
				str = new StringBuilder();
			} else if (c == ']') {
				StringBuilder strTemp = new StringBuilder();
				int numTemp = numStack.pollLast();
				strTemp.append(String.valueOf(str).repeat(Math.max(0, numTemp)));
				str = new StringBuilder(strStack.pollLast() + strTemp);
			} else if (c >= '0' && c <= '9') {
				num = num * 10 + c - '0';
			} else {
				str.append(c);
			}
		}
		return str.toString();
	}
*/

/*
	// 739. 每日温度 栈
	public int[] dailyTemperatures(int[] temperatures) {
		int n = temperatures.length;
		int[] ans = new int[n];
		Stack<Integer> stack = new Stack<>();
		for (int i = n - 1; i >= 0; i--) {
			int t = temperatures[i];
			while (!stack.isEmpty() && t >= temperatures[stack.peek()]) {
				stack.pop();
			}
			if (!stack.isEmpty()) {
				ans[i] = stack.peek() - i;
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
