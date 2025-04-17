package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class BacktrackingTest {

/*
    // 17 电话号码的字母组合 回溯
    private static final String[] MAPPING = new String[]{"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
    private final List<String> result = new ArrayList<>();
    private char[] digits;
    private char[] path;

    public List<String> letterCombinations(String digits) {
        int n = digits.length();
        if (n == 0) return List.of();
        this.digits = digits.toCharArray();
        path = new char[n];
        dfs(0);
        return result;
    }

    private void dfs(int i) {
        if (i == digits.length) {
            result.add(new String(path));
            return;
        }
        for (char c : MAPPING[digits[i] - '0'].toCharArray()) {
            path[i] = c;
            dfs(i + 1);
        }
    }
*/



/*
    // 216 组合总和 III 回溯
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        Deque<Integer> path = new ArrayDeque<>();
        dfs(k, n, 1, path, res);
        return res;
    }

    private void dfs(int k, int resNum, int start, Deque<Integer> path, List<List<Integer>> res) {
        if(resNum < 0)
            return;

        if(k == 0){
            if(resNum == 0){
                res.add(new ArrayList<>(path));
                return;
            }
            return;
        }

        for(int i = start; i <= 9; i++) {
            path.addLast(i);
            dfs(k - 1, resNum - i, i + 1, path, res);
            path.removeLast();
        }
    }
*/

    @Test
    public void test() {

    }
}
