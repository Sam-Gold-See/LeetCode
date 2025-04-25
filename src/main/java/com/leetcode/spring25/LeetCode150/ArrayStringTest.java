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

    @Test
    public void test() {
    }
}
