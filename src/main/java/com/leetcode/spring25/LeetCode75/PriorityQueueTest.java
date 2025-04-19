package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

import java.util.Arrays;
import java.util.PriorityQueue;

public class PriorityQueueTest {

/*
    // 215 数组中的第K个最大元素 优先队列
    public int findKthLargest(int[] nums, int k) {
        int len = nums.length;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> o1 - o2);
        for(int i = 0; i < k; i++)
            priorityQueue.offer(nums[i]);

        for(int i = k; i < len; i++){
            Integer topElement = priorityQueue.peek();
            if(nums[i] > topElement){
                priorityQueue.poll();
                priorityQueue.offer(nums[i]);
            }
        }
        return priorityQueue.peek();
    }
*/

/*
    // 2336 无限集中的最小数字 优先队列
    boolean[] vis = new boolean[1001];
    PriorityQueue<Integer> pq = new PriorityQueue<>(Integer::compareTo);
    int idx = 1;

    public SmallestInfiniteSet() {
    }

    public int popSmallest() {
        int ans = -1;
        if (!pq.isEmpty()) {
            ans = pq.poll();
            vis[ans] = false;
        } else
            ans = idx++;
        return ans;
    }

    public void addBack(int num) {
        if (num >= idx || vis[num])
            return;
        if (num == idx - 1)
            idx--;
        else {
            pq.offer(num);
            vis[num] = true;
        }
    }
*/

/*
    // 2542 最大子序列的分数 优先队列
    public long maxScore(int[] nums1, int[] nums2, int k) {
        int n = nums1.length;
        Integer[] ids = new Integer[n];
        for (int i = 0; i < n; i++)
            ids[i] = i;
        Arrays.sort(ids, (i, j) -> nums2[j] - nums2[i]);

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums1[ids[i]];
            pq.add(nums1[ids[i]]);
        }

        long ans = sum * nums2[ids[k - 1]];
        for (int i = k; i < n; i++) {
            int x = nums1[ids[i]];
            if (x > pq.peek()) {
                sum += x - pq.poll();
                pq.offer(x);
                ans = Math.max(ans, sum * nums2[ids[i]]);
            }
        }
        return ans;
    }
*/

/*
    // 2462 雇佣K位工人的总代价 优先队列
    public long totalCost(int[] costs, int k, int candidates) {
        int n = costs.length;
        long ans = 0;
        if (candidates * 2 + k > n) {
            Arrays.sort(costs);
            for (int i = 0; i < k; i++)
                ans += costs[i];
            return ans;
        }

        PriorityQueue<Integer> pre = new PriorityQueue<>();
        PriorityQueue<Integer> suf = new PriorityQueue<>();
        for (int i = 0; i < candidates; i++) {
            pre.offer(costs[i]);
            suf.offer(costs[n - 1 - i]);
        }

        int i = candidates;
        int j = n - 1 - candidates;
        while (k-- > 0) {
            if(pre.peek() <= suf.peek()){
                ans += pre.poll();
                pre.offer(costs[i++]);
            }else {
                ans += suf.poll();
                suf.offer(costs[j--]);
            }
        }
        return ans;
    }
*/

    @Test
    public void test() {
    }
}
