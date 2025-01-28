package com.shubham.leetcode.N2658;

/**
 * <a href="https://leetcode.com/problems/maximum-number-of-fish-in-a-grid/">2658. Maximum Number of Fish in a Grid</a>
 */
class Solution {
    public int findMaxFish(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int ans = 0, fish = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                fish = dfs(i, j, grid);
                if (fish > ans) {
                    ans = fish;
                }
            }
        }
        return ans;
    }

    private int dfs(int row, int col, int[][] grid) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length) {
            return 0;
        }
        if (grid[row][col] < 1) {
            return 0;
        }
        int fish = grid[row][col];
        grid[row][col] = 0;
        fish += dfs(row - 1, col, grid);
        fish += dfs(row, col - 1, grid);
        fish += dfs(row, col + 1, grid);
        fish += dfs(row + 1, col, grid);
        return fish;
    }
}
// shubham gangwal