package com.leetcode.winter25.Camp;

import org.junit.Test;

import java.util.*;

/**
 * @author HuangChunXin
 * @date 2026/3/20 10:16
 */
public class HashMapTest {

/*
	// 242. 有效的字母异位词
	public boolean isAnagram(String s, String t) {
		if (s.length() != t.length()) {
			return false;
		}
		int[] map = new int[128];
		for (char c : s.toCharArray()) {
			map[c]++;
		}
		for (char c : t.toCharArray()) {
			map[c]--;
		}
		for (int i = 'a'; i <= 'z'; i++) {
			if (map[i] != 0) {
				return false;
			}
		}
		return true;
	}
*/

/*
	// 349. 两个数组的交集
	public int[] intersection(int[] nums1, int[] nums2) {
		int[] map = new int[1001];
		Set<Integer> set = new HashSet<>();
		for (int num : nums1) {
			map[num]++;
		}
		for (int num : nums2) {
			if (map[num] != 0) {
				set.add(num);
			}
		}
		int size = set.size();
		int[] ans = new int[size];
		int pos = 0;
		for (Integer num : set) {
			ans[pos++] = num;
		}
		return ans;
	}
*/

/*
	// 202. 快乐数
	public boolean isHappy(int n) {
		Set<Integer> set = new HashSet<>();
		while (n != 1 && !set.contains(n)) {
			set.add(n);
			n = getNext(n);
		}
		return n == 1;
	}

	private int getNext(int n) {
		int sum = 0;
		while (n > 0) {
			int d = n % 10;
			n /= 10;
			sum += d * d;
		}
		return sum;
	}
*/

/*
	// 53. 最大子数组和
	public int maxSubArray(int[] nums) {
		int ans = Integer.MIN_VALUE;
		int pre = 0;
		for (int num : nums) {
			pre = Math.max(num, pre + num);
			ans = Math.max(ans , pre);
		}
		return ans;
	}
*/

/*
	// 21. 合并两个有序链表
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		if (list1 == null) {
			return list2;
		} else if (list2 == null) {
			return list1;
		} else if (list1.val < list2.val) {
			list1.next = mergeTwoLists(list1.next, list2);
			return list1;
		} else {
			list2.next = mergeTwoLists(list1, list2.next);
			return list2;
		}
	}
*/

/*
	// 1. 两数之和
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int goat = target - nums[i];
			if (map.containsKey(goat)) {
				return new int[]{map.get(goat), i};
			} else {
				map.put(nums[i], i);
			}
		}
		return new int[2];
	}
*/

	// 1615. 最大网络秩
	public int maximalNetworkRank(int n, int[][] roads) {
		boolean[][] connect = new boolean[n][n];
		int[] degree = new int[n];
		for (int[] road : roads) {
			connect[road[0]][road[1]] = true;
			connect[road[1]][road[0]] = true;
			degree[road[0]]++;
			degree[road[1]]++;
		}

		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				int temp = degree[i] + degree[j] - (connect[i][j] ? 1 : 0);
				ans = Math.max(ans, temp);
			}
		}
		return ans;
	}

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
