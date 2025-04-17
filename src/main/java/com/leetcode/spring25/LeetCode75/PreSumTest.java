package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

public class PreSumTest {

/*
    // 1732 找到最高海拔 模拟
    public int largestAltitude(int[] gains) {
        int result = 0;
        int pos = 0;
        for(int gain : gains){
            pos += gain;
            result = Math.max(result, pos);
        }
        return result;
    }
*/

/*
    // 724 寻找数组的中心下标 前缀和
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int[] pre = new int[len];
        pre[0] = nums[0];
        int[] suf = new int[len];
        suf[len - 1] = nums[len - 1];
        for (int i = 1; i < len; i++) {
            pre[i] = pre[i - 1] + nums[i];
        }
        for (int i = len - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] + nums[i];
        }
        for (int i = 0; i < len; i++) {
            if (pre[i] == suf[i])
                return i;
        }
        return -1;
    }
*/

/*
    // 724 寻找数组的中心下标 优化
    public int pivotIndex(int[] nums) {
        int sum = 0;
        for (int num : nums)
            sum += num;
        int pre = 0;
        for (int i = 0; i < nums.length; i++)
            if (2 * pre == sum - nums[i])
                return i;
            else
                pre += nums[i];
        return -1;
    }
*/

    @Test
    public void test() {

    }
}
