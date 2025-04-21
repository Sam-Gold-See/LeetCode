package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

import java.util.*;

public class LinkedListTest {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode random;

        ListNode() {
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }

        ListNode(int val) {
            this.val = val;
            next = null;
            random = null;
        }
    }

/*
    // 160 相交链表 链表
    public ListNode getIntersectionNode(ListNode headA, ListNode headB){
        ListNode posA = headA;
        ListNode posB = headB;
        while(posA != posB){
            posA = posA != null ? posA.next : headB;
            posB = posB != null ? posB.next : headA;
        }
        return posA;
    }
*/

/*
    // 206 反转链表 链表
    public ListNode reverseList(ListNode head){
        ListNode cur = head;
        ListNode pre = null;
        while(cur != null){
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }
*/

/*
    // 234 回文链表 链表
    public boolean isPalindrome(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        int n = list.size();
        int l = 0, r = n - 1;
        while (l <= r) {
            if (!list.get(l++).equals(list.get(r--)))
                return false;
        }
        return true;
    }
*/

/*
    // 234 回文链表 快慢指针
    public boolean isPalindrome(ListNode head) {
        if (head == null || head.next == null) {
            return true;
        }
        ListNode fast = head.next.next;
        ListNode slow = head.next;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode pre = null;
        ListNode next;
        while (head != slow) {
            next = head.next;
            head.next = pre;
            pre = head;
            head = next;
        }

        if (fast != null)
            slow = slow.next;

        while(pre != null){
            if(pre.val != slow.val)
                return false;
            pre = pre.next;
            slow = slow.next;
        }

        return true;
    }
*/

/*
    // 141 环形链表 链表 哈希
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
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
        ListNode fast = head, slow = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow)
                return true;
        }
        return false;
    }
*/

/*
    // 142 环形链表 II 链表 哈希
    public ListNode detectCycle(ListNode head) {
        HashSet<ListNode> set = new HashSet<>();
        while (head != null) {
            if (set.contains(head))
                return head;
            set.add(head);
            head = head.next;
        }
        return null;
    }
*/

/*
    // 142 环形链表 II 链表 快慢指针
    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        while (true) {
            if(fast == null || fast.next == null)
                return null;
            fast = fast.next.next;
            slow = slow.next;
            if(fast == slow)
                break;
        }
        fast = head;
        while(slow != fast){
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }
*/

/*
    // 21 合并两个有序链表 链表 递归
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1 == null)
            return list2;
        else if(list2 == null)
            return list1;
        else if(list1.val < list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;
        }
    }
*/

/*
    // 2 两数相加 链表 模拟
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int res = 0;
        ListNode ans = new ListNode(0);
        ListNode cur = ans;
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

            res = sum / 10;
            cur.next = new ListNode(sum % 10);
            cur = cur.next;
        }
        return ans.next;
    }
*/

/*
    // 19 删除链表的倒数第N个节点 链表 预先指针
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode pre = new ListNode();
        pre.next = head;
        ListNode start = pre, end = pre;
        while (n-- != 0)
            start = start.next;
        while (start.next != null) {
            start = start.next;
            end = end.next;
        }
        end.next = end.next.next;
        return pre.next;
    }
*/

/*
    // 24 两两交换链表中的节点 链表 递归
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        ListNode next = head.next;
        head.next = swapPairs(next.next);
        next.next = head;
        return next;
    }
*/

/*
    // 138 随机链表的复制 链表 哈希
    public ListNode copyRandomList(ListNode head) {
        if (head == null)
            return null;
        ListNode cur = head;
        Map<ListNode, ListNode> map = new HashMap<>();
        while (cur != null) {
            map.put(cur, new ListNode(cur.val));
            cur = cur.next;
        }
        cur = head;
        while (cur != null) {
            map.get(cur).next = map.get(cur.next);
            map.get(cur).random = map.get(cur.random);
            cur = cur.next;
        }
        return map.get(head);
    }
*/

    @Test
    public void test() {
    }
}
