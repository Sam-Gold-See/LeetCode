package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

public class BitOperationTest {

/*
    // 388 比特位计数 位运算
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        for (int i = 1; i <= n; i++)
            res[i] = getCount(i);
        return res;
    }

    public int getCount(int n) {
        int ans = 0;
        for (int i = 0; i < 32; i++)
            ans += (n >> i) & 1;
        return ans;
    }
*/

/*
    // 136 只出现一次的数字 位运算
    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int num : nums)
            ans ^= num;
        return ans;
    }
*/

/*
    // 1318 或运算的最小翻转次数 位运算
    public int minFlips(int a, int b, int c) {
        int opt = 0;
        for (int i = 0; i < 32; i++) {
            int aBit = (a >> i) & 1;
            int bBit = (b >> i) & 1;
            int cBit = (c >> i) & 1;
            if (cBit == 1)
                opt += (aBit == 1 || bBit == 1) ? 0 : 1;
            else
                opt += (aBit == 0 && bBit == 0) ? 0 : aBit + bBit;
        }
        return opt;
    }
*/

    @Test
    public void test() {
    }
}
