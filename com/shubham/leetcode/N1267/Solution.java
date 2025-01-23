package com.shubham.leetcode.N1267;

/**
 * <a href="https://leetcode.com/problems/count-servers-that-communicate/">1267. Count Servers that Communicate</a>
 */
class Solution {
    public int countServers(int[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        int[] rowContains = new int[rows];
        int[] colContains = new int[cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    rowContains[i]++;
                    colContains[j]++;
                }
            }
        }
        int ans = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1) {
                    if ((rowContains[i] > 1) || (colContains[j] > 1)) {
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
}
// shubham gangwal