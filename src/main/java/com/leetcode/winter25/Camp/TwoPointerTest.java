package com.leetcode.winter25.Camp;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @author HuangChunXin
 * @date 2026/3/24 17:20
 */
public class TwoPointerTest {

/*
	// 27. 移除元素
	public int removeElement(int[] nums, int val) {
		int l = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[l++] = nums[i];
			}
		}
		return l;
	}
*/

/*
	// 15. 三数之和
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		int len = nums.length;
		if (len >= 3) {
			for (int i = 0; i < len - 2; i++) {
				if (nums[i] > 0) {
					break;
				}
				if (i > 0 && nums[i] == nums[i - 1]) {
					continue;
				}
				int j = i + 1, k = len - 1;
				while (j < k) {
					int sum = nums[i] + nums[j] + nums[k];
					if (sum == 0) {
						ans.addLast(List.of(nums[i], nums[j], nums[k]));
						while (j < k && nums[j] == nums[j + 1]) {
							j++;
						}
						while (j < k && nums[k] == nums[k - 1]) {
							k--;
						}
						j++;
						k--;
					} else if (sum < 0) {
						j++;
					} else {
						k--;
					}
				}
			}
		}
		return ans;
	}
*/

/*
	// 18. 四数之和
	public List<List<Integer>> fourSum(int[] nums, int target) {
		List<List<Integer>> ans = new LinkedList<>();
		Arrays.sort(nums);
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int a = nums[i];
			if (i > 0 && a == nums[i - 1]) {
				continue;
			}
			for (int j = i + 1; j < n; j++) {
				int b = nums[j];
				if (j > i + 1 && b == nums[j - 1]) {
					continue;
				}
				int l = j + 1, r = n - 1;
				while (l < r) {
					int c = nums[l], d = nums[r];
					long sum = (long) a + b + c + d;
					if (sum > target) {
						r--;
					} else if (sum < target) {
						l++;
					} else {
						ans.add(Arrays.asList(a, b, c, d));
						while (l < r && nums[l] == nums[l + 1]) {
							l++;
						}
						while (l < r && nums[r] == nums[r - 1]) {
							r--;
						}
						l++;
						r--;
					}
				}
			}
		}
		return ans;
	}
*/

/*
	// 88. 合并两个有序数组
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int pos = nums1.length - 1;
		m--;
		n--;
		while (n >= 0) {
			if (m >= 0 && nums1[m] >= nums2[n]) {
				nums1[pos--] = nums1[m--];
			} else {
				nums1[pos--] = nums2[n--];
			}
		}
	}
*/

/*
	// 236. 二叉树的最近公共祖先
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left == null) {
			return right;
		}
		if (right == null) {
			return left;
		}
		return root;
	}
*/

/*
	// 912. 排序数组
	public int[] sortArray(int[] nums) {
		quickSort(nums, 0, nums.length - 1);
		return nums;
	}

	private void quickSort(int[] nums, int left, int right) {
		if (left < right) {
			int pivot = partition(nums, left, right);
			quickSort(nums, left, pivot - 1);
			quickSort(nums, pivot + 1, right);
		}
	}

	private int partition(int[] nums, int left, int right) {
		int pivot = nums[left];
		int l = left;
		int r = right;
		while (l < r) {
			while (l < r && pivot <= nums[r]) {
				r--;
			}
			nums[l] = nums[r];
			while (l < r && pivot >= nums[l]) {
				l++;
			}
			nums[r] = nums[l];
		}
		nums[l] = pivot;
		return l;
	}
*/

/*
	// 2469. 温度转换
	public double[] ConvertTemperature(double celsius) {
		return new double[]{celsius + 273.15, celsius * 1.80 + 32.00};
	}
*/


	@Test
	public void test() {

	}

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}
}
