package com.leetcode.spring25.LeetCode150;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixTest {

/*
    // 36 有效的数独 位运算
    public boolean isValidSudoku(char[][] board) {
        int[] row = new int[10], col = new int[10], room = new int[10];
        int len = board.length;
        for (int i = 0; i < len; i++)
            for (int j = 0; j < len; j++) {
                char c = board[i][j];
                if (c == '.') continue;
                int num = c - '0';
                int idx = i / 3 * 3 + j / 3;
                if (((row[i] >> num) & 1) == 1 || ((col[j] >> num) & 1) == 1 || (((room[idx]) >> num) & 1) == 1)
                    return false;
                row[i] |= (1 << num);
                col[j] |= (1 << num);
                room[idx] |= (1 << num);
            }
        return true;
    }
*/

/*
    // 54 螺旋矩阵 模拟
    public List<Integer> spiralOrder(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        if (m == 0)
            return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int l = 0, r = n - 1, t = 0, b = m - 1;
        while (true) {
            for (int i = l; i <= r; i++)
                ans.add(matrix[t][i]);
            if (++t > b) break;
            for (int i = t; i <= b; i++)
                ans.add(matrix[i][r]);
            if (--r < l) break;
            for (int i = r; i >= l; i--)
                ans.add(matrix[b][i]);
            if (--b < t) break;
            for (int i = b; i >= t; i--)
                ans.add(matrix[i][l]);
            if (++l > r) break;
        }
        return ans;
    }
*/

/*
    // 48 旋转图像 模拟
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int[][] temp = new int[n][n];
        for (int i = 0; i < n; i++)
            temp[i] = Arrays.copyOfRange(matrix[i], 0, n);
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[j][n - 1 - i] = temp[i][j];
    }
*/

/*
    // 73 矩阵置零 模拟
    public void setZeroes(int[][] matrix) {
        int m = matrix.length, n = matrix[0].length;
        boolean[] rows = new boolean[m], cols = new boolean[n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (rows[i] || cols[j])
                    matrix[i][j] = 0;
    }
*/

/*
    // 289 生命游戏 模拟
    public void gameOfLife(int[][] board) {
        int m = board.length, n = board[0].length;
        int[][] cnt = new int[m][n];
        int[][] dirs = new int[][]{{0, 1}, {1, 1}, {1, 0}, {1, -1}, {0, -1}, {-1, -1}, {-1, 0}, {-1, 1}};
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                for (int[] dir : dirs) {
                    int tx = i + dir[0], ty = j + dir[1];
                    if (tx >= 0 && tx < m && ty >= 0 && ty < n)
                        cnt[i][j] += board[tx][ty];
                }


        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (board[i][j] == 1) {
                    if (cnt[i][j] < 2 || cnt[i][j] > 3)
                        board[i][j] = 0;
                } else if (cnt[i][j] == 3)
                    board[i][j] = 1;
    }
*/

    @Test
    public void test() {
    }
}
