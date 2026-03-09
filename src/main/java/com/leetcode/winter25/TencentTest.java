package com.leetcode.winter25;

import org.junit.Test;

import java.util.*;

/**
 * @author HuangChunXin
 * @date 2026/3/9 09:18
 */
public class TencentTest {

/*
	// 146. LRU 缓存
	class LRUCache {

		private int capacity;
		private Node head, tail;
		private Map<Integer, Node> map;

		class Node {
			private int key, val;
			private Node pre, next;

			public Node(int k, int v) {
				key = k;
				val = v;
			}
		}

		public LRUCache(int capacity) {
			this.capacity = capacity;
			head = new Node(0, 0);
			tail = new Node(0, 0);
			head.next = tail;
			tail.pre = head;
			map = new HashMap<>();
		}

		public int get(int key) {
			if (!map.containsKey(key)) {
				return -1;
			}
			Node node = map.get(key);
			moveToHead(node);
			return node.val;
		}

		public void put(int key, int value) {
			if (map.containsKey(key)) {
				Node node = map.get(key);
				node.val = value;
				moveToHead(node);
			} else {
				if (map.size() == capacity) {
					map.remove(tail.pre.key);
					removeNode(tail.pre);
				}
				Node newNode = new Node(key, value);
				map.put(key, newNode);
				addToHead(newNode);
			}
		}

		private void removeNode(Node node) {
			node.pre.next = node.next;
			node.next.pre = node.pre;
		}

		private void addToHead(Node node) {
			node.next = head.next;
			node.pre = head;
			head.next.pre = node;
			head.next = node;
		}

		private void moveToHead(Node node) {
			removeNode(node);
			addToHead(node);
		}
	}
*/

/*
	// 3. 无重复字符的最长子串
	public int lengthOfLongestSubstring(String s) {
		int ans = 0;
		int[] map = new int[128];
		int pos = 0;
		char[] chars = s.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			char c = s.charAt(i);
			map[c]++;
			while (map[c] > 1) {
				map[s.charAt(pos++)]--;
			}
			ans = Math.max(ans, i - pos + 1);
		}
		return ans;
	}
*/

/*
	// 20. 有效的括号 栈
	public boolean isValid(String s) {
		char[] left = new char[128];
		char[] right = new char[128];
		left['('] = ')';
		left['{'] = '}';
		left['['] = ']';
		right[')'] = '(';
		right['}'] = '{';
		right[']'] = '[';
		Stack<Character> stack = new Stack<>();
		for (char c : s.toCharArray()) {
			if (left[c] != 0) {
				stack.push(c);
			} else if(stack.isEmpty() || stack.pop() != right[c]) {
				return false;
			}
		}
		return stack.isEmpty();
	}
*/

/*
	// 704. 二分查找
	public int search(int[] nums, int target) {
		int len = nums.length;
		int l = 0, r = len - 1;
		while (l <= r) {
			int mid = l + (r-l)/2;
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return -1;
	}
*/

/*
	// LCR 121. 寻找目标值 Z 字形查找
	public boolean findTargetIn2DPlants(int[][] plants, int target) {
		if (plants == null || plants.length == 0 || plants[0].length == 0) {
			return false;
		}
		int m = plants.length, n = plants[0].length;
		int i = 0, j = n - 1;
		while (i < m && j >= 0) {
			if (plants[i][j] == target) {
				return true;
			} else if (plants[i][j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return false;
	}
*/

/*
	// 92 反转链表 II
	public ListNode reverseBetween(ListNode head, int left, int right) {
		ListNode dummy = new ListNode(0, head);
		ListNode lHead = dummy;
		for (int i = 0; i < left - 1; i++) {
			lHead = lHead.next;
		}
		ListNode rHead = lHead;
		for (int i = left - 1; i < right; i++) {
			rHead = rHead.next;
		}
		ListNode tail = rHead.next;
		rHead.next = null;
		lHead.next = reverse(lHead.next);
		while (lHead.next != null) {
			lHead = lHead.next;
		}
		lHead.next = tail;
		return dummy.next;
	}

	private ListNode reverse(ListNode head) {
		ListNode pre = null, cur = head;
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
	// 54. 螺旋矩阵
	public List<Integer> spiralOrder(int[][] matrix) {
		int m = matrix.length, n = matrix[0].length;
		int left = 0, top = 0, right = n - 1, down = m - 1;
		List<Integer> list = new LinkedList<>();
		while (true) {
			for (int i = left; i <= right; i++) {
				list.addLast(matrix[top][i]);
			}
			if (++top > down) {
				break;
			}
			for (int i = top; i <= down; i++) {
				list.addLast(matrix[i][right]);
			}
			if (--right < left) {
				break;
			}
			for (int i = right; i >= left; i--) {
				list.addLast(matrix[down][i]);
			}
			if (--down < top) {
				break;
			}
			for (int i = down; i >= top; i--) {
				list.addLast(matrix[i][left]);
			}
			if (++left > right) {
				break;
			}
		}
		return list;
	}
*/

/*
	// 215. 数组中的第K个最大元素
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int num : nums) {
			if (pq.size() < k) {
				pq.offer(num);
			} else {
				if (num > pq.peek()) {
					pq.poll();
					pq.offer(num);
				}
			}
		}
		return pq.peek();
	}
*/

/*
	// 523. 连续的子数组和
	public boolean checkSubarraySum(int[] nums, int k) {
		HashMap<Integer, Integer> map = new HashMap<>();
		map.put(0, -1);
		int pre = 0;
		for (int i = 0; i < nums.length; i++) {
			pre += nums[i];
			int rem = pre % k;
			if (map.containsKey(rem)) {
				int preIndex = map.get(rem);
				if (i - preIndex >= 2) {
					return true;
				}
			} else {
				map.put(rem, i);
			}
		}
		return false;
	}
*/

/*
	// 53. 最大子数组和
	public int maxSubArray(int[] nums) {
		int ans = Integer.MIN_VALUE;
		int sum = 0;
		for (int num : nums) {
			sum += num;
			ans = Math.max(ans, sum);
			if (sum < 0) {
				sum = 0;
			}
		}
		return ans;
	}
*/

/*
	// 128. 最长连续序列
	public int longestConsecutive(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}
		int ans = 0;
		for (int num : set) {
			if (set.contains(num - 1)) {
				continue;
			}
			int y = num + 1;
			while (set.contains(y)) {
				y++;
			}
			ans = Math.max(ans, y - num);
		}
		return ans;
	}
*/

/*
	// 349. 两个数组的交集
	public int[] intersection(int[] nums1, int[] nums2) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : nums1) {
			set.add(num);
		}

		LinkedList<Integer> list = new LinkedList<>();
		for (int num : nums2) {
			if (set.remove(num)) {
				list.add(num);
			}
		}

		int[] ans = new int[list.size()];
		for (int i = 0; i < list.size(); i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}
*/

/*
	// 468. 验证IP地址
	public String validIPAddress(String queryIP) {
		boolean flag = false;
		for (int i = 0; i < queryIP.length(); i++) {
			if (queryIP.charAt(i) == '.') {
				flag = true;
				break;
			} else if (queryIP.charAt(i) == ':') {
				flag = false;
				break;
			}
		}

		if (!flag) {
			// ipv6
			String[] split = queryIP.split(":", -1);
			if (split.length != 8) {
				return "Neither";
			}
			for (String s : split) {
				if (s.length() > 4 || s.isEmpty()) {
					return "Neither";
				}
				for (char c : s.toCharArray()) {
					if (!((c >= '0' && c <= '9') || (c >= 'a' && c <= 'f') || (c >= 'A' && c <= 'F'))) {
						return "Neither";
					}
				}
			}
			return "IPv6";
		} else {
			// ipv4
			String[] split = queryIP.split("\\.", -1);
			if (split.length != 4) {
				return "Neither";
			}
			for (String s : split) {
				if (s.isEmpty()) {
					return "Neither";
				}
				try {
					int num = Integer.parseInt(s);
					if (num > 255 || !String.valueOf(num).equals(s)) {
						return "Neither";
					}
				} catch (Exception e) {
					return "Neither";
				}
			}
			return "IPv4";
		}
	}
*/

/*
	// 快速排序
	public static void quickSort(int[] nums, int left, int right) {
		if (left < right) {
			int pivot = partition(nums, left, right);
			quickSort(nums, left, pivot - 1);
			quickSort(nums, pivot + 1, right);
		}
	}

	private static int partition(int[] nums, int left, int right) {
		int pivot = nums[left];
		int l = left, r = right;
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

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int len = 5;
		int[] nums = new int[len];
		for (int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		System.out.println(Arrays.toString(nums));
		quickSort(nums, 0 , len - 1);
		System.out.println(Arrays.toString(nums));
	}
*/

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

	@Test
	public void test() {
	}
}
