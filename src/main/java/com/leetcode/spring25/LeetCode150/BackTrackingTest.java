package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

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

    @Test
    public void test() {
    }
}
