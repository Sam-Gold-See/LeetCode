package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LinkedListTest {

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

/*
    // 206 反转链表 链表
    public ListNode reverseList(ListNode head) {
        ListNode pre = null;
        while (head != null) {
            ListNode temp = head.next;
            head.next = pre;
            pre = head;
            head = temp;
        }
        return head;
    }
*/

/*
    // 92 反转链表 II 链表
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0, head);
        ListNode p0 = dummy;
        for (int i = 0; i < left - 1; i++)
            p0 = p0.next;

        ListNode pre = null;
        ListNode cur = p0.next;
        for (int i = 0; i < right - left + 1; i++){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }

        p0.next.next = cur;
        p0.next = pre;
        return dummy.next;
    }
*/

/*
    // 141 环形链表 链表 哈希
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head))
                return true;
            set.add(head);
            head = head.next;
        }
        return false;
    }
*/

/*
    // 141 环形链表 链表 快慢指针
    public boolean hasCycle(ListNode head) {
        ListNode l = head, r = head;
        while (r != null && r.next != null) {
            l = l.next;
            r = r.next.next;
            if (l == r)
                return true;
        }
        return false;
    }
*/

/*
    // 2 两数相加 链表
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int res = 0;
        ListNode head = new ListNode();
        ListNode cur = head;
        while (l1 != null || l2 != null || res > 0) {
            int sum = res;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            cur.next = new ListNode(sum % 10);
            cur = cur.next;
            res = sum / 10;
        }
        return head.next;
    }
*/

/*
    // 21 合并两个有序链表 链表
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode();
        ListNode dummy = ans;
        while (list1 != null || list2 != null) {
            if (list1 == null) {
                ans.next = list2;
                list2 = list2.next;
            } else if (list2 == null) {
                ans.next = list1;
                list1 = list1.next;
            } else if (list1.val < list2.val) {
                ans.next = list1;
                list1 = list1.next;
            } else {
                ans.next = list2;
                list2 = list2.next;
            }
            ans = ans.next;
        }
        return dummy.next;
    }
*/

/*
    // 19 删除链表的倒数第 N 个节点 链表
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode(0, head);
        ListNode l = pre, r = pre;
        while (n-- > 0)
            r = r.next;
        while (r.next != null) {
            l = l.next;
            r = r.next;
        }
        l.next = l.next.next;
        return pre.next;
    }
*/

    @Test
    public void test() {
    }
}
