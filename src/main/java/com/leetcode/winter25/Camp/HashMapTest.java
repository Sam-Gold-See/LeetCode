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

/*
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
*/

/*
	// 454. 四数相加 II
	public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int a : nums1) {
			for (int b : nums2) {
				map.put(a + b, map.getOrDefault(a + b, 0) + 1);
			}
		}

		int ans = 0;
		for (int c : nums3) {
			for (int d : nums4) {
				ans += map.getOrDefault(-(c + d), 0);
			}
		}
		return ans;
	}
*/

/*
	// 383. 赎金信
	public boolean canConstruct(String ransomNote, String magazine) {
		int[] map = new int[128];
		for (char c : magazine.toCharArray()) {
			map[c]++;
		}

		for (char c : ransomNote.toCharArray()) {
			if (map[c] < 1) {
				return false;
			} else {
				map[c]--;
			}
		}
		return true;
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
					long sum =(long) a + b + c + d;
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
	// 102. 二叉树的层序遍历
	public List<List<Integer>> levelOrder(TreeNode root) {
		List<List<Integer>> ans = new ArrayList<>();
		if (root != null) {
			Deque<TreeNode> deque = new ArrayDeque<>();
			deque.offerLast(root);
			while (!deque.isEmpty()) {
				int size = deque.size();
				List<Integer> temp = new LinkedList<>();
				while (size-- > 0) {
					TreeNode node = deque.pollFirst();
					if (node.left != null) {
						deque.offerLast(node.left);
					}
					if (node.right != null) {
						deque.offerLast(node.right);
					}
					temp.addLast(node.val);
				}
				ans.add(temp);
			}
		}
		return ans;
	}
*/

/*
	// 33. 搜索旋转排序数组
	public int search(int[] nums, int target) {
		int l = 0, r = nums.length - 1;
		while (l <= r) {
			int mid = l + (r - l) /2;
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

/*
	// 20. 有效的括号
	public boolean isValid(String s) {
		int[] left = new int[128];
		left['('] = ')';
		left['['] = ']';
		left['{'] = '}';
		int[] right = new int[128];
		right[')'] = '(';
		right[']'] = '[';
		right['}'] = '{';
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (left[c] != 0) {
				stack.push(c);
			} else if (stack.isEmpty() || stack.pop() != right[c]) {
				return false;
			}
		}
		return stack.isEmpty();
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
