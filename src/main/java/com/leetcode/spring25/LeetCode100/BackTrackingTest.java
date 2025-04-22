package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

import java.util.*;

public class BackTrackingTest {

/*
    private final List<List<Integer>> ans = new ArrayList<>();
    private final List<Integer> temp = new LinkedList<>();
    private int len;

    // 46 全排列 回溯
    public List<List<Integer>> permute(int[] nums) {
        len = nums.length;
        boolean[] vis = new boolean[len];
        dfs(nums, vis, 0);
        return ans;
    }

    private void dfs(int[] nums, boolean[] vis, int depth) {
        if (depth == len) {
            ans.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i < len; i++) {
            if (!vis[i]) {
                temp.add(nums[i]);
                vis[i] = true;
                dfs(nums, vis, depth + 1);
                temp.remove(depth);
                vis[i] = false;
            }
        }
    }
*/

/*
    private final List<List<Integer>> ans = new ArrayList<>();
    private final List<Integer> temp = new LinkedList<>();
    private int[] nums;

    // 78 子集 回溯
    public List<List<Integer>> subsets(int[] nums) {
        this.nums = nums;
        reverse(0);
        return ans;
    }

    private void reverse(int depth) {
        if (depth == nums.length) {
            ans.add(new ArrayList<>(temp));
            return;
        }

        reverse(depth + 1);

        temp.add(nums[depth]);
        reverse(depth + 1);
        temp.remove(temp.size() - 1);
    }
*/

/*
    private static final String[] MAPPING = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private final List<String> ans = new ArrayList<>();
    private char[] digits;
    private char[] path;

    // 17 电话号码的字母组合 回溯
    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        if (n == 0)
            return List.of();
        this.digits = digits.toCharArray();
        path = new char[n];
        dfs(0);
        return ans;
    }

    private void dfs(int depth) {
        if (depth == digits.length) {
            ans.add(new String(path));
            return;
        }
        for (char c : MAPPING[digits[depth] - '0'].toCharArray()) {
            path[depth] = c;
            dfs(depth + 1);
        }
    }
*/

    /*
        private final List<List<Integer>> ans = new ArrayList<>();
        private final List<Integer> path = new LinkedList<>();
        private int[] candidates;
        private int target;

        // 39 组合总和 回溯
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            this.target = target;
            this.candidates = candidates;
            Arrays.sort(candidates);
            dfs(0, 0);
            return ans;
        }

        private void dfs(int curIndex, int curSum) {
            if(curSum == target){
                ans.add(new ArrayList<>(path));
                return;
            }

            for(int i = curIndex; i < candidates.length;i++){
                int nextSum = curSum + candidates[i];
                if(nextSum > target)
                    break;
                path.add(candidates[i]);
                dfs(i,nextSum);
                path.remove(path.size() - 1);
            }
        }
    */

/*
    private final List<String> ans = new ArrayList<>();
    private int n;

    // 22 括号生成 回溯
    public List<String> generateParenthesis(int n) {
        if (n == 0)
            return ans;
        reverse("", n, n);
        return ans;
    }

    private void reverse(String curStr, int left, int right) {
        if (left == 0 && right == 0) {
            ans.add(curStr);
            return;
        }

        if (left > right)
            return;

        if (left > 0)
            reverse(curStr + "(", left - 1, right);

        if (right > 0)
            reverse(curStr + ")", left, right - 1);
    }
*/

    /*
        private final List<String> ans = new ArrayList<>();
        private final StringBuilder sb = new StringBuilder();
        private int n;

        // 22 括号生成 回溯
        public List<String> generateParenthesis(int n) {
            if (n == 0)
                return ans;
            reverse(n, n);
            return ans;
        }

        private void reverse(int left, int right) {
            if (left == 0 && right == 0) {
                ans.add(sb.toString());
                return;
            }

            if (left > right)
                return;

            if (left > 0) {
                sb.append("(");
                reverse(left - 1, right);
                sb.deleteCharAt(sb.length() - 1);
            }
            if (right > 0) {
                sb.append(")");
                reverse(left, right - 1);
                sb.deleteCharAt(sb.length() - 1);
            }
        }
    */

/*
    private static final int[][] DIR = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private char[][] board;
    private char[] words;

    // 79 单词搜索 回溯
    public boolean exist(char[][] board, String word) {
        words = word.toCharArray();
        this.board = board;
        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (reverse(i, j, 0))
                    return true;
        return false;
    }

    private boolean reverse(int i, int j, int len) {
        if (board[i][j] != words[len])
            return false;
        if (len == words.length - 1)
            return true;
        board[i][j] = 0;
        for (int[] dir : DIR) {
            int ti = i + dir[0];
            int tj = j + dir[1];
            if (ti >= 0 && ti < board.length && tj >= 0 && tj < board[0].length && reverse(ti, tj, len + 1))
                return true;
        }
        board[i][j] = words[len];
        return false;
    }
*/

/*
    private static final int[][] DIR = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private char[][] board;
    private char[] words;

    // 79 单词搜索 回溯
    public boolean exist(char[][] board, String word) {
        this.board = board;

        int[] cnt = new int[128];
        for (char[] r : board)
            for (char c : r)
                cnt[c]++;

        char[] w = word.toCharArray();
        int[] wordCnt = new int[128];
        for (char c : w) {
            if (++wordCnt[c] > cnt[c]) {
                return false;
            }
        }

        if (cnt[w[w.length - 1]] < cnt[w[0]]) {
            words = new StringBuilder(word).reverse().toString().toCharArray();
        }else
            words = word.toCharArray();

        for (int i = 0; i < board.length; i++)
            for (int j = 0; j < board[0].length; j++)
                if (reverse(i, j, 0))
                    return true;
        return false;
    }

    private boolean reverse(int i, int j, int len) {
        if (board[i][j] != words[len])
            return false;
        if (len == words.length - 1)
            return true;
        board[i][j] = 0;
        for (int[] dir : DIR) {
            int ti = i + dir[0];
            int tj = j + dir[1];
            if (ti >= 0 && ti < board.length && tj >= 0 && tj < board[0].length && reverse(ti, tj, len + 1))
                return true;
        }
        board[i][j] = words[len];
        return false;
    }
*/

/*
    private final List<List<String>> ans = new ArrayList<>();
    private final List<String> path = new ArrayList<>();
    private String s;

    // 131 分割回文串 回溯
    public List<List<String>> partition(String s) {
        this.s = s;
        reverse(0, 0);
        return ans;
    }

    private void reverse(int i, int start) {
        if (i == s.length()) {
            ans.add(new ArrayList<>(path));
            return;
        }

        if (i < s.length() - 1)
            reverse(i + 1, start);

        if (check(start, i)) {
            path.add(s.substring(start, i + 1));
            reverse(i + 1, i + 1);
            path.remove(path.size() - 1);
        }
    }

    private boolean check(int left, int right) {
        while (left < right)
            if (s.charAt(left++) != s.charAt(right--))
                return false;
        return true;
    }
*/

    @Test
    public void test() {
    }
}
