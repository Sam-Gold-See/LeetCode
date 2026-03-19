package com.leetcode.winter25.Camp;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/3/18 09:47
 */
public class ArrayTest {

	// 704. 二分查找
	public int search(int[] nums, int target) {
		int left = 0, len = nums.length, right = len - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				right = mid - 1;
			} else {
				left = mid + 1;
			}
		}
		return -1;
	}

/*
	// 27. 移除元素
	public int removeElement(int[] nums, int val) {
		int len = nums.length;
		int l = 0;
		for (int i = 0; i < len; i++) {
			if (nums[i] != val) {
				nums[l++] = nums[i];
			}
		}
		return l;
	}
*/

/*
	// 977. 有序数组的平方
	public int[] sortedSquares(int[] nums) {
		int len = nums.length;
		int negative = -1;
		for (int i = 0; i < len; i++) {
			if (nums[i] < 0) {
				negative = i;
			} else {
				break;
			}
		}

		int[] ans = new int[len];
		int index = 0, i = negative, j = negative + 1;
		while (i >= 0 || j < len) {
			if (i < 0) {
				ans[index] = nums[j] * nums[j];
				++j;
			} else if (j == len) {
				ans[index] = nums[i] * nums[i];
				--i;
			} else if (nums[i] * nums[i] < nums[j] * nums[j]) {
				ans[index] = nums[i] * nums[i];
				--i;
			} else {
				ans[index] = nums[j] * nums[j];
				++j;
			}
			index++;
		}
		return ans;
	}
*/

/*
	// 3. 无重复字符的最长子串
	public int lengthOfLongestSubstring(String s) {
		int[] map = new int[128];
		int l = 0, len = s.length(), r = 0;
		int ans = 0;
		char[] chars = s.toCharArray();
		while (r < len) {
			char c = chars[r];
			map[c]++;
			while (l < r && map[c] > 1) {
				map[chars[l]]--;
				l++;
			}
			ans = Math.max(ans, r - l + 1);
			r++;
		}
		return ans;
	}
*/

/*
	// 206. 反转链表
	public ListNode reverseList(ListNode head) {
		ListNode pre = null, cur  = head;
		while (cur != null) {
			ListNode temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		return pre;
	}
*/

/*
	// 146. LRU 缓存
	class LRUCache {

		class Node {
			private int key;
			private int value;
			private Node pre;
			private Node nxt;
			public Node(int k, int v) {
				key = k;
				value = v;
			}
		}

		private Node head, tail;
		private Map<Integer, Node> map;
		private int capacity;

		public LRUCache(int capacity) {
			map = new HashMap<>(capacity);
			this.capacity = capacity;
			head = new Node(-1, -1);
			tail = new Node(-1, -1);
			head.nxt = tail;
			tail.pre = head;
		}

		public int get(int key) {
			if (!map.containsKey(key)) {
				return -1;
			}
			Node node = map.get(key);
			removeNode(node);
			pushHead(node);
			return node.value;
		}

		public void put(int key, int value) {
			if (map.containsKey(key)) {
				Node node = map.get(key);
				node.value = value;
				removeNode(node);
				pushHead(node);
			} else {
				if (map.size() == capacity) {
					Node last = tail.pre;
					map.remove(last.key);
					removeNode(last);
				}
				Node node = new Node(key, value);
				map.put(key, node);
				pushHead(node);
			}
		}

		private void removeNode(Node node) {
			node.pre.nxt = node.nxt;
			node.nxt.pre = node.pre;
		}

		private void pushHead(Node node) {
			node.nxt = head.nxt;
			node.pre = head;
			head.nxt.pre = node;
			head.nxt = node;
		}
	}
*/

/*
	// 2383. 赢得比赛需要的最少训练时长
	public int minNumberOfHours(int curEng, int curExp, int[] energy, int[] experience) {
		int ans = 0, n = energy.length;
		for (int i = 0; i < n; i++) {
			int eng = energy[i];
			if (curEng <= eng) {
				ans += eng + 1 - curEng;
				curEng = eng + 1;
			}
			curEng -= eng;

			int exp = experience[i];
			if (curExp <= exp) {
				ans += exp + 1 - curExp;
				curExp = exp + 1;
			}
			curExp += exp;
		}
		return ans;
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
