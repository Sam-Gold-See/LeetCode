package com.leetcode.spring25;

import org.junit.Test;

import java.util.*;

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
        boolean[] table = new boolean[128];
        int ans = 0;
        char[] chars = s.toCharArray();
        int l = 0, r = 0;
        while (r < chars.length) {
            if (!table[chars[r]]) {
                table[chars[r++]] = true;
                ans = Math.max(ans, r - l);
            } else while (table[chars[r]])
                table[chars[l++]] = false;
        }
        return ans;
    }
*/

/*
    // 206 反转链表 链表 模拟
    public ListNode reverseList(ListNode head) {
        if (head == null)
            return head;
        ListNode pre = null, cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
*/

/*
    // 215 数组中的第K个最大元素 优先队列
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : nums)
            pq.offer(num);
        while (--k > 0)
            pq.poll();
        return pq.poll();
    }
*/

/*
    // 15 三数之和 双指针
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        int len = nums.length;
        if (len < 3) return ans;
        for (int i = 0; i < len - 2; i++) {
            if (nums[i] > 0) break;
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int j = i + 1, k = len - 1;
            while (j < k) {
                int sum = nums[i] + nums[j] + nums[k];
                if (sum == 0) {
                    ans.add(List.of(nums[i], nums[j], nums[k]));
                    while (j < k && nums[j] == nums[j + 1])
                        j++;
                    while (j < k && nums[k] == nums[k - 1])
                        k--;
                    k--;
                    j++;
                } else if (sum < 0)
                    j++;
                else
                    k--;
            }
        }
        return ans;
    }
*/

/*
    // 146 LRU 缓存 哈希链表
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
            temp.prev = dummy;
            temp.next = dummy.next;
            temp.prev.next = temp;
            temp.next.prev = temp;
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
            if (keyToNode.size() > capacity) {
                Node backNode = dummy.prev;
                keyToNode.remove(backNode.key);
                remove(backNode);
            }
        }
    }
*/

/*
    // 53 最大子数组和 滑动窗口
    public int maxSubArray(int[] nums) {
        int l = 0, r = 0;
        int sum = nums[0], ans = nums[0];
        while (++r < nums.length) {
            sum += nums[r];
            while (l < r && sum < nums[r])
                sum -= nums[l++];
            ans = Math.max(ans, sum);
        }
        return ans;
    }
*/

    @Test
    public void test() {
    }
}
