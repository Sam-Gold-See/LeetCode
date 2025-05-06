package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PriorityQueueTest {

/*
    // 215 数组中的第 K 个最大元素 优先队列
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((o1, o2) -> o2 - o1);
        for (int num : nums)
            pq.offer(num);
        while (--k != 0)
            pq.poll();
        return pq.poll();
    }
*/

/*
    // 295 数据流的中位数 优先队列
    class MedianFinder {
        private PriorityQueue<Integer> min;
        private PriorityQueue<Integer> max;

        public MedianFinder() {
            min = new PriorityQueue<>();
            max = new PriorityQueue<>((o1, o2) -> o2 - o1);
        }

        public void addNum(int num) {
            if (min.size() != max.size()) {
                min.add(num);
                max.add(min.poll());
            } else {
                max.add(num);
                min.add(max.poll());
            }
        }

        public double findMedian() {
            return min.size() != max.size() ? min.peek() : (min.peek() + max.peek()) / 2.0;
        }
    }
*/

    @Test
    public void test() {
    }
}
