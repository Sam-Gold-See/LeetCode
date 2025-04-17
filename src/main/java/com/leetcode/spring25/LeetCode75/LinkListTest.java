package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

public class LinkListTest {

/*
    // 2095 删除链表的中间节点 链表
    public ListNode deleteMiddle(ListNode head) {
        ListNode pos = head;
        int len = 0;
        while (pos != null) {
            pos = pos.next;
            len++;
        }
        if (len == 1)
            return null;

        len /= 2;
        pos = head;
        while (--len > 0)
            pos = pos.next;
        ListNode temp = pos.next.next;
        pos.next = temp;
        return head;
    }

    class ListNode {
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
*/

/*
    // 328 奇偶链表 链表
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return head;
        ListNode evenHead = head.next;
        ListNode odd = head, even = evenHead;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }

    class ListNode {
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
*/

/*
    // 206 反转链表 链表
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    class ListNode {
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
*/

/*
    // 2130 链表最大孪生和 链表
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
        while(pre != null && cur != null) {
            ans = Math.max(ans, pre.val + cur.val);
            pre = pre.next;
            cur = cur.next;
        }
        return ans;
    }

    class ListNode {
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
*/


    @Test
    public void test() {
    }
}
