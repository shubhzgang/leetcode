package com.shubham.leetcode.N463;

class Solution {
    int[][] grid;
    int rows, cols;
    int ans;

    public int islandPerimeter(int[][] grid) {
        this.ans = 0;
        this.grid = grid;
        rows = grid.length;
        cols = grid[0].length;
        int row, col;
        for (row = 0; row < rows; row++) {
            for (col = 0; col < cols; col++) {
                if (grid[row][col] == 1) {
                    isOutOrWater(row, col - 1);
                    isOutOrWater(row, col + 1);
                    isOutOrWater(row - 1, col);
                    isOutOrWater(row + 1, col);
                }
            }
        }
        return ans;
    }
    private void isOutOrWater(int row, int col) {
        if (row >= rows || col >= cols || row < 0 || col < 0) {
            ans++;
            return;
        }
        if (grid[row][col] == 0) {
            ans++;
            return;
        }
        return;
    }
}