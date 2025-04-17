package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class BFSTest {

/*
    private static final int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    // 1926 迷宫中离入口最近的出口 BFS
    public int nearestExit(char[][] maze, int[] entrance) {
        int m = maze.length, n = maze[0].length;
        maze[entrance[0]][entrance[1]] = '+';
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[]{entrance[0], entrance[1], 0});
        while (!queue.isEmpty()) {
            int[] front = queue.poll();
            int x = front[0], y = front[1], step = front[2] + 1;
            for (int[] dir : directions) {
                int tx = x + dir[0], ty = y + dir[1];
                if (tx == -1 || tx == m || ty == -1 || ty == n || maze[tx][ty] == '+') continue;
                if (tx == 0 || tx == m - 1 || ty == 0 || ty == n - 1) return step;
                queue.offer(new int[]{tx, ty, step});
                maze[tx][ty] = '+';
            }
        }
        return -1;
    }
*/

/*
    private static final int[][] directions = {{-1, 0}, {0, 1}, {1, 0}, {0, -1}};

    // 994 腐烂的橘子 BFS
    public int orangesRotting(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int cnt1 = 0, cnt2 = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] != 0) {
                    cnt1++;
                    if (grid[i][j] == 2) {
                        cnt2++;
                        queue.offer(new int[]{i, j, 0});
                    }
                }
        if (cnt1 == cnt2 || cnt1 == 0)
            return 0;
        if (cnt2 == 0)
            return -1;
        while (!queue.isEmpty()) {
            int[] poll = queue.poll();
            int x = poll[0], y = poll[1], time = poll[2] + 1;
            for (int[] d : directions) {
                int tx = x + d[0], ty = y + d[1];
                if (tx == -1 || tx == m || ty == -1 || ty == n)
                    continue;
                if (grid[tx][ty] == 1) {
                    grid[tx][ty] = 2;
                    cnt2++;
                    queue.offer(new int[]{tx, ty, time});
                }
            }
            if (cnt2 == cnt1)
                return time;
        }
        return -1;
    }
*/

    @Test
    public void test() {
    }
}
