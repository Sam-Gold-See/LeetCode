package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author HuangChunXin
 * @date 2026/2/9 15:48
 */
public class BackTrackingTest {

/*
	// 46 全排列 DFS
	private final List<List<Integer>> ans = new ArrayList<>();
	private final LinkedList<Integer> path = new LinkedList<>();
	private final boolean[] bool = new boolean[6];
	private int[] nums;

	public List<List<Integer>> permute(int[] nums) {
		this.nums = nums;
		dfs(0);
		return ans;
	}

	private void dfs(int depth) {
		if (depth == nums.length) {
			List<Integer> temp = new ArrayList<>(path);
			ans.add(temp);
			return;
		}
		for (int i = 0; i < nums.length; i++) {
			if (!bool[i]) {
				bool[i] = true;
				path.offerLast(nums[i]);
				dfs(depth + 1);
				path.pollLast();
				bool[i] = false;
			}
		}
	}
*/

/*
	// 78. 子集 DFS
	private final List<List<Integer>> ans = new ArrayList<>();
	private final LinkedList<Integer> temp = new LinkedList<>();
	private int[] nums;

	public List<List<Integer>> subsets(int[] nums) {
		this.nums = nums;
		dfs(0);
		return ans;
	}

	private void dfs(int depth) {
		if (depth == nums.length) {
			ans.add(new ArrayList<>(temp));
			return;
		}

		dfs(depth + 1);

		temp.offerLast(nums[depth]);
		dfs(depth + 1);
		temp.pollLast();
	}
*/

/*
	// 17. 电话号码的字母组合 DFS
	private static final List<String> KEYBOARD = Arrays.asList("", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz");
	private static final StringBuilder OUT = new StringBuilder();

	public List<String> letterCombinations(String digits) {
		List<String> ans = new ArrayList<>();
		dfs(ans, 0, digits.toCharArray(), digits.length());
		return ans;
	}

	private void dfs(List<String> ans, int pos, char[] digits, int length) {
		if (pos ==length) {
			ans.add(new String(OUT));
			return;
		}
		for (char c: KEYBOARD.get(digits[pos] - '0').toCharArray()) {
			OUT.append(c);
			dfs(ans, pos + 1, digits, length);
			OUT.deleteCharAt(pos);
		}
	}
*/

/*
	// 39. 组合总和 回溯
	private List<List<Integer>> ans = new ArrayList<>();
	private LinkedList<Integer> path = new LinkedList<>();
	private int[] candidates;
	private int target;

	public List<List<Integer>> combinationSum(int[] candidates, int target) {
		Arrays.sort(candidates);
		this.candidates = candidates;
		this.target  = target;
		dfs( 0 , 0);
		return ans;
	}

	private void dfs(int sum, int pos) {
		if (sum == target) {
			ans.add(new ArrayList<>(path));
			return;
		}

		for(int i = pos ; i < candidates.length; i++){
			int nextSum = sum + candidates[i];
			if (nextSum > target) {
				break;
			}
			path.offerLast(candidates[i]);
			dfs(nextSum, i);
			path.pollLast();
		}
	}
*/

/*
	// 22. 括号生成 回溯
	private final StringBuilder path = new StringBuilder();
	private final List<String> ans = new LinkedList<>();

	public List<String> generateParenthesis(int n) {
		if (n != 0) {
			dfs(n, n);
		}
		return ans;
	}

	private void dfs(int left, int right) {
		if (left == 0 && right == 0) {
			ans.add(path.toString());
			return;
		}

		if (left > right) {
			return;
		}

		if (left > 0) {
			path.append("(");
			dfs(left - 1, right);
			path.deleteCharAt(path.length() - 1);
		}

		if (right > 0) {
			path.append(")");
			dfs(left, right - 1);
			path.deleteCharAt(path.length() - 1);
		}
	}
*/

/*
	// 79 单词搜索 回溯
	private static final int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	private char[][] board;
	private char[] goal;

	public boolean exist(char[][] board, String word) {
		this.board = board;
		goal = word.toCharArray();

		int[] cnt = new int[128];
		for (char[] row : board) {
			for (char c : row) {
				cnt[c]++;
			}
		}

		int[] wordCnt = new int[128];
		for (char c : goal) {
			if (++wordCnt[c] > cnt[c]) {
				return false;
			}
		}

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				if (dfs(i, j, 0)) {
					return true;
				}
			}
		}

		return false;
	}

	private boolean dfs(int i, int j, int pos) {
		if (board[i][j] != goal[pos]) {
			return false;
		}
		if (pos == goal.length - 1) {
			return true;
		}
		board[i][j] = 0;
		for (int[] dir : DIR) {
			int tx = i + dir[0], ty = j + dir[1];
			if (tx >= 0 && tx < board.length && ty >= 0 && ty < board[0].length && dfs(tx, ty, pos + 1)) {
				return true;
			}
		}
		board[i][j] = goal[pos];
		return false;
	}
*/

/*
	// 131. 分割回文串 回溯
	private final List<List<String>> ans = new ArrayList<>();
	private final List<String> path = new ArrayList<>();
	private String s;

	public List<List<String>> partition(String s) {
		this.s = s;
		dfs(0);
		return ans;
	}

	private void dfs(int start) {
		if (start == s.length()) {
			ans.add(new ArrayList<>(path));
			return;
		}
		for (int i = start; i < s.length(); i++) {
			if (check(start, i)) {
				path.add(s.substring(start, i + 1));
				dfs(i + 1);
				path.remove(path.size() - 1);
			}
		}
	}

	private boolean check(int left, int right) {
		while (left < right) {
			if (s.charAt(left++) != s.charAt(right--)) {
				return false;
			}
		}
		return true;
	}
*/


	@Test
	public void test() {
	}
}
