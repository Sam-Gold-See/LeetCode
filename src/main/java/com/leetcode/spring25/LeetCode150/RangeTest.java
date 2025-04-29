package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class RangeTest {

/*
    // 228 汇总区间 模拟
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            int a = nums[i];
            int temp = a;
            while (i < len - 1 && nums[i + 1] == temp + 1) {
                temp++;
                i++;
            }
            if (temp != a)
                ans.add(a + "->" + temp);
            else
                ans.add(a + "");
        }
        return ans;
    }
*/

/*
    // 56 合并区间 排序 栈
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);
        List<int[]> list = new ArrayList<>();
        int pos = -1;
        for (int[] interval : intervals) {
            if (pos >= 0 && interval[0] <= list.get(pos)[1])
                list.get(pos)[1] = Math.max(list.get(pos)[1], interval[1]);
            else {
                list.add(interval);
                pos++;
            }
        }
        return list.toArray(new int[list.size()][]);
    }
*/

/*
    // 452 用最少数量的箭引爆气球 排序 贪心
    public int findMinArrowShots(int[][] points) {
        if (points == null || points.length == 0) return 0;

        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));

        int arrows = 1;
        int end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > end) {
                arrows++;
                end = points[i][1];
            }
        }
        return arrows;
    }
*/

    @Test
    public void test() {
    }
}
