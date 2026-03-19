package com.leetcode.winter25.Camp;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * @author HuangChunXin
 * @date 2026/3/18 09:47
 */
public class ArrayTest {

/*
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
*/

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


/*
	// 209. 长度最小的子数组
	public int minSubArrayLen(int target, int[] nums) {
		int ans = Integer.MAX_VALUE;
		int l = 0, r = 0, sum = 0;
		while (r < nums.length) {
			sum += nums[r];
			if (sum >= target) {
				while (sum - nums[l] >= target && l < r) {
					sum -= nums[l++];
				}
				ans = Math.min(ans, r - l + 1);
			}
			r++;
		}
		return ans == Integer.MAX_VALUE ? 0 : ans;
	}
*/

/*
	// 59. 螺旋矩阵 II
	public int[][] generateMatrix(int n) {
		int[][] ans = new int[n][n];
		int pos = 1;
		int top = 0, down = n - 1, left = 0, right = n - 1;
		while (pos <= n * n) {
			for (int j = left; j <= right; j++) {
				ans[top][j] = pos++;
			}
			top++;
			for (int i = top; i <= down; i++) {
				ans[i][right] = pos++;
			}
			right--;
			for (int j = right; j >= left; j--) {
				ans[down][j] = pos++;
			}
			down--;
			for (int i = down; i >= top; i--) {
				ans[i][left] = pos++;
			}
			left++;
		}
		return ans;
	}
*/

/*
	// 35. 搜索插入位置
	public int searchInsert(int[] nums, int target) {
		int l = 0, len = nums.length , r = len - 1;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] == target) {
				return mid;
			}else if (nums[mid] > target) {
				r = mid -1;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}
*/

/*
	// 203. 移除链表元素
	public ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(-1, head);
		ListNode cur = head, pre = dummy;
		while (cur != null) {
			if (cur.val == val) {
				pre.next = cur.next;
				cur = cur.next;
			} else {
				cur = cur.next;
				pre = pre.next;
			}
		}
		return dummy.next;
	}
*/

/*
	// 707. 设计链表
	class MyLinkedList {

		class ListNode {
			int val;
			ListNode next;

			public ListNode(int val) {
				this.val = val;
			}
		}

		int size;
		ListNode head;

		public MyLinkedList() {
			size = 0;
			head = new ListNode(0);
		}

		public int get(int index) {
			if (index < 0 || index >= size) {
				return -1;
			}
			ListNode cur = head;
			for (int i = 0; i <= index; i++) {
				cur = cur.next;
			}
			return cur.val;
		}

		public void addAtHead(int val) {
			addAtIndex(0, val);
		}

		public void addAtTail(int val) {
			addAtIndex(size, val);
		}

		public void addAtIndex(int index, int val) {
			if (index > size) {
				return;
			}
			index = Math.max(0, index);
			size++;
			ListNode pred = head;
			for (int i = 0; i < index; i++) {
				pred = pred.next;
			}
			ListNode toAdd = new ListNode(val);
			toAdd.next = pred.next;
			pred.next = toAdd;
		}

		public void deleteAtIndex(int index) {
			if (index < 0 || index >= size) {
				return;
			}
			size--;
			ListNode pred = head;
			for (int i = 0; i < index; i++) {
				pred = pred.next;
			}
			pred.next = pred.next.next;
		}
	}
*/

/*
	// 5. 最长回文子串
	private int left = 0, right = 0;

	public String longestPalindrome(String s) {
		for (int i = 0; i < s.length(); i++) {
			palindrome(s, i, i + 1);
			palindrome(s, i, i);
		}
		return s.substring(left + 1, right);
	}

	private void palindrome(String s, int l, int r) {
		while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
			l--;
			r++;
		}
		if (r - l + 1 > right - left + 1) {
			right = r;
			left = l;
		}
	}
*/

/*
	// 2389. 和有限的最长子序列
	public int[] answerQueries(int[] nums, int[] queries) {
		int n = nums.length;
		int m = queries.length;
		int[] ans = new int[m];
		Arrays.sort(nums);
		for (int i = 0; i < m; i++) {
			int sum = 0;
			int len = 0;
			while (sum < queries[i] && len < n)
				sum += nums[len++];
			ans[i] = sum > queries[i] ? len - 1 : len;
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
