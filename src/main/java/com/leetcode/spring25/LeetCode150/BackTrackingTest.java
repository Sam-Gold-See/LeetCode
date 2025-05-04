package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class BackTrackingTest {

/*
    // 17 电话号码的字母组合 回溯
    private String[] MAPPING = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private List<String> ans = new ArrayList<>();
    private char[] digits;
    private char[] path;

    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        if (n == 0)
            return List.of();
        this.digits = digits.toCharArray();
        path = new char[n];
        dfs(0);
        return ans;
    }

    private void dfs(int pos) {
        if (pos == digits.length) {
            ans.add(new String(path));
            return;
        }

        for (char letter : MAPPING[digits[pos] - '0'].toCharArray()) {
            path[pos] = letter;
            dfs(pos + 1);
        }
    }
*/

/*
    // 77 组合 回溯
    private List<List<Integer>> ans = new ArrayList<>();
    private int depth;
    private int max;
    private int[] path;

    public List<List<Integer>> combine(int n, int k) {
        max = n;
        depth = k;
        path = new int[k];
        dfs(0, 1);
        return ans;
    }

    private void dfs(int pos, int num) {
        if (pos == depth) {
            ans.add(Arrays.stream(path).boxed().collect(Collectors.toList()));
            return;
        }

        for (int i = num; i <= max; i++) {
            path[pos] = i;
            dfs(pos + 1, i + 1);
        }
    }
*/

/*
    // 77 组合 回溯
    private List<List<Integer>> ans = new ArrayList<>();
    private Deque<Integer> path;
    private int max;
    private int depth;

    public List<List<Integer>> combine(int n, int k) {
        max = n;
        depth = k;
        path = new ArrayDeque<>();
        dfs(0, 1);
        return ans;
    }

    private void dfs(int pos, int num) {
        if (pos == depth) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = num; i <= max; i++) {
            path.addLast(i);
            dfs(pos + 1, i + 1);
            path.removeLast();
        }
    }
*/

/*
    // 46 全排列 回溯
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> path = new LinkedList<>();
    private int[] nums;
    private boolean[] vis;
    private int len;

    public List<List<Integer>> permute(int[] nums) {
        len = nums.length;
        this.nums = nums;
        vis = new boolean[len];
        dfs(0);
        return ans;
    }

    private void dfs(int pos) {
        if (pos == len) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < len; i++)
            if (!vis[i]) {
                path.add(nums[i]);
                vis[i] = true;
                dfs(pos + 1);
                vis[i] = false;
                path.remove(pos);
            }
    }
*/

/*
    // 39 组合总和 回溯
    private List<List<Integer>> ans = new ArrayList<>();
    private List<Integer> path = new LinkedList<>();
    private int[] candidates;
    private int target;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        this.candidates = candidates;
        this.target = target;
        Arrays.sort(candidates);
        dfs(0, 0);
        return ans;
    }

    private void dfs(int sum, int pos) {
        if (sum == target) {
            ans.add(new ArrayList<>(path));
            return;
        }

        for (int i = pos; i < candidates.length; i++) {
            int nextSum = sum + candidates[i];
            if(nextSum > target)
                break;

            path.add(candidates[i]);
                dfs(nextSum, i);
            path.remove(path.size() - 1);
        }
    }
*/

/*
    // 22 括号生成 回溯
    private List<String> ans = new ArrayList<>();
    private StringBuilder path = new StringBuilder();

    public List<String> generateParenthesis(int n) {
        if (n != 0)
            dfs(n, n);
        return ans;
    }

    private void dfs(int left, int right) {
        if (left == 0 && right == 0) {
            ans.add(path.toString());
            return;
        }

        if (left > right)
            return;

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
    private int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private char[][] board;
    private char[] goal;

    public boolean exist(char[][] board, String word) {
        this.board = board;
        goal = word.toCharArray();

        int[] cnt = new int[128];
        for (char[] row : board)
            for (char c : row)
                cnt[c]++;

        int[] wordCnt = new int[128];
        for (char c : goal)
            if (++wordCnt[c] > cnt[c])
                return false;

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (dfs(i, j, 0))
                    return true;
        return false;
    }

    private boolean dfs(int i, int j, int pos) {
        if (board[i][j] != goal[pos])
            return false;
        if (pos == goal.length - 1)
            return true;
        board[i][j] = 0;
        for(int[] dir : DIR){
            int tx = i + dir[0];
            int ty = j + dir[1];
            if(tx >=0 && tx<board.length && ty>=0 && ty<board[0].length && dfs(tx, ty, pos+1))
                return true;
        }
        board[i][j] = goal[pos];
        return false;
    }
*/

    @Test
    public void test() {
    }
}
