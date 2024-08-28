package com.shubham.leetcode.N1905;

/**
 * <a href="https://leetcode.com/problems/count-sub-islands/">1905. Count Sub Islands</a>
 */
public class Solution {
    boolean isSubIsland;
    int rows, cols;
    public int countSubIslands(int[][] grid1, int[][] grid2) {
        rows = grid1.length;
        cols = grid1[0].length;
        int count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid2[i][j] == 1) {
                    isSubIsland = true;
                    dfs(grid1, grid2, i, j);
                    if (isSubIsland) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    private void dfs(int[][] grid1, int[][] grid2, int i, int j) {
        if (i == rows || j == cols || i < 0 || j < 0 || grid2[i][j] == 0) {
            return;
        }
        if (grid1[i][j] == 0) {
            isSubIsland = false;
        }
        grid2[i][j] = 0;

        dfs(grid1, grid2, i - 1, j);
        dfs(grid1, grid2, i + 1, j);
        dfs(grid1, grid2, i, j - 1);
        dfs(grid1, grid2, i, j + 1);
    }
}
