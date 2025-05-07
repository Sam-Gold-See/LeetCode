package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

public class MathTest {

/*
    // 9 回文数 数学 模拟
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        char[] chars = String.valueOf(x).toCharArray();
        int l = 0, r = chars.length - 1;
        while (l < r)
            if (chars[l++] != chars[r--])
                return false;
        return true;
    }
*/

/*
    // 66 加一 数学 模拟
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            digits[i]++;
            digits[i] %= 10;
            if (digits[i] != 0)
                return digits;
        }
        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }
*/

/*
    // 172 阶乘后的零 数学
    public int trailingZeroes(int n) {
        return n == 0 ? 0 : n / 5 + trailingZeroes(n / 5);
    }
*/

/*
    // 69 x 的平方根 数学 二分查找
    public int mySqrt(int x) {
        int l = 0, r = x, ans = -1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if ((long) mid * mid <= x) {
                ans = mid;
                l = mid + 1;
            } else
                r = mid - 1;
        }
        return ans;
    }
*/

/*
    // 50 快速幂 数学 递归
    public double myPow(double x, int n) {
        return n >= 0 ? quickPow(x, n) : 1.0 / quickPow(x, -n);
    }

    public double quickPow(double x, int n) {
        if (n == 0)
            return 1.0;
        double y = quickPow(x, n / 2);
        return n % 2 == 0 ? y * y : y * y * x;
    }
*/

    @Test
    public void test() {
    }
}
