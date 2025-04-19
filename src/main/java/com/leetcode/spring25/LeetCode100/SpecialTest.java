package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

import java.util.HashSet;

public class SpecialTest {

/*
    // 136 只出现一次的数字 位运算
    public int singleNumber(int[] nums){
        int ans = 0;
        for (int num : nums)
            ans ^= num;
        return ans;
    }
*/

/*
    // 169 多数元素
    public int majorityElement(int[] nums){
        Arrays.sort(nums);
        return nums[nums.length/2];
    }
*/

/*
    // 75 颜色分类
    public void sortColors(int[] nums) {
        int n = nums.length;
        int l = 0, r = n - 1, idx = 0;
        while (idx <= r) {
            if (nums[idx] == 0) swap(nums, l++, idx++);
            else if (nums[idx] == 1) idx++;
            else if (nums[idx] == 2) swap(nums, idx, r--);
        }
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
*/

/*
    // 31 下一个排列
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        int i = n - 2;
        while (i >= 0 && nums[i] >= nums[i + 1])
            i--;

        if (i >= 0) {
            int j = n - 1;
            while (nums[j] <= nums[i])
                j--;
            swap(nums, i, j);
        }
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right)
            swap(nums, left++, right--);
    }
*/

/*
    // 287 寻找重复数 哈希
    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int ans = 0;
        for (int num : nums) {
            if (set.contains(num)) {
                ans = num;
                break;
            }
            else
                set.add(num);
        }
        return ans;
    }
*/

    @Test
    public void test() {
    }
}
