package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

public class PriorityQueueTest {

/*
    // 215 数组中的第K个最大元素 优先队列
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : nums)
            pq.offer(num);
        int ans = pq.peek();
        while (k-- > 0)
            ans = pq.poll();
        return ans;
    }
*/

/*
    // 347 前K个高频元素 优先队列
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        for (int num : nums)
            map.put(num, map.getOrDefault(num, 0) + 1);
        for (Integer key : map.keySet())
            pq.offer(new int[]{key, map.get(key)});
        int[] ans = new int[k];
        int i = 0;
        while (i++ < k)
            ans[i - 1] = pq.poll()[0];
        return ans;
    }
*/

    @Test
    public void test() {
    }
}
