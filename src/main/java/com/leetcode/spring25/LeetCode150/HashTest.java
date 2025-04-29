package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

import java.util.*;

public class HashTest {

/*
    // 383 赎金信 哈希
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] mapR = new int[128];
        int[] mapM = new int[128];

        for (int i = 0; i < ransomNote.length(); i++)
            mapR[ransomNote.charAt(i)]++;

        for (int i = 0; i < magazine.length(); i++)
            mapM[magazine.charAt(i)]++;

        for (int i = 'a'; i <= 'z'; i++)
            if (mapR[i] > mapM[i])
                return false;
        return true;
    }
*/

/*
    // 205 同构字符串 哈希
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> s2t = new HashMap<>(), t2s = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            char a = s.charAt(i), b = t.charAt(i);
            if ((s2t.containsKey(a) && s2t.get(a) != b) || (t2s.containsKey(b) && t2s.get(b) != a))
                return false;
            s2t.put(a, b);
            t2s.put(b, a);
        }
        return true;
    }
*/

/*
    // 290 单词规律 哈希
    public boolean wordPattern(String pattern, String s) {
        Map<Character, String> p2s = new HashMap<>();
        Map<String, Character> s2p = new HashMap<>();
        String[] str = s.split(" ");
        if (pattern.length() != str.length)
            return false;
        for (int i = 0; i < str.length; i++) {
            Character pp = pattern.charAt(i);
            String ss = str[i];
            if ((p2s.containsKey(pp) && !p2s.get(pp).equals(ss)) || (s2p.containsKey(ss) && !s2p.get(ss).equals(pp)))
                return false;
            p2s.put(pp, ss);
            s2p.put(ss, pp);
        }
        return true;
    }
*/

/*
    // 242 有效的字母异位词 哈希
    public boolean isAnagram(String s, String t) {
        int len1 = s.length(), len2 = t.length();
        if (len1 != len2)
            return false;
        HashMap<Character, Integer> dic = new HashMap<>();
        for (int i = 0; i < len1; i++)
            dic.put(s.charAt(i), dic.getOrDefault(s.charAt(i), 0) + 1);

        for (int i = 0; i < len2; i++)
            dic.put(t.charAt(i), dic.getOrDefault(t.charAt(i), 0) - 1);

        for (int val : dic.values())
            if (val != 0)
                return false;
        return true;
    }
*/

/*
    // 49 字母异位词分组
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = String.valueOf(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
*/

/*
    // 1 两数之和 哈希
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int goal = target - nums[i];
            if (map.containsKey(goal))
                return new int[]{map.get(goal), i};
            else
                map.put(nums[i], i);
        }
        return new int[]{};
    }
*/

/*
    // 202 快乐数 哈希
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n != 1 && !set.contains(n)) {
            set.add(n);
            int sum = 0;
            while (n > 0) {
                int d = n % 10;
                n /= 10;
                sum += d * d;
            }
            n = sum;
        }
        return n == 1;
    }
*/

/*
    // 219 存在重复元素 II 哈希
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k)
                return true;
            map.put(nums[i], i);
        }
        return false;
    }
*/

/*
    // 128 最长连续序列 哈希
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new TreeSet<>();
        int ans = 0;
        for (int num : nums)
            set.add(num);
        for (int st : set) {
            if (set.contains(st - 1))
                continue;
            int y = st + 1;
            while (set.contains(y))
                y++;
            ans = Math.max(ans, y - st);
        }
        return ans;
    }
*/

/*
    // 128 最长连续序列 哈希
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        int ans = 0;
        for (int num : nums)
            set.add(num);
        for (int st : set) {
            if (set.contains(st - 1))
                continue;
            int y = st + 1;
            while (set.contains(y))
                y++;
            ans = Math.max(ans, y - st);
        }
        return ans;
    }
*/

    @Test
    public void test() {
    }
}
