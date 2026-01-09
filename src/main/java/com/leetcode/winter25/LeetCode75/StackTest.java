package com.leetcode.winter25.LeetCode75;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/1/11 11:41
 */
public class StackTest {

/*
	// 2390. 从字符串中移除星号 栈
	public String removeStars(String s) {
		char[] chars = s.toCharArray();
		LinkedList<Character> list = new LinkedList<>();
		for (char aChar : chars) {
			if (aChar == '*') {
				list.pollLast();
			} else {
				list.offerLast(aChar);
			}
		}
		StringBuilder ans = new StringBuilder();
		for (Character c : list) {
			ans.append(c);
		}
		return new String(ans.reverse());
	}
*/

/*
	// 735. 小行星碰撞 栈
	public int[] asteroidCollision(int[] asteroids) {
		Deque<Integer> deque = new ArrayDeque<>();
		for (int asteroid : asteroids) {
			boolean isAlive = true;
			while (isAlive && !deque.isEmpty() && deque.peekLast() > 0 && asteroid < 0) {
				int temp = deque.peekLast();
				if (temp <= -asteroid) {
					deque.pollLast();
				}
				if (temp >= -asteroid) {
					isAlive = false;
				}
			}
			if (isAlive) {
				deque.offerLast(asteroid);
			}
		}
		int size = deque.size();
		int[] res = new int[size];
		for (int i = size - 1; i >= 0; i--) {
			res[i] = deque.pollLast();
		}
		return res;
	}
*/

/*
	// 394. 字符串解码 栈模拟
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

	@Test
	public void test() {
	}
}
