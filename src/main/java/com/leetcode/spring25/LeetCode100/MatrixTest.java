package com.leetcode.spring25.LeetCode100;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MatrixTest {

/*
    // 73 矩阵置零 模拟
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rowFlag = new boolean[m];
        boolean[] colFlag = new boolean[n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (matrix[i][j] == 0) {
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (rowFlag[i] || colFlag[j])
                    matrix[i][j] = 0;
    }
*/

/*
    // 54 螺旋矩阵 模拟
    public List<Integer> spiralOrder(int[][] matrix) {
        if (matrix.length == 0)
            return new ArrayList<>();
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        Integer[] res = new Integer[(r + 1) * (b + 1)];
        while (true) {
            for (int i = l; i <= r; i++)
                res[x++] = matrix[t][i];
            if (++t > b)
                break;
            for (int i = t; i <= b; i++)
                res[x++] = matrix[i][r];
            if (l > --r)
                break;
            for (int i = r; i >= l; i--)
                res[x++] = matrix[b][i];
            if (t > --b)
                break;
            for (int i = b; i >= t; i--)
                res[x++] = matrix[i][l];
            if (++l > r)
                break;
        }
        return Arrays.asList(res);
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
            for (int j = 0; j < n; j++) {
                matrix[j][n - 1 - i] = temp[i][j];
            }
    }
*/

/*
    // 240 搜索二维矩阵 II 模拟
    public boolean searchMatrix(int[][] matrix, int target) {
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if(matrix[i][j] > target)
                i--;
            else if(matrix[i][j] < target)
                j++;
            else
                return true;
        }
        return false;
    }
*/

    @Test
    public void test() {
    }
}
