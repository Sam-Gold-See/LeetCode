package com.leetcode.winter25.LeetCode75;

import org.junit.Test;

import java.util.*;

/**
 * @author HuangChunXin
 * @date 2026/2/2 21:52
 */
public class BacktrackingTest {

/*
	// 17. 电话号码的字母组合 回溯
	private static final List<String> KEYBOARD = Arrays.asList("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
	private static final StringBuilder OUT = new StringBuilder();

	public List<String> letterCombinations(String digits) {
		List<String> ans = new ArrayList<>();
		dfs(ans, 0, digits.toCharArray(), digits.length());
		return ans;
	}

	private void dfs(List<String> ans, int pos, char[] digits, int len) {
		if (pos == len) {
			ans.add(new String(OUT));
			return;
		}
		for (char c : KEYBOARD.get(digits[pos] - '0').toCharArray()) {
			OUT.append(c);
			dfs(ans, pos + 1, digits, len);
			OUT.deleteCharAt(pos);
		}
	}
*/

/*
	// 216. 组合总和 III 回溯
	public List<List<Integer>> combinationSum3(int k, int n) {
		List<List<Integer>> ans = new ArrayList<>();
		Deque<Integer> path = new ArrayDeque<>();
		dfs(k, n, 1, path, ans);
		return ans;
	}

	private void dfs(int k, int resSum, int start, Deque<Integer> path, List<List<Integer>> ans) {
		if (resSum < 0) {
			return;
		}

		if (k == 0) {
			if (resSum == 0) {
				ans.add(new ArrayList<>(path));
			}
			return;
		}

		for (int i = start; i <= 9; i++) {
			path.offerLast(i);
			dfs(k - 1, resSum - i, i + 1, path, ans);
			path.removeLast();
		}
	}
*/

	@Test
	public void test() {
	}
}
