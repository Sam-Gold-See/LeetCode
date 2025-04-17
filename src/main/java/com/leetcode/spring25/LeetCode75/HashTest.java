package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

public class HashTest {

/*
    // 2215 找出两数组的不同 哈希
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> ans = new ArrayList<>();
        ans.add(new ArrayList<>());
        ans.add(new ArrayList<>());

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for (int num : nums1)
            set1.add(num);
        for (int num : nums2)
            set2.add(num);

        for (int num : set1)
            if (!set2.contains(num))
                ans.get(0).add(num);
        for (int num : set2)
            if (!set1.contains(num))
                ans.get(1).add(num);

        return ans;
    }
*/

/*
    // 1207 独一无二的出现次数 哈希
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : arr)
            map.put(num, map.getOrDefault(num, 0) + 1);
        Set<Integer> set = new HashSet<>(map.values());
        return set.size() == map.size();
    }
*/

/*
    // 1657 确定两个字符串是否接近 哈希
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length())
            return false;

        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (char c : word1.toCharArray())
            cnt1[c - 'a']++;
        for (char c : word2.toCharArray())
            cnt2[c - 'a']++;

        for (int i = 0; i < 26; i++)
            if ((cnt1[i] == 0) != (cnt2[i] == 0))
                return false;

        Arrays.sort(cnt1);
        Arrays.sort(cnt2);
        return Arrays.equals(cnt1, cnt2);
    }
*/

/*
    // 2352 相等行列对 哈希
    public int equalPairs(int[][] grid) {
        int ans = 0;
        int n = grid.length;
        Map<String, Integer> map = new HashMap<>();
        for (int[] list : grid) {
            StringBuilder sb = new StringBuilder();
            for (int num : list)
                sb.append(num + '0');
            String str = sb.toString();
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        for (int j = 0; j < n; j++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < n; i++)
                sb.append(grid[i][j] + '0');
            String str = sb.toString();
            ans += map.getOrDefault(str, 0);
        }

        return ans;
    }
*/

    @Test
    public void test() {

    }
}
