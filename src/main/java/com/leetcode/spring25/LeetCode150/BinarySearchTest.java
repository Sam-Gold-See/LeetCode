package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

public class BinarySearchTest {

/*
    // 35 搜索插入位置 二分查找
    public int searchInsert(int[] nums, int target) {
        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[mid] < target)
                l = mid + 1;
            else
                r = mid - 1;
        }
        return l;
    }
*/

/*
    // 74 搜索二维矩阵 二分查找
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length, n = matrix[0].length;
        int l = 0, r = m * n - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            int num = matrix[mid / n][mid % n];
            if (num == target)
                return true;
            else if (num > target)
                r = mid - 1;
            else
                l = mid + 1;
        }
        return false;
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
    // 33 搜索旋转排序数组 二分查找
    public int search(int[] nums, int target) {
        int len = nums.length;
        if(len == 1)
            return nums[0] == target ? 0 : -1;
        int l = 0, r = len - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (target == nums[mid])
                return mid;
            if (nums[0] <= nums[mid]) {
                if (nums[0] <= target && target < nums[mid])
                    r = mid - 1;
                else
                    l = mid + 1;
            } else {
                if (nums[mid] < target && target <= nums[len - 1])
                    l = mid + 1;
                else
                    r = mid - 1;
            }
        }
        return -1;
    }
*/

/*
    // 34 在排序数组中查找元素的第一个和最后一个位置 二分查找
    public int[] searchRange(int[] nums, int target) {
        int start = search(nums, target);
        if (start == nums.length || nums[start] != target)
            return new int[]{-1, -1};
        int end = search(nums, target + 1) - 1;
        return new int[]{start, end};
    }

    private int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] >= target)
                right = mid - 1;
            else
                left = mid + 1;
        }
        return left;
    }
*/

/*
    // 153 寻找旋转排序数组中的最小值 二分查找
    public int findMin(int[] nums) {
        int len = nums.length;
        if (len == 1) return nums[0];
        int l = 0, r = len - 1;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            if (nums[0] <= nums[mid]) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }
        return l != len ? nums[l] : nums[0];
    }
*/

    @Test
    public void test() {
    }
}
