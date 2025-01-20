package com.shubham.leetcode.N73;

/**
 * <a href="https://leetcode.com/problems/set-matrix-zeroes/">73. Set Matrix Zeroes</a>
 */
class Solution {
    public void setZeroes(int[][] matrix) {
        boolean firstCol = false;
        boolean firstRow = false;
        int rows = matrix.length;
        int cols = matrix[0].length;
        for (int i = 0; i < cols; i++) {
            if (matrix[0][i] == 0) {
                firstRow = true;
                break;
            }
        }
        for (int i = 0; i < rows; i++) {
            if (matrix[i][0] == 0) {
                firstCol = true;
            }
        }
        for (int i = 1; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;
                    matrix[0][j] = 0;
                }
            }
        }
        for (int i = 1; i < cols; i++) {
            if (matrix[0][i] == 0) {
                for(int j = 1; j < rows; j++) {
                    matrix[j][i] = 0;
                }
            }
        }
        for (int i = 1; i < rows; i++) {
            if (matrix[i][0] == 0) {
                for (int j = 1; j < cols; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        if (firstCol) {
            for (int i = 0; i < rows; i++) {
                matrix[i][0] = 0;
            }
        }
        if (firstRow) {
            for (int j = 0; j < cols; j++) {
                matrix[0][j] = 0;
            }
        }
    }
}
// shubham gangwal