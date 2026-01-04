package com.leetcode.winter25.LeetCode75;

import org.junit.Test;

/**
 * @author HuangChunXin
 * @date 2026/1/7 16:10
 */
public class ArrayStringTest {

/*
	// 1768. 交替合并字符串 模拟
	public String mergeAlternately(String word1, String word2) {
		StringBuilder ans = new StringBuilder();
		int len1 = word1.length(), pos1 = 0;
		int len2 = word2.length(), pos2 = 0;
		while (pos1 < len1 || pos2 < len2) {
			if (pos1 < len1) {
				ans.append(word1.charAt(pos1++));
			}
			if (pos2 < len2) {
				ans.append(word2.charAt(pos2++));
			}
		}
		return new String(ans);
	}
*/

/*
	// 1071. 字符串的最大公因子 模拟 数学
	public int gcd(int a, int b) {
		return b == 0 ? a : gcd(b, a % b);
	}

	public String gcdOfStrings(String str1, String str2) {
		if (!(str1 + str2).equals(str2 + str1)) {
			return "";
		}
		return str1.substring(0, gcd(str1.length(), str2.length()));
	}
*/

/*
	// 1431. 拥有最多糖果的孩子 模拟
	public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> ans = new ArrayList<>();
		int maxN = Integer.MIN_VALUE;
		for (int candy : candies) {
			maxN = Integer.max(candy, maxN);
		}
		for (int candy : candies) {
			ans.add(candy + extraCandies >= maxN);
		}
		return ans;
	}
*/

/*
	// 605. 种花问题 贪心
	public boolean canPlaceFlowers(int[] flowerbed, int n) {
		int len = flowerbed.length;
		for (int i = 0; i < len; i++) {
			if ((i == 0 || flowerbed[i - 1] == 0) && flowerbed[i] == 0 && (i == len - 1 || flowerbed[i + 1] == 0)) {
				n--;
				i++;
			}
		}
		return n <= 0;
	}
*/

/*
	// 345. 反转字符串中的元音字母 模拟
	public String reverseVowels(String s) {
		Character[] vowelList = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
		Set<Character> vowelSet = new HashSet<>(Arrays.asList(vowelList));
		List<Character> reverseList = new ArrayList<>();
		int len = s.length();
		for (int i = 0; i < len; i++) {
			Character ch = s.charAt(i);
			if (vowelSet.contains(ch)) {
				reverseList.add(ch);
			}
		}
		int temp = 0;
		StringBuilder ans = new StringBuilder();
		for (int i = len - 1; i >= 0; i--) {
			Character ch = s.charAt(i);
			if (vowelSet.contains(ch)) {
				ans.append(reverseList.get(temp++));
			} else {
				ans.append(ch);
			}
		}
		return new String(ans.reverse());
	}
*/

/*
	// 345. 反转字符串中的元音字母 双指针
	public String reverseVowels(String s) {
		Character[] vowelList = {'a', 'A', 'e', 'E', 'i', 'I', 'o', 'O', 'u', 'U'};
		Set<Character> vowelSet = new HashSet<>(Arrays.asList(vowelList));
		int l = 0, r = s.length() - 1;
		char[] chars = s.toCharArray();
		while (l < r) {
			while (l < s.length() && !vowelSet.contains(chars[l])) {
				l++;
			}
			while (r >= 0 && !vowelSet.contains(chars[r])) {
				r--;
			}
			if (l >= r) {
				break;
			}
			char temp = chars[l];
			chars[l++] = chars[r];
			chars[r--] = temp;
		}
		return new String(chars);
	}
*/

/*
	// 151. 反转字符串中的单词 模拟
	public String reverseWords(String s) {
		s = s.trim();
		List<String> words = Arrays.asList(s.split("\\s+"));
		Collections.reverse(words);
		return String.join(" ", words);
	}
*/

/*
	// 151. 反转字符串中的单词 模拟
	public String reverseWords(String s) {
		List<String> list = new ArrayList<>();
		int r = s.length() - 1;
		while (r >= 0) {
			while (r >= 0 && s.charAt(r) == ' ') {
				r--;
			}
			int l = r;
			while (l >= 0 && s.charAt(l) != ' ') {
				l--;
			}
			if (r != -1) {
				list.add(s.substring(l + 1, r + 1));
			}
			r = l;
		}
		return String.join(" ", list);
	}
*/

/*
	// 238. 除了自身以外数组的乘积 前缀和
	public int[] productExceptSelf(int[] nums) {
		int len = nums.length;
		int[] suf = new int[len];
		suf[len - 1] = 1;
		for (int i = len - 2; i >= 0; i--) {
			suf[i] = nums[i + 1] * suf[i + 1];
		}
		int[] ans = new int[len];
		ans[0] = suf[0];
		int pre = 1;
		for (int i = 1; i < len; i++) {
			pre *= nums[i - 1];
			ans[i] = pre * suf[i];
		}
		return ans;
	}
*/

/*
	// 334. 递增的三元子序列 贪心
	public boolean increasingTriplet(int[] nums) {
		int a = Integer.MAX_VALUE;
		int b = Integer.MAX_VALUE;
		for (int num : nums) {
			if (num <= a) {
				a = num;
			} else if (num <= b) {
				b = num;
			} else {
				return true;
			}
		}
		return false;
	}
*/

/*
	// 443. 压缩字符串 模拟
	public int compress(char[] chars) {
		int write = 0;
		int read = 0;
		while (read < chars.length) {
			char ch = chars[read];
			chars[write++] = ch;

			int j = read + 1;
			int num = 1;

			while (j < chars.length && chars[j] == ch) {
				j++;
				num++;
			}

			if (num > 1) {
				String numStr = String.valueOf(num);
				for (char c : numStr.toCharArray()) {
					chars[write++] = c;
				}
			}

			read = j;
		}
		return write;
	}
*/

	@Test
	public void test() {
	}
}
