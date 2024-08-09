package com.shubham.leetcode.N840;

public class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;

        if (rows < 3 || cols < 3) {
            return 0;
        }
        int ans= 0;
        for (int i = 0; i < rows - 2; i++) {
            for (int j = 0; j < cols - 2; j++) {
                if (isMagicSquare(i, j, grid)) {
                    ans++;
                }
            }
        }
        return ans;
    }

    private boolean isMagicSquare(int row, int col, int[][] grid) {
        int[] count = new int[9];
        for (int i = row; i < row + 3; i++) {
            for (int j = col; j < col + 3; j++) {
                if (grid[i][j] < 1 || grid[i][j] > 9) {
                    return false;
                }
                count[grid[i][j] - 1]++;
                if (count[grid[i][j]-1] != 1) {
                    return false;
                }
            }
        }

        int sum = grid[row][col] + grid[row][col + 1] + grid[row][col + 2];
        int sum2;

        for (int i = row + 1; i < row + 3; i++) {
            sum2 = 0;
            for (int j = col; j < col + 3; j++) {
                sum2 += grid[i][j];
            }
            if (sum != sum2) {
                return false;
            }
        }

        for (int j = col; j < col + 3; j++) {
            sum2 = 0;
            for (int i = row; i < row + 3; i++) {
                sum2 += grid[i][j];
            }
            if (sum != sum2) {
                return false;
            }
        }

        sum2 = grid[row][col] + grid[row+1][col+1] + grid[row+2][col+2];
        if (sum != sum2) {
            return false;
        }
        sum2 = grid[row][col+2] + grid[row+1][col+1] + grid[row+2][col];
        return sum == sum2;
    }
}
