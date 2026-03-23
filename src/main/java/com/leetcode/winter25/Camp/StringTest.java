package com.leetcode.winter25.Camp;

import org.junit.Test;

import java.util.*;

/**
 * @author HuangChunXin
 * @date 2026/3/23 13:54
 */
public class StringTest {

/*
	// 344. 反转字符串
	public void reverseString(char[] s) {
		int len = s.length, l = 0, r = len - 1;
		while (l < r) {
			char temp = s[l];
			s[l] = s[r];
			s[r] = temp;

			l++;
			r--;
		}
	}
*/

/*
	// 541. 反转字符串 II
	public String reverseStr(String s, int k) {
		int len = s.length();
		char[] chars = s.toCharArray();
		for (int i = 0; i < len; i += 2 * k) {
			reverse(chars, i, Math.min(i + k, len) - 1);
		}
		return new String(chars);
	}

	private void reverse(char[] chars, int left, int right) {
		while (left < right) {
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;

			left++;
			right--;
		}
	}
*/

/*
	// LCR 122. 路径加密
	public String pathEncryption(String path) {
		char[] chars = path.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if (chars[i] == '.') {
				chars[i] = ' ';
			}
		}
		return new String(chars);
	}
*/

/*
	// 151. 反转字符串中的单词
	public String reverseWords(String s) {
		StringBuilder sb = new StringBuilder();
		char[] chars = s.toCharArray();
		int n = chars.length;
		int r = n - 1;
		while (r >= 0) {
			while (r >= 0 && chars[r] == ' ') {
				r--;
			}
			if (r < 0) {
				break;
			}
			int l = r;
			while (l >= 0 && chars[l] != ' ') {
				l--;
			}
			if (!sb.isEmpty()) {
				sb.append(' ');
			}
			sb.append(s, l + 1, r + 1);
			r = l;
		}
		return sb.toString();
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
	// 121. 买卖股票的最佳时机
	public int maxProfit(int[] prices) {
		int ans = 0;
		int buy = Integer.MAX_VALUE;
		for (int price : prices) {
			if (buy > price) {
				buy = price;
			} else {
				ans = Math.max(ans, price - buy);
			}
		}
		return ans;
	}
*/

/*
	// 1616. 分割两个字符串得到回文串
	public boolean checkPalindromeFormation(String a, String b) {
		return checkMix(a, b) || checkMix(b , a);
	}

	private boolean checkMix(String a, String b) {
		int len = a.length();
		int l = 0, r = len - 1;
		while (l < r && a.charAt(l) == b.charAt(r)) {
			l++;
			r--;
		}
		if (l >= r) {
			return true;
		}
		return checkSolo(a, l, r) || checkSolo(b, l, r);
	}

	private boolean checkSolo(String a, int l, int r) {
		while (l < r && a.charAt(l) == a.charAt(r)) {
			l++;
			r--;
		}
		return l >= r;
	}
*/

/*
	// LCR 182. 动态口令
	public String dynamicPassword(String password, int target) {
		return password.substring(target) + password.substring(0, target);
	}
*/

/*
	// 28. 找出字符串中第一个匹配项的下标
	public int strStr(String haystack, String needle) {
		int n = haystack.length(), m = needle.length();
		for (int i = 0; i + m <= n; i++) {
			boolean flag = true;
			for (int j = 0; j < m; j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					flag = false;
					break;
				}
			}
			if (flag) {
				return i;
			}
		}
		return -1;
	}
*/

/*
	// 459. 重复的字符串
	public boolean repeatedSubstringPattern(String s) {
		int len = s.length();
		for (int i = 1; i * 2 <= len; i++) {
			if (len % i == 0) {
				boolean match = true;
				for (int j = i; j < len; j++) {
					if (s.charAt(j) != s.charAt(j - i)){
						match =false;
						break;
					}
				}
				if (match) {
					return true;
				}
			}
		}
		return false;
	}
*/

/*
	// 200. 岛屿数量
	private static final int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
	private char[][] grid;
	private int m, n;
	private int ans = 0;

	public int numIslands(char[][] grid) {
		this.grid = grid;
		m = grid.length;
		n = grid[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1') {
					dfs(i, j);
					ans++;
				}
			}
		}
		return ans;
	}

	private void dfs(int i, int j) {
		grid[i][j] = '0';
		for (int[] dir : DIR) {
			int tx = i + dir[0], ty = j + dir[1];
			if (tx >= 0 && tx < m && ty >= 0 && ty < n && grid[tx][ty] == '1') {
				dfs(tx, ty);
			}
		}
	}
*/

/*
	// 141. 环形链表
	public boolean hasCycle(ListNode head) {
		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				return true;
			}
		}
		return false;
	}
*/

/*
	// 103. 二叉树的锯齿形层序遍历
	public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
		List<List<Integer>> ans = new LinkedList<>();
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

					if (ans.size() % 2 == 0) {
						temp.addLast(node.val);
					} else {
						temp.addFirst(node.val);
					}
				}
				ans.addLast(temp);
			}
		}
		return ans;
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
		right['['] = ']';
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
