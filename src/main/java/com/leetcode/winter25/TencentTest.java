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

/*
	// 103. 二叉树的锯齿形层序遍历 BFS
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ans = new LinkedList<>();
		if (root != null){
			Deque<TreeNode> deque = new ArrayDeque<>();
			deque.offerLast(root);
			while (!deque.isEmpty()) {
				int size = deque.size();
				LinkedList<Integer> list = new LinkedList<>();
				while (size-- > 0) {
					TreeNode node = deque.pollFirst();
					if (ans.size() % 2 == 0) {
						list.addLast(node.val);
					} else {
						list.addFirst(node.val);
					}
					if (node.left != null) {
						deque.offerLast(node.left);
					}
					if (node.right != null) {
						deque.offerLast(node.right);
					}
				}
				ans.add(list);
			}
		}
		return ans;
	}
*/

/*
	// 25. K 个一组翻转链表 模拟
	public ListNode reverseKGroup(ListNode head, int k) {
		ListNode dummy = new ListNode(0, head);
		ListNode l = dummy, r = dummy;
		while (true) {
			int cnt = k;
			while (r != null && cnt > 0) {
				r = r.next;
				cnt--;
			}
			if (r == null) {
				break;
			}
			ListNode nextHead = r.next;
			r.next = null;

			ListNode tail = l.next;

			l.next = reverse(tail);
			tail.next = nextHead;

			l = tail;
			r = tail;
		}
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
	// 236. 二叉树的最近公共祖先
	public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
		if (root == null || root == p || root == q) {
			return root;
		}
		TreeNode left = lowestCommonAncestor(root.left, p, q);
		TreeNode right = lowestCommonAncestor(root.right, p, q);
		if (left == null) {
			return  right;
		}
		if (right == null) {
			return left;
		}
		return root;
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

		pos = left;
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
	// 300. 最长递增子序列
	public int lengthOfLIS(int[] nums) {
		int len = nums.length;
		int[] dp = new int[len];
		Arrays.fill(dp, 1);
		int ans = 1;
		for (int i = 0; i < len; i++) {
			for (int j = 0; j < i; j++) {
				if (nums[i] > nums[j]) {
					dp[i] = Math.max(dp[i], dp[j] + 1);
				}
			}
			ans = Math.max(ans, dp[i]);
		}
		return ans;
	}
*/

/*
	//  面试题 08.06 汉诺塔问题
	public void hanota(List<Integer> A, List<Integer> B, List<Integer> C) {
		movePlate(A.size(), A, B, C);
	}

	private void movePlate(int num, List<Integer> original, List<Integer> temp, List<Integer> target) {
		if (num == 1) {
			target.add(original.removeLast());
			return;
		}

		movePlate(num - 1, original, target, temp);
		target.add(original.removeLast());
		movePlate(num - 1, temp, original, target);
	}
*/

/*
	// 287. 寻找重复数 快慢指针
	public int findDuplicate(int[] nums) {
		int slow = 0;
		int fast = 0;
		do {
			slow = nums[slow];
			fast = nums[nums[fast]];
		} while (slow != fast);

		int pre = 0;
		while (pre != slow) {
			pre = nums[pre];
			slow = nums[slow];
		}

		return pre;
	}
*/

/*
	// 74. 搜索二维矩阵
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
	// 442. 数组中重复的数据
	public List<Integer> findDuplicates(int[] nums) {
		ArrayList<Integer> ans = new ArrayList<>();
		int n = nums.length;
		for (int i = 0; i < n; i++) {
			int num = nums[i];
			int index = Math.abs(num) - 1;
			if (nums[index] > 0) {
				nums[index] = -nums[index];
			}else {
				ans.add(index + 1);
			}
		}
		return ans;
	}
*/

/*
	// 1. 两数之和
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int goal = target - nums[i];
			if (map.containsKey(goal)) {
				return new int[]{map.get(goal), i};
			} else {
				map.put(nums[i], i);
			}
		}
		return new int[2];
	}
*/

/*
	// 257. 二叉树的所有路径
	private List<String> ans;

	public List<String> binaryTreePaths(TreeNode root) {
		ans = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		dfs(root, sb);
		return ans;
	}

	private void dfs(TreeNode node, StringBuilder sb) {
		if (node == null) {
			return;
		}

		int len = sb.length();
		sb.append(node.val);
		if (node.left == null && node.right == null) {
			ans.addLast(new String(sb));
		} else {
			sb.append("->");
			dfs(node.left, sb);
			dfs(node.right, sb);
		}
		sb.setLength(len);
	}
*/

/*
	// 198. 打家劫舍
	public int rob(int[] nums) {
		int len = nums.length;
		if (len < 2) {
			return nums[0];
		}
		int[] dp = new int[len];
		dp[0] = nums[0];
		dp[1] = Math.max(nums[0], nums[1]);
		for (int i = 2; i < len; i++) {
			dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
		}
		return dp[len - 1];
	}
*/

/*
	// 662. 二叉树最大宽度
	private class Pair<K, V> {
		private K key;
		private V value;

		public Pair(K key, V value) {
			this.key = key;
			this.value = value;
		}

		public K getKey() {
			return key;
		}

		public V getValue() {
			return value;
		}
	}

	public int widthOfBinaryTree(TreeNode root) {
		int ans = 1;
		Deque<Pair<TreeNode, Integer>> deque = new ArrayDeque<>();
		deque.add(new Pair<>(root, 1));
		while (!deque.isEmpty()) {
			int size = deque.size(), left = -1, right = -1;
			int levelMin = deque.peekFirst().getValue();
			for (int i = 0; i < size; i++) {
				Pair<TreeNode, Integer> pair = deque.pollFirst();

				TreeNode node = pair.getKey();
				int index = pair.getValue() - levelMin;

				if (i == 0) {
					left = index;
				}
				if (i == size - 1) {
					right = index;
				}

				if (node.left != null) {
					deque.offerLast(new Pair<>(node.left, index * 2));
				}
				if (node.right != null) {
					deque.offerLast(new Pair<>(node.right, index * 2 + 1));
				}
			}
			ans = Math.max(ans, right - left + 1);
		}
		return ans;
	}
*/

/*
	// 106. 从中序与后序遍历序列构造二叉树
	int postIdx;
	int[] inorder;
	int[] postorder;
	Map<Integer, Integer> map = new HashMap<>();

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		this.inorder = inorder;
		this.postorder = postorder;

		postIdx = postorder.length - 1;

		for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}

		return build(0, inorder.length - 1);
	}

	private TreeNode build(int left, int right) {
		if (left > right) {
			return null;
		}

		int rootVal = postorder[postIdx];
		TreeNode root = new TreeNode(rootVal);

		int index = map.get(rootVal);

		postIdx--;
		root.right = build(index + 1, right);
		root.left = build(left, index - 1);
		return root;
	}
*/

/*
	// 268. 丢失的数字
	public int missingNumber(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		for (int num : nums) {
			set.add(num);
		}
		int missing = -1;
		for (int i = 0; i <= nums.length; i++) {
			if (!set.contains(i)){
				missing = i;
				break;
			}
		}
		return missing;
	}
*/

/*
	// 234. 回文链表
	public boolean isPalindrome(ListNode head) {
		if (head.next == null) {
			return true;
		}
		ListNode middle = findMiddleNode(head);
		ListNode reverse = reverse(middle);
		while (reverse != null) {
			if (reverse.val != head.val) {
				return false;
			}
			reverse = reverse.next;
			head = head.next;
		}
		return true;
	}

	private ListNode findMiddleNode(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
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
	// 56. 合并区间
	public int[][] merge(int[][] intervals) {
		LinkedList<int[]> list = new LinkedList<>();
		Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
		int lastEnd = -1;
		for (int[] interval : intervals) {
			if (interval[0] <= lastEnd) {
				int left = list.pollLast()[0];
				int right = Math.max(lastEnd, interval[1]);
				list.offerLast(new int[]{left, right});
				lastEnd = right;
			} else {
				list.offerLast(interval);
				lastEnd = interval[1];
			}
		}
		int[][] ans = new int[list.size()][];
		for (int i = 0; i < list.size(); i++) {
			ans[i] = list.get(i);
		}
		return ans;
	}
*/

/*
	// 19. 删除链表的倒数第 N 个结点
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
	// LCR 124. 推理二叉树
	private Map<Integer, Integer> map;
	private int[] preorder;

	public TreeNode deduceTree(int[] preorder, int[] inorder) {
		map = new HashMap<>();
		this.preorder = preorder;
		for (int i = 0; i < inorder.length; i++) {
			map.put(inorder[i], i);
		}
		return buildTree(0, 0, inorder.length - 1);
	}

	private TreeNode buildTree(int index, int left, int right) {
		if (left > right) {
			return null;
		}
		TreeNode node = new TreeNode(preorder[index]);
		int i = map.get(preorder[index]);
		node.left = buildTree(index + 1, left, i - 1);
		node.right = buildTree(index + i - left + 1, i + 1, right);
		return node;
	}
*/

/*
	// 1360. 日期之间隔几天
	private int[][] Month = {{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}, {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}};
	private int[] Day = {365, 366};

	public int daysBetweenDates(String date1, String date2) {
		String[] d1 = date1.split("-");
		String[] d2 = date2.split("-");
		int year1 = Integer.valueOf(d1[0]), year2 = Integer.valueOf(d2[0]);
		int month1 = Integer.valueOf(d1[1]), month2 = Integer.valueOf(d2[1]);
		int day1 = Integer.valueOf(d1[2]), day2 = Integer.valueOf(d2[2]);
		int s1 = gap(year1, month1, day1);
		int s2 = gap(year2, month2, day2);
		return Math.abs(s1 - s2);
	}

	private int gap(int year, int month, int day) {
		int sum = 0;
		int flag = yearType(year);
		for (int i = 1971; i < year; i++) {
			sum += Day[yearType(i)];
		}
		for (int i = 1; i < month; i++) {
			sum += Month[flag][i];
		}
		sum += day;
		return sum;
	}

	//判断是否闰年
	public int yearType(int year) {
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) return 1;
		return 0;
	}
*/

/*
	// 21. 合并两个有序链表
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		ListNode dummy = new ListNode(), cur = dummy;
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
	// 15. 三数之和
	public List<List<Integer>> threeSum(int[] nums) {
		Arrays.sort(nums);
		List<List<Integer>> ans = new ArrayList<>();
		int len = nums.length;
		if (len < 3) {
			return ans;
		}
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
					ans.add(List.of(nums[i], nums[j], nums[k]));
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
		return ans;
	}
*/

	// 1044. 最长重复子串
	// 560. 和为 K 的子数组

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
