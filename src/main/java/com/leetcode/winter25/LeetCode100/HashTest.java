package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/2/4 15:44
 */
public class HashTest {

/*
	// 1. 两数之和 哈希
	public int[] twoSum(int[] nums, int target) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int goalNum = target - nums[i];
			if (map.containsKey(goalNum)) {
				return new int[]{map.get(goalNum), i};
			} else {
				map.put(nums[i], i);
			}
		}
		return new int[2];
	}
*/

/*
	// 49. 字母异位词分组 哈希
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
	// 128. 最长连续序列 哈希
	public int longestConsecutive(int[] nums) {
		HashSet<Integer> set = new HashSet<>();
		int ans = 0;
		for (int num : nums) {
			set.add(num);
		}
		for (int num : set) {
			if (set.contains(num - 1)) {
				continue;
			}
			int y = num + 1;
			while (set.contains(y)) {
				y++;
			}
			ans = Math.max(ans, y - num);
		}
		return ans;
	}
*/

	@Test
	public void test() {
	}
}
