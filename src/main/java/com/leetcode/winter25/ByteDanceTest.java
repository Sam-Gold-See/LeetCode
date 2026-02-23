package com.leetcode.winter25;

import org.junit.Test;

import java.awt.datatransfer.FlavorListener;
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

/*
	// 450. 删除二叉搜索树中的节点 DFS
	public TreeNode deleteNode(TreeNode root, int key) {
		if (root == null) {
			return null;
		}
		if (root.val == key) {
			if (root.right == null) {
				return root.left;
			}
			if (root.left == null) {
				return root.right;
			}
			TreeNode node = root.left;
			while (node.right != null) {
				node = node.right;
			}
			node.right = root.right;
			return root.left;
		}else if (root.val < key) {
			root.right = deleteNode(root.right, key);
		} else {
			root.left = deleteNode(root.left, key);
		}
		return root;
	}
*/

/*
	// 143. 重排链表 快慢指针
	public void reorderList(ListNode head) {
		ListNode mid = middleNode(head);
		ListNode right = reverseList(mid);
		while (right.next != null) {
			ListNode nextLeft = head.next;
			ListNode nextRight = right.next;

			head.next = right;
			right.next = nextLeft;

			head = nextLeft;
			right = nextRight;
		}
	}

	private ListNode middleNode(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	private ListNode reverseList(ListNode head) {
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
	// 739. 每日温度 单调栈
	public int[] dailyTemperatures(int[] temperatures) {
		int len = temperatures.length;
		int[] ans = new int[len];
		Stack<Integer> stack = new Stack<>();
		for (int i = len - 1; i >= 0; i--) {
			int t  = temperatures[i];
			while (!stack.isEmpty() && t >= temperatures[stack.peek()]) {
				stack.pop();
			}
			if (!stack.isEmpty()) {
				ans[i] = stack.peek() - i;
			}
			stack.push(i);
		}
		return ans;
	}
*/

/*
	// 1162. 地图分析 BFS
	static final int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	int n;
	int[][] grid;

	public int maxDistance(int[][] grid) {
		this.n = grid.length;
		this.grid = grid;
		int ans = -1;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 0) {
					ans = Math.max(ans, findNearestLand(i, j));
				}
			}
		}
		return ans;
	}

	private int findNearestLand(int x, int y) {
		boolean[][] vis = new boolean[n][n];
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[]{x, y, 0});
		vis[x][y] = true;
		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			for (int[] dir : DIR) {
				int tx = now[0] + dir[0], ty = now[1] + dir[1];
				if (tx < 0 || tx >= n || ty < 0 || ty >= n || vis[tx][ty]) {
					continue;
				}
				queue.offer(new int[]{tx, ty, now[2] + 1});
				vis[tx][ty] = true;
				if (grid[tx][ty] == 1) {
					return now[2] + 1;
				}
			}
		}
		return -1;
	}
*/

/*
	// 252. 会议室 https://wyh317.github.io/2021/02/17/252.%E4%BC%9A%E8%AE%AE%E5%AE%A4/#252-%E4%BC%9A%E8%AE%AE%E5%AE%A4
	public boolean canAttendMeetings(int[][] intervals) {
		if (intervals == null || intervals.length == 0) {
			return true;
		}
		Arrays.sort(intervals, (v1, v2) -> (v1[0] - v2[0]));
		for (int i = 0; i < intervals.length; i++) {
			if (i - 1 >= 0 && intervals[i][0] < intervals[i - 1][1])
				return false;
		}
		return true;
	}
*/

/*
	// 253. 会议室 II https://wyh317.github.io/2021/02/17/252.%E4%BC%9A%E8%AE%AE%E5%AE%A4/#253-%E4%BC%9A%E8%AE%AE%E5%AE%A4-II
	public int canAttendMeetings(int[][] intervals) {
		int count = 0;
		if (intervals != null || intervals.length != 0) {
			Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
			PriorityQueue<Integer> pq = new PriorityQueue<>();
			for (int[] meeting : intervals) {
				while (!pq.isEmpty() && meeting[0] > pq.peek()) {
					pq.poll();
				}
				pq.add(meeting[0]);
				count = Math.max(count, pq.size());
			}
		}
		return count;
	}
*/

/*
	// 31. 下一个排列
	public void nextPermutation(int[] nums) {
		int n = nums.length;

		int i = n - 2;
		while (i >= 0 && nums[i] >= nums[i + 1]) {
			i--;
		}

		if (i >= 0) {
			int j = n - 1;
			while (nums[j] <= nums[i]) {
				j--;
			}
			swap(nums, i, j);
		}

		reverse(nums, i + 1, n - 1);
	}

	private void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private void reverse(int[] nums, int start, int end) {
		int left = start, right = end;
		while (left < right) {
			swap(nums, left++, right--);
		}
	}
*/

/*
	// 150. 逆波兰表达式 栈
	public int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();
		Integer op1, op2;
		for (String token : tokens) {
			switch (token) {
				case "+" -> {
					op2 = stack.pop();
					op1 = stack.pop();
					stack.push(op1 + op2);
				}
				case "-" -> {
					op2 = stack.pop();
					op1 = stack.pop();
					stack.push(op1 - op2);
				}
				case "*" -> {
					op2 = stack.pop();
					op1 = stack.pop();
					stack.push(op1 * op2);
				}
				case "/" -> {
					op2 = stack.pop();
					op1 = stack.pop();
					stack.push(op1 / op2);
				}
				default -> stack.push(Integer.valueOf(token));
			}
		}
		return stack.pop();
	}
*/

/*
	// 134. 加油站 贪心
	public int canCompleteCircuit(int[] gas, int[] cost) {
		int ans = 0;
		int minS = 0;
		int s = 0;
		for (int i = 0; i < gas.length; i++) {
			s += gas[i] - cost[i];
			if (s < minS) {
				minS = s;
				ans = i + 1;
			}
		}
		return s < 0 ? -1 : ans;
	}
*/

/*
	// 19. 删除链表的倒数第 N 个结点 双指针
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0, head);
		ListNode l = dummy, r = dummy;
		while (n-- > 0) {
			r = r.next;
		}
		while (r.next != null) {
			l = l.next;
			r = r.next;
		}
		l.next = l.next.next;
		return dummy.next;
	}
*/

/*
	// 695. 岛屿的最大面积 BFS
	private static final int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	public int maxAreaOfIsland(int[][] grid) {
		int m = grid.length, n = grid[0].length;
		int ans = 0;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					ans = Math.max(ans, calculate(grid, i, j, m, n));
				}
			}
		}
		return ans;
	}

	private int calculate(int[][] grid, int x, int y, int m, int n) {
		Deque<int[]> deque = new ArrayDeque<>();
		deque.offerLast(new int[]{x, y});
		int size = 0;
		grid[x][y] = 0;
		while (!deque.isEmpty()) {
			size++;
			int[] pos = deque.pollFirst();
			for (int[] dir : DIR) {
				int tx = pos[0] + dir[0], ty = pos[1] + dir[1];
				if (tx < 0 || tx >= m || ty < 0 || ty >= n || grid[tx][ty] == 0) {
					continue;
				}
				grid[tx][ty] = 0;
				deque.offerLast(new int[]{tx, ty});
			}
		}
		return size;
	}
*/

/*
	// 234. 回文链表 快慢指针
	public boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null) {
			return true;
		}
		ListNode fast = head;
		ListNode slow = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
		}
		ListNode list2 = reverseList(slow);
		while (list2 != null) {
			if (list2.val != head.val) {
				return false;
			}
			list2 = list2.next;
			head = head.next;
		}
		return true;
	}

	private ListNode reverseList(ListNode head){
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
	// 扑克牌中的顺子数 https://blog.csdn.net/qq_39172845/article/details/124714355
	public boolean isStraight(int[] nums) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		HashSet<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (num == 0) {
				continue;
			}
			if (set.contains(num)) {
				return false;
			}
			set.add(num);
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		return max - min < 5;
	}
*/

/*
	// 选择排序
	private static void selectSort(int[] nums) {
		int len = nums.length;
		for (int i = 0; i < len; i++) {
			int k = i;
			for (int j = i+1; j < len; j++) {
				if (nums[j] < nums[k]) {
					k = j;
				}
			}
			swap(nums, i, k);
		}
	}

	private static void swap(int[] nums, int a, int b) {
		int temp = nums[b];
		nums[b] = nums[a];
		nums[a] = temp;
	}

	public static void main(String[] args) {
		int len = 10;
		int[] nums = new int[len];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(nums));

		selectSort(nums);

		System.out.println(Arrays.toString(nums));
	}
*/

/*
	// 插入排序
	private static void insertSort(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			int base = nums[i], j = i - 1;
			while (j >= 0 && nums[j] > base) {
				nums[j + 1] = nums[j];
				j--;
			}
			nums[j + 1] = base;
		}
	}

	public static void main(String[] args) {
		int len = 10;
		int[] nums = new int[len];
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < len; i++) {
			nums[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(nums));

		insertSort(nums);

		System.out.println(Arrays.toString(nums));
	}
*/

/*
	// 88. 合并两个有序数组 双指针
	public void merge(int[] nums1, int m, int[] nums2, int n) {
		int pos = m + n - 1;
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
		// 22. 括号生成 DFS
		private StringBuilder sb;
		private List<String> ans;
		private int n;

		public List<String> generateParenthesis(int n) {
			ans = new LinkedList<>();
			sb = new StringBuilder();
			this.n = n;
			dfs(0, 0);
			return ans;
		}

		private void dfs(int left, int right) {
			if (left == n && right == n) {
				ans.add(new String(sb));
				return;
			}
			if (right > left) {
				return;
			}

			if (left > n || right > n) {
				return;
			}

			sb.append('(');
			dfs(left + 1, right);
			sb.deleteCharAt(sb.length() - 1);

			sb.append(')');
			dfs(left, right + 1);
			sb.deleteCharAt(sb.length() - 1);
		}
	*/

/*
	// 69. x 的平方根 二分
	public int mySqrt(int x) {
		int left = 0, right = x, ans = -1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if ((long) mid * mid <= x) {
				ans = mid;
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return ans;
	}
*/

/*
	// 92. 反转链表 II
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

	private ListNode reverse(ListNode node) {
		ListNode pre = null, cur = node;
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
	// 21. 合并两个有序链表 模拟
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode();
		ListNode cur = dummy;
		while (list1 != null && list2 != null) {
			int val1 = list1.val;
			int val2 = list2.val;
			if (val1 <= val2) {
				cur.next = list1;
				cur = list1;
				list1 = list1.next;
			} else {
				cur.next = list2;
				cur = list2;
				list2 = list2.next;
			}
		}
		while (list1 != null) {
			cur.next = list1;
			cur = list1;
			list1 = list1.next;
		}
		while (list2 != null) {
			cur.next = list2;
			cur = list2;
			list2 = list2.next;
		}
		return dummy.next;
	}
*/

/*
	// 128. 最长连续序列 哈希
	public int longestConsecutive(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		int ans = 0;
		for (int num : nums) {
			set.add(num);
		}
		for (Integer num : set) {
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
	// 53. 最大子数组和
	public int maxSubArray(int[] nums) {
		int sum = 0, ans = Integer.MIN_VALUE;
		for (int num : nums) {
			sum += num;
			ans = Math.max(ans, sum);
			sum = Math.max(0, sum);
		}
		return ans;
	}
*/

/*
	// 322 零钱兑换 DP
	public int coinChange(int[] coins, int amount) {
		int max = amount + 1;
		int[] dp = new int[amount + 1];
		Arrays.fill(dp, max);
		dp[0] = 0;
		for (int i = 1; i <= amount; i++) {
			for (int coin : coins) {
				if (coin <= i) {
					dp[i] = Math.min(dp[i], dp[i - coin] + 1);
				}
			}
		}
		return dp[amount] > amount ? -1 : dp[amount];
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
