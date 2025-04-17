package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

public class ArrayStringTest {

/*
    // 1768 交替合并字符串 模拟
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder sb = new StringBuilder(n + m);
        for (int i = 0; i < n || i < m; i++) {
            if (i < n)
                sb.append(word1.charAt(i));
            if (i < m)
                sb.append(word2.charAt(i));
        }
        return sb.toString();
    }
*/

/*
    // 1768 交替合并字符串 双指针
    public String mergeAlternately(String word1, String word2) {
        int n = word1.length();
        int m = word2.length();
        StringBuilder sb = new StringBuilder(n + m);
        int i = 0, j = 0;
        while (i < n || j < m) {
            if (i < n)
                sb.append(word1.charAt(i++));
            if (j < m)
                sb.append(word2.charAt(j++));
        }
        return sb.toString();
    }
*/

/*
    // 1071 字符串的最大公因子 辗转相除法
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";
        return str1.substring(0, gcd(str1.length(), str2.length()));
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
*/

/*
    // 1431 拥有最多糖果的孩子 模拟
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        int maxN = Integer.MIN_VALUE;
        for (int candy : candies)
            maxN = Math.max(maxN, candy);
        List<Boolean> result = new ArrayList<>(n);
        for (int candy : candies)
            result.add(candy + extraCandies >= maxN);
        return result;
    }
*/

/*
    // 605 种花问题 贪心
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
    // 345 反转字符串中的元音字母 栈模拟
    public String reverseVowels(String str) {
        HashMap<Character, Object> map = new HashMap<>();
        Character[] chars = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (Character c : chars)
            map.put(c, null);
        Stk<Character> stack = new Stk<>();
        for (Character c : str.toCharArray())
            if (map.containsKey(c))
                stack.push(c);
        StringBuilder sb = new StringBuilder();
        for (Character c : str.toCharArray())
            if (map.containsKey(c))
                sb.append(stack.pop());
            else
                sb.append(c);
        return sb.toString();
    }
*/

/*
    // 345 反转字符串中的元音字母 双指针
    public String reverseVowels(String str) {
        int l = 0;
        int r = str.length() - 1;
        HashMap<Character, Object> map = new HashMap<>();
        Character[] chars = {'a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'};
        for (Character c : chars)
            map.put(c, null);
        char[] result = str.toCharArray();
        while (l < r) {
            if (map.containsKey(result[l]) && map.containsKey(result[r])) {
                swap(result, l++, r--);
            } else {
                if (!map.containsKey(result[l]))
                    l++;
                if (!map.containsKey(result[r]))
                    r--;
            }
        }
        return new String(result);
    }

    private void swap(char[] cs, int l, int r) {
        char c = cs[l];
        cs[l] = cs[r];
        cs[r] = c;
    }
*/

/*
    // 151 反转字符串中的单词 栈模拟 + 双指针
    public String reverseWords(String s) {
        Stk<String> stack = new Stk<>();
        int len = s.length();
        int l = 0;
        while (l < len) {
            if (s.charAt(l) == ' ') {
                l++;
                continue;
            }
            int r = l;
            StringBuilder sb = new StringBuilder();
            while (r < len && s.charAt(r) != ' ') {
                sb.append(s.charAt(r));
                r++;
            }
            stack.push(sb.toString());
            l = r;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(stack.pop());
        while (!stack.isEmpty()) {
            sb.append(" ").append(stack.pop());
        }
        return sb.toString();
    }
*/

/*
    // 151 反转字符串中的单词 双指针
    public String reverseWords(String s) {
        s = s.trim();
        int j = s.length() - 1;
        int i = j;
        StringBuilder sb = new StringBuilder();
        while (i >= 0) {
            while (i >= 0 && s.charAt(i) != ' ') i--;
            sb.append(s, i + 1, j + 1).append(" ");
            while (i >= 0 && s.charAt(i) == ' ') i--;
            j = i;
        }
        return sb.toString().trim();
    }
*/

/*
    // 238 除自身以外数组的乘积 前后缀
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        pre[0] = 1;
        for (int i = 1; i < n; i++)
            pre[i] = pre[i - 1] * nums[i - 1];

        int[] suf = new int[n];
        suf[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--)
            suf[i] = suf[i + 1] * nums[i + 1];

        int[] ans = new int[n];
        for(int i = n - 1; i >= 0; i--)
            ans[i] = pre[i] * suf[i];
        return ans;
    }
*/

/*
    // 334 递增的三元子序列 贪心
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= a)
                a = num;
            else if (num <= b)
                b = num;
            else
                return true;
        }
        return false;
    }
*/

/*
    // 443 压缩字符串 双指针
    public int compress(char[] chars) {
        int len = chars.length;
        int l = 0, r = 0;
        while (r < len) {
            int idx = r;
            while (idx < len && chars[idx] == chars[r])
                idx++;
            int cnt = idx - r;
            chars[l++] = chars[r];
            if (cnt > 1) {
                int start = l;
                int end = start;
                while (cnt != 0) {
                    chars[end++] = (char) ((cnt % 10) + '0');
                    cnt /= 10;
                }
                reverse(chars, start, end - 1);
                l = end;
            }
            r = idx;
        }
        return l;
    }

    private void reverse(char[] chars, int left, int right) {
        while (left < right) {
            char temp = chars[left];
            chars[left++] = chars[right];
            chars[right--] = temp;
        }
    }
*/

    @Test
    public void test() {
    }
}
