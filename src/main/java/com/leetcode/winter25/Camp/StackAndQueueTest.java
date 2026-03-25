package com.leetcode.winter25.Camp;

import org.junit.Test;

import java.util.*;

/**
 * @author HuangChunXin
 * @date 2026/3/25 10:05
 */
public class StackAndQueueTest {

/*
	// 232. 用栈实现队列
	class MyQueue {

		Stack<Integer> inStack;
		Stack<Integer> outStack;

		public MyQueue() {
			inStack = new Stack<>();
			outStack = new Stack<>();
		}

		public void push(int x) {
			inStack.push(x);
		}

		public int pop() {
			if (outStack.isEmpty()) {
				move();
			}
			return outStack.pop();
		}

		public int peek() {
			if (outStack.isEmpty()) {
				move();
			}
			return outStack.peek();
		}

		public boolean empty() {
			return outStack.isEmpty() && inStack.isEmpty();
		}

		private void move() {
			while (!inStack.isEmpty()) {
				outStack.push(inStack.pop());
			}
		}
	}
*/

/*
	// 225. 用队列实现栈
	class MyStack {

		private Deque<Integer> deque;

		public MyStack() {
			deque = new ArrayDeque<>();
		}

		public void push(int x) {
			deque.offerLast(x);
		}

		public int pop() {
			return deque.pollLast();
		}

		public int top() {
			return deque.getLast();
		}

		public boolean empty() {
			return deque.isEmpty();
		}
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

/*
	// 46. 全排列
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
	// 160. 相交链表
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		ListNode pA = headA, pB = headB;
		while (pA != pB) {
			pA = pA == null ? headB : pA.next;
			pB = pB == null ? headA : pB.next;
		}
		return pA;
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
	// 1626. 无矛盾的最佳球队
	public int bestTeamScore(int[] scores, int[] ages) {
		int n = scores.length;
		int[][] people = new int[n][2];
		for (int i = 0; i < n; i++) {
			people[i] = new int[]{scores[i], ages[i]};
		}
		Arrays.sort(people, (a, b) -> a[0] != b[0] ? a[0] - b[0] : a[1] - b[1]);
		int[] dp = new int[n];
		int res = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i - 1; j >= 0; j--) {
				if (people[j][1] <= people[i][1]) {
					dp[i] = Math.max(dp[i], dp[j]);
				}
			}
			dp[i] += people[i][0];
			res = Math.max(res, dp[i]);
		}
		return res;
	}
*/

/*
	// 1047. 删除字符串中的所有相邻重复项
	public String removeDuplicates(String s) {
		StringBuilder sb = new StringBuilder();
		int pos = -1;
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (pos >= 0 && sb.charAt(pos) == c) {
				sb.deleteCharAt(pos--);
			} else {
				sb.append(c);
				pos++;
			}
		}
		return sb.toString();
	}
*/

/*
	// 150. 逆波兰表达式求值
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
				default -> {
					stack.push(Integer.valueOf(token));
				}
			}
		}
		return stack.pop();
	}
*/

/*
	// 347. 前K个高频元素 优先队列
	public int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<>();
		PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		for (Integer key : map.keySet()) {
			pq.offer(new int[]{key, map.get(key)});
		}
		int[] ans = new int[k];
		int i = 0;
		while (i++ < k) {
			ans[i - 1] = pq.poll()[0];
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
