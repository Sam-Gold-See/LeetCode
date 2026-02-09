package com.leetcode.winter25.LeetCode100;

import org.junit.Test;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * @author HuangChunXin
 * @date 2026/2/9 14:32
 */
public class GraphTest {

/*
	// 200. 岛屿数量 BFS
	private static final int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	public int numIslands(char[][] grid) {
		int m = grid.length, n = grid[0].length;
		int ans = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					bfs(grid, new int[]{i, j}, m, n);
					ans++;
				}
			}
		}
		return ans;
	}

	private void bfs(char[][] grid, int[] pos, int m, int n) {
		Deque<int[]> deque = new ArrayDeque<>();
		deque.offerLast(pos);
		grid[pos[0]][pos[1]] = '0';
		while (!deque.isEmpty()) {
			int[] now = deque.pollFirst();
			int x = now[0], y = now[1];
			for (int[] dir : DIR) {
				int tx = x + dir[0], ty = y + dir[1];
				if (tx >= 0 && tx < m && ty >= 0 && ty< n && grid[tx][ty] == '1') {
					grid[tx][ty] = '0';
					deque.offerLast(new int[]{tx, ty});
				}
			}
		}
	}
*/

/*
	// 200. 岛屿数量 DFS
	private static final int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	public int numIslands(char[][] grid) {
		int m = grid.length, n = grid[0].length;
		int ans = 0;
		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid[i].length; j++) {
				if (grid[i][j] == '1') {
					dfs(grid, i, j, m, n);
					ans++;
				}
			}
		}
		return ans;
	}

	private void dfs(char[][] grid, int x, int y, int m, int n) {
		for (int[] dir : DIR) {
			int tx = x + dir[0], ty = y + dir[1];
			if (tx < m && tx>= 0 && ty < n && ty >=0 && grid[tx][ty] == '1') {
				grid[tx][ty] = '0';
				dfs(grid, tx, ty, m, n);
			}
		}
	}
*/

/*
	// 994. 腐烂的橘子 BFS
	private static final int[][] DIR = new int[][]{{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	public int orangesRotting(int[][] grid) {
		int count = 0;
		int m = grid.length, n = grid[0].length;
		Deque<int[]> deque = new ArrayDeque<>();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					count++;
				} else if (grid[i][j] == 2) {
					deque.offerLast(new int[]{i, j});
				}
			}
		}
		if (count == 0) return 0;
		int ans = 0;
		while (!deque.isEmpty()) {
			int size = deque.size();
			boolean flag = false;
			while (size-- > 0) {
				int[] now = deque.pollFirst();
				int x = now[0], y = now[1];
				for (int[] dir : DIR) {
					int tx = x + dir[0], ty = y + dir[1];
					if (tx < m && tx >= 0 && ty < n && ty >= 0 && grid[tx][ty] == 1) {
						grid[tx][ty] = 2;
						deque.offerLast(new int[]{tx, ty});
						count--;
						flag = true;
					}
				}
			}
			if (flag) {
				ans++;
			}
		}
		return count == 0 ? ans : -1;
	}
*/

	// 207. 课程表

	@Test
	public void test() {
	}
}
