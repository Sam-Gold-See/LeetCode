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

    @Test
    public void test() {
    }
}
