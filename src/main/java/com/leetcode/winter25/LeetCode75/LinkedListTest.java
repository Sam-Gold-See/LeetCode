package com.leetcode.winter25.LeetCode75;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author HuangChunXin
 * @date 2026/1/12 13:08
 */
public class LinkedListTest {

/*
	// 2095. 删除链表的中间节点 链表
	public ListNode deleteMiddle(ListNode head) {
		if(head.next == null){
			return null;
		}
		ListNode slow = head, fast = head.next.next;
		while(fast != null && fast.next != null){
			slow = slow.next;
			fast = fast.next.next;
		}
		slow.next = slow.next.next;
		return head;
	}
*/

/*
	// 328. 奇偶链表 模拟
	public ListNode oddEvenList(ListNode head) {
		boolean isOdd = true;
		ListNode oddHead = new ListNode();
		ListNode oddTail = oddHead;
		ListNode evenHead = new ListNode();
		ListNode evenTail = evenHead;
		while (head != null) {
			if (isOdd) {
				oddTail.next = head;
				oddTail = oddTail.next;
			} else {
				evenTail.next = head;
				evenTail = evenTail.next;
			}
			head = head.next;
			isOdd = !isOdd;
		}
		oddTail.next = evenHead.next;
		evenTail.next = null;
		return oddHead.next;
	}
*/

/*
	// 206. 反转链表 快慢指针
	public ListNode reverseList(ListNode head) {
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
	// 2130. 链表最大孪生和 快慢指针
	public int pairSum(ListNode head) {
		int ans = 0;
		ListNode pre = new ListNode(0, head);
		ListNode slow = pre, fast = pre;
		while (fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		ListNode reversePre = null, cur = slow.next;
		while (cur != null) {
			ListNode temp = cur.next;
			cur.next = reversePre;
			reversePre = cur;
			cur = temp;
		}
		ListNode left = pre.next, right = reversePre;
		while (left != null && right != null) {
			ans = Math.max(ans, left.val + right.val);
			left = left.next;
			right = right.next;
		}
		return ans;
	}
*/

/*
	// 2130. 链表最大孪生和 快慢指针
	public int pairSum(ListNode head) {
		ListNode pre = null, cur = head, last = head;
		while (last != null) {
			last = last.next.next;
			ListNode temp = cur.next;
			cur.next = pre;
			pre = cur;
			cur = temp;
		}
		int ans = Integer.MIN_VALUE;
		while (pre != null && cur != null) {
			ans = Math.max(ans , pre.val + cur.val);
			pre = pre.next;
			cur = cur.next;
		}
		return ans;
	}
*/

	public static class ListNode {
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
