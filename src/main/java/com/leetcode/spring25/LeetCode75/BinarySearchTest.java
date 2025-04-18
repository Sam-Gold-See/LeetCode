package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

public class BinarySearchTest {

/*
    private int guess(int num) {
        return num;
    }

    // 374 猜数字大小 二分查找
    public int guessNumber(int n) {
        int l = 1, r = n;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (guess(mid) <= 0)
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
*/

/*
    // 2300 咒语和药水的成功对数 二分查找
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        int len1 = spells.length;
        int len2 = potions.length;
        int[] ans = new int[len1];
        Arrays.sort(potions);
        for (int i = 0; i < len1; i++) {
            int num = spells[i];
            int l = 0, r = len2 - 1;
            while (l <= r) {
                int mid = l + (r - l) / 2;
                long res = (long) num * potions[mid];
                if(res < success)
                    l = mid + 1;
                else
                    r = mid - 1;
            }
            ans[i] = len2 - l;
        }
        return ans;
    }
*/

/*
    // 162 寻找峰值 二分查找
    public int findPeakElement(int[] nums) {
        int len = nums.length;
        if (len == 1)
            return 0;
        int l = 0, r = len - 1;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] > nums[mid + 1])
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
*/

/*
    // 875 爱吃香蕉的珂珂 二分查找
    public int minEatingSpeed(int[] piles, int h) {
        int left = 0, right = 0;
        for (int pile : piles)
            right = Math.max(right, pile);
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (judge(piles, mid, h))
                right = mid;
            else
                left = mid + 1;
        }
        return left;
    }

    public boolean judge(int[] piles, int k, int h) {
        int cnt = 0;
        for (int pile : piles)
            cnt += Math.ceil(pile / (double) k);
        return cnt <= h;
    }
*/

    @Test
    public void test() {
    }
}
