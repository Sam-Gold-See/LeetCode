package com.leetcode.spring25;

import org.junit.Test;

public class CodeTopTest {

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

/*
    // 3 无重复字符的最长子串 滑动窗口
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int l = 0, r = 0;
        char[] dir = new char[128];
        while (r < s.length()) {
            char pos = s.charAt(r);
            dir[pos]++;
            while (dir[pos] > 1)
                dir[s.charAt(l++)]--;
            ans = Math.max(ans, r - l + 1);
            r++;
        }
        return ans;
    }
*/

/*
    // 146 LRU 缓存 LinkedHashMap
    class LRUCache {

        private final int capacity;
        private final Map<Integer, Integer> table = new LinkedHashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
        }

        public int get(int key) {
            Integer value = table.remove(key);
            if (value != null) {
                table.put(key, value);
                return value;
            }
            return -1;
        }

        public void put(int key, int value) {
            if(table.remove(key) != null){
                table.put(key, value);
                return;
            }

            if(table.size() == capacity){
                Integer eldestKey = table.keySet().iterator().next();
                table.remove(eldestKey);
            }
            table.put(key, value);
        }
    }
*/

/*
    // 146 LRU 缓存 哈希 双向链表
    class LRUCache {

        private static class Node {
            int key, value;
            Node prev, next;

            Node(int k, int v) {
                key = k;
                value = v;
            }
        }

        private final int capacity;
        private final Node dummy = new Node(0, 0);
        private final Map<Integer, Node> keyToNode = new HashMap<>();

        public LRUCache(int capacity) {
            this.capacity = capacity;
            dummy.prev = dummy;
            dummy.next = dummy;
        }

        private Node getNode(int key) {
            if (!keyToNode.containsKey(key))
                return null;
            Node node = keyToNode.get(key);
            remove(node);
            pushFront(node);
            return node;
        }

        private void remove(Node temp) {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }

        private void pushFront(Node temp) {
            Node dummyNext = dummy.next;
            temp.next = dummyNext;
            temp.prev = dummy;
            dummyNext.prev = temp;
            dummy.next = temp;
        }

        public int get(int key) {
            Node node = getNode(key);
            return node != null ? node.value : -1;
        }

        public void put(int key, int value) {
            Node node = getNode(key);
            if (node != null) {
                node.value = value;
                return;
            }
            node = new Node(key, value);
            keyToNode.put(key, node);
            pushFront(node);
            if(keyToNode.size() > capacity){
                Node backNode = dummy.prev;
                keyToNode.remove(backNode.key);
                remove(backNode);
            }
        }
    }
*/

/*
    // 206 反转链表 链表
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head;
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
    // 215 数组中的第K个最大元素 优先队列
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o1 - o2);
        for (int num : nums)
            pq.add(num);
        while (--k != 0)
            pq.poll();
        return pq.poll();
    }
*/

/*
    // 215 数组中的第K个最大元素 优先队列
    public int findKthLargest(int[] nums, int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int num : nums){
            if(pq.size()< k)
                pq.offer(num);
            else{
                Integer topNum = pq.peek();
                if(num > topNum){
                    pq.poll();
                    pq.offer(num);
                }
            }
        }
        return pq.peek();
    }
*/

    @Test
    public void test() {
    }
}
