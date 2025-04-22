package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

import java.util.*;

public class GraphTest {

    /*
        private static final int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        private int rows;
        private int cols;
        private char[][] grid;

        static class Point {
            int x;
            int y;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }

        // 200 岛屿数量 图论 BFS
        public int numIslands(char[][] grid) {
            int cnt = 0;
            rows = grid.length;
            cols = grid[0].length;
            this.grid = grid;

            for (int i = 0; i < rows; i++)
                for (int j = 0; j < cols; j++)
                    if (grid[i][j] == '1') {
                        bfs(i, j);
                        cnt++;
                    }
            return cnt;
        }

        public void bfs(int i, int j) {
            Queue<Point> queue = new LinkedList<>();
            queue.offer(new Point(i, j));
            grid[i][j] = '0';
            while (!queue.isEmpty()) {
                Point cur = queue.poll();
                for (int[] dir : DIR) {
                    int tx = cur.x + dir[0];
                    int ty = cur.y + dir[1];
                    if (tx >= 0 && tx < rows && ty >= 0 && ty < cols && grid[tx][ty] == '1') {
                        queue.offer(new Point(tx, ty));
                        grid[tx][ty] = '0';
                    }
                }
            }
        }
    */
/*
    private final int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private int rows;
    private int cols;
    private char[][] grid;

    // 200 岛屿数量 图论 DFS
    public int numIslands(char[][] grid) {
        this.grid = grid;
        int cnt = 0;
        rows = grid.length;
        cols = grid[0].length;
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (grid[i][j] == '1') {
                    grid[i][j] = '0';
                    cnt++;
                    dfs(i, j);
                }
        return cnt;
    }

    private void dfs(int x, int y) {
        for (int[] dir : DIR) {
            int tx = x + dir[0];
            int ty = y + dir[1];
            if (tx >= 0 && tx < rows && ty >= 0 && ty < cols && grid[tx][ty] == '1') {
                grid[tx][ty] = '0';
                dfs(tx, ty);
            }
        }
    }
*/

/*
    private final int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    // 994 腐烂的橘子 图论 BFS
    public int orangesRotting(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        int cnt1 = 0, cnt2 = 0;

        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                if (grid[i][j] != 0) {
                    cnt1++;
                    if (grid[i][j] == 2) {
                        cnt2++;
                        queue.offer(new int[]{i, j, 0});
                    }
                }
        if (cnt1 == cnt2 || cnt1 == 0)
            return 0;
        while (!queue.isEmpty()) {
            int[] cur = queue.poll();
            int x = cur[0], y = cur[1], time = cur[2] + 1;
            for (int[] dir : DIR) {
                int tx = x + dir[0], ty = y + dir[1];
                if (tx >= 0 && tx < rows && ty >= 0 && ty < cols && grid[tx][ty] == 1) {
                    grid[tx][ty] = 2;
                    cnt2++;
                    queue.offer(new int[]{tx, ty, time});
                }
            }
            if(cnt2 == cnt1)
                return time;
        }
        return -1;
    }
*/

/*
    // 207 课程表 图论 BFS
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        int[] indegrees = new int[numCourses];
        Queue<Integer> queue = new LinkedList<>();
        List<List<Integer>> adjacency = new ArrayList<>();
        for (int i = 0; i < numCourses; i++)
            adjacency.add(new ArrayList<>());

        for (int[] side : prerequisites) {
            indegrees[side[0]]++;
            adjacency.get(side[1]).add(side[0]);
        }

        for (int i = 0; i < numCourses; i++)
            if (indegrees[i] == 0)
                queue.offer(i);
        while (!queue.isEmpty()) {
            int pre = queue.poll();
            numCourses--;
            for (int cur : adjacency.get(pre)) {
                if (--indegrees[cur] == 0)
                    queue.offer(cur);
            }
        }
        return numCourses == 0;
    }
*/

    @Test
    public void test() {
    }
}
