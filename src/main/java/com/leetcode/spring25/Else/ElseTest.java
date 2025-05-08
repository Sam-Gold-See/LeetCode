package com.leetcode.spring25.Else;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

public class ElseTest {

/*
    // 509 斐波那契数 DP
    public int fib(int n) {
        if (n < 2)
            return n;
        int[] dp = new int[n + 1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i <= n; i++)
            dp[i] = dp[i - 1] + dp[i - 2];
        return dp[n];
    }
*/

/*
    // 275 H 指数 II 模拟
    public int hIndex(int[] citations) {
        int len = citations.length;
        int h = 0, i = len - 1;
        while (i >= 0 && citations[i] > h) {
            h++;
            i--;
        }
        return h;
    }
*/

/*
    // 1920 基于排列构建数组 模拟
    public int[] buildArray(int[] nums) {
        int len = nums.length;
        int[] ans = new int[len];
        for(int i = 0;i < len; i++)
            ans[i] = nums[nums[i]];
        return ans;
    }
*/

/*
    // 3341 到达最后一个房间的最少时间 I BFS
    private final static int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length, n = moveTime[0].length;
        int[][] distance = new int[m][n];
        for (int i = 0; i < m; i++)
            Arrays.fill(distance[i], Integer.MAX_VALUE);
        distance[0][0] = 0;
        Queue<int[]> queue = new ArrayDeque<>();
        queue.offer(new int[]{0, 0, 0});
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            for (int[] dir : DIR) {
                int tx = now[0] + dir[0], ty = now[1] + dir[1];
                if (tx < 0 || tx >= m || ty < 0 || ty >= n)
                    continue;
                int time = Math.max(now[2], moveTime[tx][ty]);
                time++;
                if (time < distance[tx][ty]) {
                    distance[tx][ty] = time;
                    queue.offer(new int[]{tx, ty, time});
                }
            }
        }
        return distance[m - 1][n - 1];
    }
*/

/*
    // 3342 到达最后一个房间的最少时间 II BFS
    private final static int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public int minTimeToReach(int[][] moveTime) {
        int m = moveTime.length, n = moveTime[0].length;
        int[][] distance = new int[m][n];
        for (int i = 0; i < m; i++)
            Arrays.fill(distance[i], Integer.MAX_VALUE);
        distance[0][0] = 0;
        PriorityQueue<int[]> queue = new PriorityQueue<>((a, b) -> a[2] - b[2]);
        queue.offer(new int[]{0, 0, 0, 1});
        while (!queue.isEmpty()) {
            int[] now = queue.poll();
            if (now[0] == m - 1 && now[1] == n - 1)
                return now[2];
            for (int[] dir : DIR) {
                int tx = now[0] + dir[0], ty = now[1] + dir[1];
                if (tx < 0 || tx >= m || ty < 0 || ty >= n)
                    continue;
                int time = now[3] + Math.max(now[2], moveTime[tx][ty]);
                if (time < distance[tx][ty]) {
                    distance[tx][ty] = time;
                    queue.offer(new int[]{tx, ty, time, now[3] == 1 ? 2 : 1});
                }
            }
        }
        return -1;
    }
*/

    @Test
    public void test() {
    }
}
