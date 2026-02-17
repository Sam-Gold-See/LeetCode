package com.leetcode.winter25;

import org.junit.Test;

import java.util.*;

/**
 * @author HuangChunXin
 * @date 2026/2/26 15:34
 */
public class ByteDanceTest {

/*
	// 快速排序
	public static void quickSort(int[] nums, int left, int right) {
		 if (left < right){
			int pivot = partition(nums, left, right);

			quickSort(nums, left, pivot - 1);

			quickSort(nums, pivot + 1, right);
		}
	}

	private static int partition(int[] nums, int left, int right) {
		int pivot = nums[left];
		int l = left;
		int r = right;
		while (l < r) {
			while (l < r && pivot <= nums[r]) {
				r--;
			}
			nums[l] = nums[r];
			while (l < r && nums[l] <= pivot) {
				l++;
			}
			nums[r] = nums[l];
		}
		nums[l] = pivot;
		return l;
	}

	public static void main(String[] args) {
		int len = 10;
		int[] nums = new int[len];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(nums));

		quickSort(nums, 0, len - 1);

		System.out.println(Arrays.toString(nums));
	}
*/

/*
	// 3. 无重复字符的最长子串 滑动窗口
	public int lengthOfLongestSubstring(String s) {
		int ans = 0;
		int l = 0, r = 0;
		int[] map = new int[128];
		while (r < s.length()) {
			char pos = s.charAt(r);
			map[pos]++;
			while (map[pos] > 1) {
				map[s.charAt(l++)]--;
			}
			ans = Math.max(ans, r - l + 1);
			r++;
		}
		return ans;
	}
*/

/*
	// 146. LRU 缓存
	class LRUCache {

		private Map<Integer, Integer> map;
		private int capacity;

		public LRUCache(int capacity) {
			map = new LinkedHashMap<>();
			this.capacity = capacity;
		}

		public int get(int key) {
			Integer value = map.remove(key);
			if (value != null) {
				map.put(key, value);
				return value;
			}
			return -1;
		}

		public void put(int key, int value) {
			if (map.remove(key) != null) {
				map.put(key, value);
				return;
			}

			if(map.size() == capacity) {
				Integer eldestKey = map.keySet().iterator().next();
				map.remove(eldestKey);
			}
			map.put(key, value);
		}
	}
*/

/*
	// 146. LRU 缓存
	class LRUCache {

		class Node {
			int key, value;
			Node prev, next;

			Node(int k, int v) {
				key = k;
				value = v;
			}
		}

		private int capacity;
		private Map<Integer, Node> map;
		private Node head, tail;

		public LRUCache(int capacity) {
			this.capacity = capacity;
			map = new HashMap<>();
			head = new Node(0, 0);
			tail = new Node(0, 0);
			head.next = tail;
			tail.prev = head;
		}

		public int get(int key) {
			if (!map.containsKey(key)) {
				return -1;
			}
			Node node = map.get(key);
			moveToHead(node);
			return node.value;
		}

		public void put(int key, int value) {
			if (map.containsKey(key)) {
				Node node = map.get(key);
				node.value = value;
				moveToHead(node);
			} else {
				if (map.size() == capacity) {
					map.remove(tail.prev.key);
					removeNode(tail.prev);
				}
				Node newNode = new Node(key, value);
				map.put(key, newNode);
				addToHead(newNode);
			}
		}

		private void moveToHead(Node node) {
			removeNode(node);
			addToHead(node);
		}

		private void removeNode(Node node) {
			node.prev.next = node.next;
			node.next.prev = node.prev;
		}

		private void addToHead(Node node) {
			node.next = head.next;
			node.prev = head;
			head.next.prev = node;
			head.next = node;
		}
	}
*/

/*
	// 归并排序
	public static void mergeSort(int[] nums, int left, int right, int[] temp) {
		if (left < right) {
			int mid = left + (right - left) / 2;
			mergeSort(nums, left, mid, temp);
			mergeSort(nums, mid + 1, right, temp);
			merge(nums, left, mid, right, temp);
		}
	}

	private static void merge(int[] nums, int left, int mid, int right, int[] temp) {
		int i = left;
		int j = mid + 1;
		int pos = left;

		while (i <= mid && j <= right) {
			if (nums[i] <= nums[j]) {
				temp[pos++] = nums[i++];
			} else {
				temp[pos++] = nums[j++];
			}
		}

		while (i <= mid) {
			temp[pos++] = nums[i++];
		}
		while (j <= right) {
			temp[pos++] = nums[j++];
		}

		pos = 0;
		while (left <= right) {
			nums[left++] = temp[pos++];
		}
	}

	public static void main(String[] args) {
		int len = 10;
		int[] nums = new int[len];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}
		int[] temp = new int[len];

		System.out.println(Arrays.toString(nums));

		mergeSort(nums, 0, len - 1, temp);

		System.out.println(Arrays.toString(nums));
	}
*/

/*
	// 300 最长递增子序列 DP
	public int lengthOfLIS(int[] nums) {
		int len = nums.length;
		int[] dp = new int[len];
		Arrays.fill(dp, 1);
		int ans = 1;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]){
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			ans = Math.max(dp[i], ans);
		}
		return ans;
	}
*/

/*
	// 121. 买卖股票的最佳时机 贪心
	public int maxProfit(int[] prices) {
		int ans = 0, cost = Integer.MAX_VALUE;
		for (int price : prices) {
			cost = Math.min(cost, price);
			ans = Math.max(ans, price - cost);
		}
		return ans;
	}
*/

/*
	// 25. K 个一组翻转链表 模拟
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode pre = dummy;
		ListNode end = dummy;

		while (end.next != null) {
			for (int i = 0; i < k && end != null; i++) {
				end = end.next;
			}
			if (end == null) {
				break;
			}
			ListNode start = pre.next;
			ListNode next = end.next;
			end.next = null;
			pre.next = reverse(start);
			start.next = next;
			pre = start;
			end = pre;
		}
		return dummy.next;
	}

	private ListNode reverse(ListNode head) {
		ListNode pre = null;
		ListNode curr = head;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = pre;
			pre = curr;
			curr = next;
		}
		return pre;
	}
*/

/*
	// 103. 二叉树的锯齿形层序遍历 BFS
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ans = new LinkedList<>();
		Deque<TreeNode> deque = new ArrayDeque<>();
		if (root == null) {
			return ans;
		}
		deque.offerLast(root);
		boolean leftFirst = true;
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
				if (leftFirst) {
					temp.addLast(node.val);
				} else {
					temp.addFirst(node.val);
				}
			}
			leftFirst = !leftFirst;
			ans.add(temp);
		}
		return ans;
	}
*/

/*
	// 162. 寻找峰值 二分
	public int findPeakElement(int[] nums) {
		int n = nums.length;
		if (n == 1) {
			return 0;
		}
		int l = 0, r = n - 2;
		while (l <= r) {
			int mid = l + (r - l) / 2;
			if (nums[mid] >= nums[mid + 1]) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}
		return l;
	}
*/

/*
	// 215. 数组中的第K个最大元素 优先队列
	public int findKthLargest(int[] nums, int k) {
		PriorityQueue<Integer> pq = new PriorityQueue<>();
		for (int num : nums) {
			if (pq.size() < k) {
				pq.offer(num);
			} else {
				Integer topNum = pq.peek();
				if (num > topNum) {
					pq.poll();
					pq.offer(num);
				}
			}
		}
		return pq.peek();
	}
*/

/*
	// 226. 翻转二叉树 递归
	public TreeNode invertTree(TreeNode root) {
		if (root ==null) {
			return null;
		}
		TreeNode temp = invertTree(root.right);
		root.right = invertTree(root.left);
		root.left = temp;
		return root;
	}
*/

/*
	// 206. 反转链表 模拟
	public ListNode reverseList(ListNode head) {
		ListNode pre = null;
		ListNode cur = head;
		while (cur != null) {
			ListNode next = cur.next;
			cur.next = pre;
			pre = cur;
			cur = next;
		}
		return pre;
	}
*/

/*
	// 151. 反转字符串中的单词 模拟
	public String reverseWords(String s) {
		s = s.trim();
		int r = s.length() - 1;
		int l = r;
		StringBuilder sb = new StringBuilder();
		while (l >= 0) {
			while (l >= 0 && s.charAt(l) != ' ') {
				l--;
			}
			sb.append(s, l + 1, r + 1).append(' ');
			while (l >= 0 && s.charAt(l) == ' ') {
				l--;
			}
			r = l;
		}
		return sb.toString().trim();
	}
*/

/*
	// 46. 全排列 DFS
	private int[] nums;
	private boolean[] bool;
	private LinkedList<Integer> builder;
	private List<List<Integer>> ans;

	public List<List<Integer>> permute(int[] nums) {
		this.nums = nums;
		bool = new boolean[nums.length];
		builder = new LinkedList<>();
		ans = new LinkedList<>();
		dfs(0);
		return ans;
	}

	private void dfs(int pos) {
		if (pos == nums.length) {
			ans.add(new ArrayList<>(builder));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (!bool[i]) {
				bool[i] = true;
				builder.offerLast(nums[i]);
				dfs(pos + 1);
				builder.pollLast();
				bool[i] = false;
			}
		}
	}
*/

/*
	// 1367. 二叉树中的链表 DFS
	private ListNode head;

	public boolean isSubPath(ListNode head, TreeNode root) {
		this.head = head;
		return dfs(head, root);
	}

	private boolean dfs(ListNode cur, TreeNode root) {
		if (cur == null) {
			return true;
		}
		if (root == null) {
			return false;
		}
		return root.val == cur.val && (dfs(cur.next, root.left) || dfs(cur.next, root.right)) ||
				cur == head && (dfs(head, root.left) || dfs(head, root.right));
	}
*/

/*
	// 105. 从前序与中序遍历序列构造二叉树
	private int[] preorder;
	private Map<Integer, Integer> dic = new HashMap<>();

	public TreeNode buildTree(int[] preorder, int[] inorder) {
		this.preorder = preorder;
		for (int i = 0; i < inorder.length; i++) {
			dic.put(inorder[i], i);
		}
		return build(0, 0, inorder.length - 1);
	}

	private TreeNode build(int root, int left, int right) {
		if (left > right) {
			return null;
		}
		TreeNode node = new TreeNode(preorder[root]);
		int mid = dic.get(preorder[root]);
		node.left = build(root + 1, left, mid - 1);
		node.right = build(root + mid - left + 1, mid + 1, right);
		return node;
	}
*/

	//
	//
	//
	//
	//
	//

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
