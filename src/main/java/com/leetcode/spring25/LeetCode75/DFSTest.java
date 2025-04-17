package com.leetcode.spring25.LeetCode75;

import org.junit.Test;

import java.util.List;

public class DFSTest {

/*
    // 841 钥匙和房间 DFS
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        boolean[] visited = new boolean[rooms.size()];
        dfs(rooms, visited, 0);
        for (boolean b : visited)
            if (!b)
                return false;
        return true;
    }

    private void dfs(List<List<Integer>> rooms, boolean[] visited, int pos) {
        if (visited[pos])
            return;
        visited[pos] = true;
        for (int k : rooms.get(pos))
            dfs(rooms, visited, k);
    }
*/

/*
    // 547 省份数量 DFS
    public int findCircleNum(int[][] isConnected) {
        int len = isConnected.length;
        boolean[] visited = new boolean[len];
        int cnt = 0;
        for (int i = 0; i < len; i++)
            if (!visited[i]) {
                dfs(isConnected, visited, i, len);
                cnt++;
            }
        return cnt;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int pos, int len) {
        visited[pos] = true;
        for (int i = 0; i < len; i++) {
            if (isConnected[pos][i] == 1 && !visited[i])
                dfs(isConnected, visited, i, len);
        }
    }
*/

/*
    // 1466 重新规划路线 DFS
    private int count;

    public int minReorder(int n, int[][] connections) {
        List<List<int[]>> graph = buildGraph(n, connections);
        boolean[] visited = new boolean[n];
        dfs(graph, visited, 0);
        return count;
    }

    private List<List<int[]>> buildGraph(int n, int[][] connections) {
        List<List<int[]>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++)
            graph.add(new ArrayList<>());
        for (int[] connection : connections) {
            int from = connection[0];
            int to = connection[1];
            graph.get(from).add(new int[]{to, 1});
            graph.get(to).add(new int[]{from, 0});
        }
        return graph;
    }

    void dfs(List<List<int[]>> graph, boolean[] visited, int city) {
        visited[city] = true;
        for (int[] neighbor : graph.get(city)) {
            int nextCity = neighbor[0];
            int reverse = neighbor[1];
            if(!visited[nextCity]) {
                count += reverse;
                dfs(graph, visited, nextCity);
            }
        }
    }
*/

/*
    // 399 除法求职
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        
    }
*/

    @Test
    public void test() {

    }
}
