package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

public class ArrayTest {

/*
    // 53 最大子数组和 滑动窗口
    public int maxSubArray(int[] nums) {
        int n = nums.length;
        int ans = nums[0];
        int l = 0, sum = nums[0];
        for (int r = 1; r < n; r++) {
            sum += nums[r];
            while (l < r && sum < nums[r])
                sum -= nums[l++];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
*/

/*
    // 56 合并区间 队列模拟
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        List<int[]> list = new ArrayList<>();
        int pos = -1;
        for (int[] interval : intervals) {
            if (pos >= 0 && interval[0] <= list.get(pos)[1])
                list.get(pos)[1] = Math.max(list.get(pos)[1], interval[1]);
            else {
                list.add(interval);
                pos++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
*/

/*
    // 189 轮转数组 模拟
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
*/

/*
    // 238 除自身以外数组的乘积 前缀和
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = 1;
        int[] suf = new int[n];
        suf[n - 1] = 1;
        for (int i = 1; i < n; i++)
            pre[i] = pre[i - 1] * nums[i - 1];
        for (int i = n - 2; i >= 0; i--)
            suf[i] = suf[i + 1] * nums[i + 1];

        for (int i = 0; i < n; i++)
            nums[i] = pre[i] * suf[i];
        return nums;
    }
*/

/*
    // 238 除自身以外数组的乘积 前缀和
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] suf = new int[n];
        suf[n - 1] = 1;

        for (int i = n - 2; i >= 0; i--)
            suf[i] = suf[i + 1] * nums[i + 1];

        int pre = 1;
        for (int i = 0; i < n; i++) {
            suf[i] *= pre;
            pre *= nums[i];
        }
        return suf;
    }
*/

    @Test
    public void test() {
    }
}
