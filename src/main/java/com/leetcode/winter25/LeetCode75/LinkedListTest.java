package com.leetcode.winter25.LeetCode75;

import org.junit.Test;

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
