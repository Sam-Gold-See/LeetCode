package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/2/4 17:19
 */
public class SlidingWindowTest {

/*
	// 3. 无重复字符的最长子串 滑动窗口
	public int lengthOfLongestSubstring(String s) {
		int ans = 0;
		int l = 0, r = 0;
		char[] dir = new char[256];
		while (r < s.length()) {
			char pos = s.charAt(r);
			dir[pos]++;
			while (dir[pos] > 1) {
				dir[s.charAt(l++)]--;
			}
			ans = Math.max(ans, r - l + 1);
			r++;
		}
		return ans;
	}
*/


/*
	// 438. 找到字符串中所有字母异位词 滑动窗口
	public List<Integer> findAnagrams(String s, String p) {
		List<Integer> ans = new ArrayList<>();
		char[] dir = new char[26];
		char[] cur = new char[26];
		for (char c : p.toCharArray()) {
			dir[c - 'a']++;
		}

		int l = 0;
		int lenS = s.length();
		for (int r = 0; r < lenS; r++) {
			cur[s.charAt(r) - 'a']++;
			while (cur[s.charAt(r) - 'a'] > dir[s.charAt(r) - 'a']) {
				cur[s.charAt(l++) - 'a']--;
			}
			if (Arrays.equals(dir, cur)) {
				ans.add(l);
			}
		}
		return ans;
	}
*/

	@Test
	public void test() {
	}
}
