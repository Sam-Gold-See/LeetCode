package com.leetcode.winter25.LeetCode75;

import org.junit.Test;

import java.awt.desktop.PreferencesEvent;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

/**
 * @author HuangChunXin
 * @date 2026/2/1 14:06
 */
public class BFSTest {

/*
	// 1926. 迷宫中离入口最近的出口 BFS
	private static final int[][] DIR = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	public int nearestExit(char[][] maze, int[] entrance) {
		int m = maze.length, n = maze[0].length;
		maze[entrance[0]][entrance[1]] = '+';
		Deque<int[]> queue = new ArrayDeque<>();
		queue.offerLast(new int[]{entrance[0], entrance[1], 0});
		while (!queue.isEmpty()) {
			int[] pos = queue.pollFirst();
			int x = pos[0], y = pos[1], step = pos[2] + 1;
			for (int[] dir : DIR) {
				int tx = x + dir[0], ty = y + dir[1];
				if (tx == -1 || tx == m || ty == -1 || ty == n || maze[tx][ty] == '+') {
					continue;
				}
				if (tx == 0 || tx == m - 1 || ty == 0 || ty == n - 1) {
					return step;
				}
				queue.offerLast(new int[]{tx, ty, step});
				maze[tx][ty] = '+';
			}
		}
		return -1;
	}
*/

/*
	// 994. 腐烂的橘子 BFS
	private static final int[][] DIR = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};

	public int orangesRotting(int[][] grid) {
		Deque<int[]> deque = new ArrayDeque<>();
		int goal = 0, time = 0;
		int m = grid.length, n = grid[0].length;
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 1) {
					goal++;
				} else if (grid[i][j] == 2) {
					deque.offerLast(new int[]{i, j});
				}
			}
		}
		while (!deque.isEmpty() && goal > 0) {
			int size = deque.size();
			while (size-- != 0) {
				int[] pos = deque.pollFirst();
				int x = pos[0], y = pos[1];
				for (int[] dir : DIR) {
					int tx = x + dir[0], ty = y + dir[1];
					if (tx == -1 || tx == m || ty == -1 || ty == n || grid[tx][ty] != 1) {
						continue;
					}
					grid[tx][ty] = 2;
					goal--;
					deque.offerLast(new int[]{tx, ty});
				}
			}
			time++;
		}
		return goal == 0 ? time : -1;
	}
*/

	@Test
	public void test() {
	}
}
