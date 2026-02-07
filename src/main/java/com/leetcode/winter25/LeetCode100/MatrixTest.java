package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HuangChunXin
 * @date 2026/2/6 09:38
 */
public class MatrixTest {

/*
	// 73. 矩阵置零
	public void setZeroes(int[][] matrix) {
		int m = matrix.length, n = matrix[0].length;
		boolean[] mFlag = new boolean[m];
		boolean[] nFlag = new boolean[n];
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (matrix[i][j] == 0) {
					mFlag[i] = true;
					nFlag[j] = true;
				}
			}
		}
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				if (mFlag[i] || nFlag[j]) {
					matrix[i][j] = 0;
				}
			}
		}
	}
*/

/*
	// 54. 螺旋矩阵 模拟
	public List<Integer> spiralOrder(int[][] matrix) {
		int m = matrix.length, n = matrix[0].length;
		ArrayList<Integer> list = new ArrayList<>(m * n);
		int l = 0, r = n - 1, t = 0, b = m - 1;
		while (true) {
			for (int i = l; i <= r; i++) {
				list.add(matrix[t][i]);
			}
			if (++t > b) break;
			for (int i = t; i <= b; i++) {
				list.add(matrix[i][r]);
			}
			if (--r < l) break;
			for (int i = r; i >= l; i--) {
				list.add(matrix[b][i]);
			}
			if (--b < t) break;
			for (int i = b; i >= t; i--) {
				list.add(matrix[i][l]);
			}
			if (++l > r) break;
		}
		return list;
	}
*/

/*
	// 48. 旋转图像 模拟
	public void rotate(int[][] matrix) {
		int n = matrix.length;
		int[][] temp = new int[n][n];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				temp[i][j] = matrix[i][j];
			}
		}
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				matrix[j][n - 1 - i] = temp[i][j];
			}
		}
	}
*/

/*
	// 240. 搜索二维矩阵 II 二分查找
	public boolean searchMatrix(int[][] matrix, int target) {
		for (int[] nums : matrix) {
			if (binarySearch(nums, target)) {
				return true;
			}
		}
		return false;
	}

	private boolean binarySearch(int[] nums, int target) {
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] == target) {
				return true;
			} else if (nums[mid] > target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return false;
	}
*/

	@Test
	public void test() {
	}
}
