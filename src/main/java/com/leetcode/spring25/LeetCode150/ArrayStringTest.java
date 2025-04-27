package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

import java.lang.reflect.Array;
import java.util.*;

public class ArrayStringTest {

/*
    // 88 合并两个有序数组 排序
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j = 0;
        for (int i = m; i < nums1.length; i++)
            nums1[i] = nums2[j++];
        Arrays.sort(nums1);
    }
*/

/*
    // 88 合并两个有序数组 逆序双指针
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1;
        int p = m + n - 1;
        while (j >= 0)
            if (i >= 0 && nums1[i] > nums2[j])
                nums1[p--] = nums1[i--];
            else
                nums1[p--] = nums2[j--];
    }
*/

/*
    // 27 移除元素 双指针
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int l = 0;
        for (int r = 0; r < n; r++)
            if (nums[r] != val)
                nums[l++] = nums[r];
        return l;
    }
*/

/*
    // 26 删除有序数组中的重复项 双指针
    public int removeDuplicates(int[] nums) {
        int l = 0, r = 1;
        while (r < nums.length) {
            if (nums[l] != nums[r])
                nums[++l] = nums[r];
            r++;
        }
        return l + 1;
    }
*/

/*
    // 80 删除有序数组中的重复项 II 双指针
    public int removeDuplicates(int[] nums) {
        int pos = 0;
        for (int num : nums)
            if (pos < 2 || nums[pos - 2] != num)
                nums[pos++] = num;
        return pos;
    }
*/

/*
    // 169 多数元素 排序
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
*/

/*
    // 189 轮转数组 模拟
    public void rotate(int[] nums, int k) {
        int len = nums.length;
        k %= len;
        reverse(nums, 0, len - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, len - 1);
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) {
            int temp = nums[l];
            nums[l++] = nums[r];
            nums[r--] = temp;
        }
    }
*/

/*
    // 121 买卖股票的最佳时机 贪心
    public int maxProfit(int[] prices) {
        int ans = 0;
        int cost = Integer.MAX_VALUE;
        for (int price : prices) {
            cost = Math.min(cost, price);
            ans = Math.max(price - cost, ans);
        }
        return ans;
    }
*/

/*
    // 122 买卖股票的最佳时机 II DP
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][] dp = new int[2][len];
        dp[0][0] = 0;
        dp[1][0] = -prices[0];
        for (int i = 1; i < len; i++) {
            dp[0][i] = Math.max(dp[0][i - 1], dp[1][i - 1] + prices[i]);
            dp[1][i] = Math.max(dp[1][i - 1], dp[0][i - 1] - prices[i]);
        }
        return dp[0][len - 1];
    }
*/

/*
    // 55 跳跃游戏 贪心
    public boolean canJump(int[] nums) {
        int mx = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i > mx)
                return false;
            mx = Math.max(mx, i + nums[i]);
        }
        return true;
    }
*/

/*
    // 45 跳跃游戏 II 贪心
    public int jump(int[] nums) {
        int len = nums.length;
        int ans = 0;
        int nextR = 0;
        int curR = 0;
        for (int i = 0; i < len - 1; i++) {
            nextR = Math.max(nextR, nums[i] + i);
            if (i == curR) {
                curR = nextR;
                ans++;
            }
        }
        return ans;
    }
*/

/*
    // 274 H 指数 排序
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        int len = citations.length;
        int i = len - 1, h = 0;
        while (i >= 0 && citations[i] > h) {
            i--;
            h++;
        }
        return h;
    }
*/

/*
    // 380 O(1) 时间插入、删除和获取随机元素 哈希 数组
    public static class RandomizedSet {

        private final Map<Integer, Integer> map;
        private final Random random;
        private final List<Integer> list;

        public RandomizedSet() {
            map = new HashMap<>();
            random = new Random();
            list = new ArrayList<>();
        }

        public boolean insert(int val) {
            if (!map.containsKey(val)) {
                list.add(val);
                map.put(val, list.size() - 1);
                return true;
            }
            return false;
        }

        public boolean remove(int val) {
            if (map.containsKey(val)) {
                int index = map.get(val);
                int lastVal = list.get(list.size() - 1);

                list.set(index, lastVal);
                map.put(lastVal, index);

                list.remove(list.size() - 1);
                map.remove(val);
                return true;
            }
            return false;
        }

        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }
*/

/*
    // 238 除自身以外数组的乘积 前缀和
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] suf = new int[len];
        suf[len - 1] = 1;

        for (int i = len - 2; i >= 0; i--)
            suf[i] = suf[i + 1] * nums[i + 1];
        int[] ans = new int[len];
        ans[0] = suf[0];
        int pre = 1;

        for (int i = 1; i < len; i++) {
            pre *= nums[i - 1];
            ans[i] = suf[i] * pre;
        }
        return ans;
    }
*/

/*
    // 134 加油站 贪心
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int cur = 0, total = 0;
        int start = 0;
        for (int i = 0; i < gas.length; i++) {
            int res = gas[i] - cost[i];
            cur += res;
            total += res;
            if (cur < 0) {
                start = i + 1;
                cur = 0;
            }
        }
        if (total < 0)
            return -1;
        return start;
    }
*/

/*
    // 13 罗马数字转整数 模拟
    public int romanToInt(String s) {
        int[] map = new int[128];
        map['I'] = 1;
        map['V'] = 5;
        map['X'] = 10;
        map['L'] = 50;
        map['C'] = 100;
        map['D'] = 500;
        map['M'] = 1000;
        int sum = 0;
        int preNum = map[s.charAt(0)];
        for (int i = 1; i < s.length(); i++) {
            int num = map[s.charAt(i)];
            if(preNum < num)
                sum -= preNum;
            else
                sum += preNum;
            preNum = num;
        }
        sum += preNum;
        return sum;
    }
*/

/*
    // 58 最后一个单词的长度 模拟
    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int pos = len - 1;
        while (chars[pos] == ' ')
            pos--;
        int ans = 0;
        while (pos >= 0 && chars[pos] != ' ') {
            ans++;
            pos--;
        }
        return ans;
    }
*/

/*
    // 14 最长公共前缀 模拟
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        char[] chars = strs[0].toCharArray();
        for (int i = 0; i < chars.length; i++) {
            for (int j = 1; j < strs.length; j++)
                if (strs[j].length() <= i || chars[i] != strs[j].charAt(i))
                    return sb.toString();
            sb.append(chars[i]);
        }
        return sb.toString();
    }
*/

/*
    // 151 反转字符串中的单词 栈 模拟
    public String reverseWords(String s) {
        int len = s.length(), pos = 0;
        char[] chars = s.toCharArray();
        Stack<String> stack = new Stack<>();
        while (pos < len) {
            while (pos < len && chars[pos] == ' ')
                pos++;
            if (pos >= len)
                break;
            StringBuilder sb = new StringBuilder();
            while (pos < len && chars[pos] != ' ')
                sb.append(chars[pos++]);
            stack.push(sb.toString());
        }
        StringBuilder sb = new StringBuilder(stack.pop());
        while (!stack.isEmpty())
            sb.append(' ').append(stack.pop());
        return sb.toString();
    }
*/

/*
    // 6 Z 字型变换 模拟
    public String convert(String s, int numRows) {
        if (numRows < 2)
            return s;
        List<StringBuilder> rows = new ArrayList<>();
        for (int i = 0; i < numRows; i++)
            rows.add(new StringBuilder());
        int i = 0, flag = -1;
        for (char c : s.toCharArray()) {
            rows.get(i).append(c);
            if (i == 0 || i == numRows - 1)
                flag = -flag;
            i += flag;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows)
            res.append(row);
        return res.toString();
    }
*/

    // 28 找出字符串中第一个匹配项的下标 KMP
    public int strStr(String haystack, String needle) {
        int mLen = haystack.length(), nLen = needle.length();
        int[] next = new int[nLen];
        for (int i = 1, j = 0; i < nLen; i++) {
            while (j > 0 && needle.charAt(i) != needle.charAt(j))
                j = next[j - 1];
            if (needle.charAt(i) == needle.charAt(j))
                j++;
            next[i] = j;
        }

        for (int i = 0, j = 0; i < haystack.length(); i++) {
            while (j > 0 && haystack.charAt(i) != needle.charAt(j))
                j = next[j - 1];
            if (haystack.charAt(i) == needle.charAt(j))
                j++;
            if (j == nLen)
                return i - nLen + 1;
        }
        return -1;
    }

    @Test
    public void test() {
    }
}
