package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;


public class HashTest {

/*
    // 1 两数之和 哈希
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            int goal = target - num;
            if (map.containsKey(goal))
                return new int[]{map.get(goal), i};
            else
                map.put(num, i);
        }
        return new int[0];
    }
*/

/*
    // 49 字母异位词分组 哈希
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String key = new String(chars);
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<>(map.values());
    }
*/

/*
    // 128 最长连续序列 哈希
    public int longestConsecutive(int[] nums) {
        int ans = 0;
        Set<Integer> set = new TreeSet<>();
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
