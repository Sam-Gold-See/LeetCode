package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

public class QueueTest {

/*
    // 933 最近的请求次数 队列
    class RecentCounter {

        Queue<Integer> queue;

        public RecentCounter() {
            queue = new ArrayDeque<>();
        }

        public int ping(int t) {
            queue.offer(t);
            while(queue.peek() < t -3000)
                queue.poll();
            return queue.size();
        }
    }
*/

/*
    // 649 Dota2 参议院 队列
    public String predictPartyVictory(String senate) {
        int n = senate.length();
        Queue<Integer> radiant = new ArrayDeque<>();
        Queue<Integer> dire = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            if (senate.charAt(i) == 'R')
                radiant.offer(i);
            else
                dire.offer(i);
        }
        while (!radiant.isEmpty() && !dire.isEmpty()) {
            int radiantIndex = radiant.poll();
            int direIndex = dire.poll();
            if (radiantIndex < direIndex)
                radiant.offer(radiantIndex + n);
            else
                dire.offer(direIndex + n);
        }
        return !radiant.isEmpty() ? "Radiant" : "Dire";
    }
*/

    @Test
    public void test() {
    }
}
