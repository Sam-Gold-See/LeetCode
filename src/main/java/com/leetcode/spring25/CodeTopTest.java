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



    @Test
    public void test() {
    }
}
