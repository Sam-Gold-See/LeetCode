package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class GraphTest {

/*
    // 200 岛屿数量 DFS
    private static int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    private char[][] grid;
    private int m, n;

    private void DFS(int i, int j) {
        for (int[] dir : DIR) {
            int tx = i + dir[0], ty = j + dir[1];
            if (tx >= 0 && tx < m && ty < n && ty >= 0 && grid[tx][ty] == '1') {
                grid[tx][ty] = '0';
                DFS(tx, ty);
            }
        }
    }

    public int numIslands(char[][] grid) {
        this.grid = grid;
        m = grid.length;
        n = grid[0].length;
        int ans = 0;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (grid[i][j] == '1') {
                    grid[i][j] = '0';
                    DFS(i, j);
                    ans++;
                }
        return ans;
    }
*/

/*
    // 130 被围绕的区域 DFS
    private char[][] board;
    private int m, n;
    private static int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

    public void solve(char[][] board) {
        if (board == null || board.length == 0)
            return;
        this.board = board;
        m = board.length;
        n = board[0].length;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++) {
                boolean isEdge = i == 0 || j == 0 || i == m - 1 || j == n - 1;
                if (isEdge && board[i][j] == 'O')
                    dfs(i, j);
            }

        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (board[i][j] == 'O')
                    board[i][j] = 'X';
                else if (board[i][j] == '#')
                    board[i][j] = 'O';
    }

    public void dfs(int i, int j) {
        if (i < 0 || j < 0 || i >= m || j >= n || board[i][j] == 'X' || board[i][j] == '#')
            return;
        board[i][j] = '#';
        for (int[] dir : DIR)
            dfs(i + dir[0], j + dir[1]);
    }
*/

/*
    // 207 课程表 BFS
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
            for (int cur : adjacency.get(pre))
                if (--indegrees[cur] == 0)
                    queue.offer(cur);
        }
        return numCourses == 0;
    }
*/

    @Test
    public void test() {
    }
}
