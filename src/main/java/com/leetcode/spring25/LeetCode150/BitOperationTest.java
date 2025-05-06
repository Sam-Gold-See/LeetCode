package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

public class BitOperationTest {

/*
    // 67 二进制求和 位运算
    public String addBinary(String a, String b) {
        StringBuilder ans = new StringBuilder();
        int res = 0;
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            int sum = res;
            sum += i >= 0 ? a.charAt(i) - '0' : 0;
            sum += j >= 0 ? b.charAt(j) - '0' : 0;
            ans.append(sum % 2);
            res = sum / 2;
        }
        ans.append(res == 1 ? res : "");
        return ans.reverse().toString();
    }
*/

/*
    // 190 颠倒二进制位 位运算
    public int reverseBits(int n) {
        int rev = 0;
        for (int i = 0; i < 32 && n != 0; i++) {
            rev |= (n & 1) << (31 - i);
            n >>>= 1;
        }
        return rev;
    }
*/

/*
    // 191 位1的个数 位运算
    public int hammingWeight(int n) {
        int ans = 0;
        while (n != 0) {
            ans += (n & 1);
            n >>= 1;
        }
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

    @Test
    public void test() {
    }
}
