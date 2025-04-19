package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

public class SlidingWindowTest {

/*
    // 3 无重复字符的最长子串 滑动窗口
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        int l = 0, r = 0;
        HashSet<Character> set = new HashSet<>();
        char[] chars = s.toCharArray();
        int len = chars.length;
        while (r != len) {
            if(set.contains(chars[r])) {
                ans = Math.max(ans, r - l);
                while(set.contains(chars[r]))
                    set.remove(chars[l++]);
            }
            set.add(chars[r++]);
        }
        ans = Math.max(ans, r - l);
        return ans;
    }
*/

/*
    // 438 找到字符串中所有字母异位词 滑动窗口
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        char[] dir = new char[26];
        char[] cur = new char[26];
        for (char c : p.toCharArray())
            dir[c - 'a']++;

        int lenP = p.length();
        for (int r = 0; r < s.length(); r++) {
            cur[s.charAt(r) - 'a']++;
            int l = r - lenP + 1;
            if (l < 0)
                continue;
            if (Arrays.equals(dir, cur))
                ans.add(l);
            cur[s.charAt(l) - 'a']--;
        }
        return ans;
    }
*/

/*
    // 438 找到字符串中所有字母异位词 滑动窗口
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> res = new ArrayList<>();
        char[] dir = new char[26];
        char[] cur = new char[26];
        for (char c : p.toCharArray())
            dir[c - 'a']++;

        int l = 0;
        int lenS = s.length();
        int lenP = p.length();
        for (int r = 0; r < lenS; r++) {
            cur[s.charAt(r) - 'a']++;
            while (cur[s.charAt(r) - 'a'] > dir[s.charAt(r) - 'a'])
                cur[s.charAt(l++) - 'a']--;
            if (Arrays.equals(dir, cur))
                res.add(l);
        }
        return res;
    }
*/

    @Test
    public void test() {
    }
}
