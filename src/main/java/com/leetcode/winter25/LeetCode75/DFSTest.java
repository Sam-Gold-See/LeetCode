package com.leetcode.winter25.LeetCode75;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * @author HuangChunXin
 * @date 2026/2/1 13:48
 */
public class DFSTest {

/*
	// 841. 钥匙和房间 DFS
	public boolean canVisitAllRooms(List<List<Integer>> rooms) {
		boolean[] visited = new boolean[rooms.size()];
		dfs(rooms, visited, 0);
		for (boolean b : visited) {
			if (!b) {
				return false;
			}
		}
		return true;
	}

	private void dfs(List<List<Integer>> rooms, boolean[] visited, int pos) {
		if (visited[pos]) {
			return;
		}
		visited[pos] = true;
		for (int k : rooms.get(pos)) {
			dfs(rooms, visited, k);
		}
	}
*/

/*
	// 547. 省份数量 DFS
	public int findCircleNum(int[][] isConnected) {
		int len = isConnected.length;
		boolean[] visited = new boolean[len];
		int cnt = 0;
		for (int i = 0;i<len;i++) {
			if (!visited[i]) {
				dfs(isConnected, visited, i, len);
				cnt++;
			}
		}
		return cnt;
	}

	private void dfs(int[][] isConnected, boolean[] visited, int pos, int len) {
		visited[pos] = true;
		for (int i = 0;i<len;i++) {
			if (isConnected[pos][i] == 1 && !visited[i]) {
				dfs(isConnected, visited, i, len);
			}
		}
	}
*/

	@Test
	public void test() {
	}
}
