package com.leetcode.winter25.Camp;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/3/19 15:19
 */
public class LinkedListTest {

/*
	// 24. 两两交换链表中的节点
	public ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(0 , head);
		ListNode temp = dummy;
		while (temp.next != null && temp.next.next != null) {
			ListNode node1 = temp.next;
			ListNode node2 = temp.next.next;
			temp.next = node2;
			node1.next = node2.next;
			node2.next = node1;
			temp = node1;
		}
		return dummy.next;
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
			r = r.next;
			l = l.next;
		}
		l.next = l.next.next;
		return dummy.next;
	}
*/

/*
	// 面试题 02.07 链表相交
	public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
		if (headA == null || headB == null) {
			return null;
		}
		ListNode curA = headA, curB = headB;
		while (curA != curB) {
			curA = curA == null ? headB : curA.next;
			curB = curB == null ? headA : curB.next;
		}
		return curA;
	}
*/

/*
	// 142. 环形链表 II
	public ListNode detectCycle(ListNode head) {
		ListNode slow = head, fast =head;
		while (true) {
			if (fast == null || fast.next == null) {
				return null;
			}
			fast = fast.next.next;
			slow = slow.next;
			if (fast == slow) {
				break;
			}
		}
		fast = head;
		while (slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		return fast;
	}
*/

/*
	// 347. 前 K 个高频元素
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

/*
	// 1605. 给定行和列的求可行矩阵
	public int[][] restoreMatrix(int[] rowSum, int[] colSum) {
		int n = rowSum.length, m = colSum.length;
		int[][] matrix = new int[n][m];
		int i = 0, j = 0;
		while (i < n && j < m) {
			int v = Math.min(rowSum[i], colSum[j]);
			matrix[i][j] = v;
			rowSum[i] -= v;
			colSum[j] -= v;
			if (rowSum[i] == 0) {
				++i;
			}
			if (colSum[j] == 0) {
				++j;
			}
		}
		return matrix;
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
