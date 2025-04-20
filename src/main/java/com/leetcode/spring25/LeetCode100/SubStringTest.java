package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

import java.util.HashMap;

public class SubStringTest {

/*
    // 560 和为K的子数组 子串 前缀和 哈希
    public int subarraySum(int[] nums, int k) {
        int sum = 0, ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums){
            map.put(sum, map.getOrDefault(sum, 0) + 1);
            sum += num;
            ans += map.getOrDefault(sum - k, 0);
        }
        return ans;
    }
*/

    @Test
    public void test() {
    }
}
