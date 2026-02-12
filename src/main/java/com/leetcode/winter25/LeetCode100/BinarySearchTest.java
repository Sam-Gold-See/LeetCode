package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/2/17 12:26
 */
public class BinarySearchTest {

/*
	// 35. 搜索插入位置 二分查找
	public int searchInsert(int[] nums, int target) {
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] >= target) {
				r  = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}
*/

/*
	// 74. 搜索二维矩阵 二分查找
	public boolean searchMatrix(int[][] matrix, int target) {
		int m = matrix.length, n = matrix[0].length;
		int l = 0, r = m * n - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			int i = mid / n, j = mid % n;
			if (matrix[i][j] == target) {
				return true;
			} else if (matrix[i][j] > target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return false;
	}
*/

/*
	// 34. 在排序数组中查找元素的第一个和最后一个位置 二分查找
	public int[] searchRange(int[] nums, int target) {
		int l = binarySearch(nums, target);
		if (l == nums.length || nums[l] != target) {
			return new int[]{-1, -1};
		}
		int r = binarySearch(nums, target + 1) - 1;
		return new int[]{l, r};
	}

	private int binarySearch(int[] nums, int target) {
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] >= target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}
*/

/*
	// 33. 搜索旋转排序数组 二分查找
	public int search(int[] nums, int target) {
		int n = nums.length;
		int l = 0, r = n - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] == target) {
				return mid;
			}
			if (nums[l] <= nums[mid]) {
				if (nums[l] <= target && target < nums[mid]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			}
			if (nums[mid] <= nums[r]) {
				if (nums[mid] < target && target <= nums[r]) {
					l = mid + 1;
				} else {
					r = mid - 1;
				}
			}
		}
		return -1;
	}
*/

	// 153. 寻找旋转排序数组中的最小值 二分查找
	public int findMin(int[] nums) {
		int n = nums.length;
		int l = 0, r = n - 1;
		if (nums[l] <= nums[r]) {
			return nums[0];
		}
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (mid > 0 && nums[mid] < nums[mid - 1]) {
				return nums[mid];
			}
			if (nums[mid] >= nums[0]) {
				l = mid + 1;
			}else {
				r = mid - 1;
			}
		}
		return nums[l];
	}

	@Test
	public void test() {
	}
}
