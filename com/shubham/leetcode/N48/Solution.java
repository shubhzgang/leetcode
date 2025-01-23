package com.shubham.leetcode.N48;

/**
 * <a href="https://leetcode.com/problems/rotate-image/">48. Rotate Image</a>
 */
class Solution {
    public void rotate(int[][] matrix) {
        int layer = 0;
        int n = matrix.length;
        int temp, layerEnd, iEnd;
        for (; layer < n / 2; layer++) {
            for (int i = layer; i < n - layer - 1; i++) {
                layerEnd = n - layer - 1;
                iEnd = n - i - 1;
                temp = matrix[layer][i];
                matrix[layer][i] = matrix[iEnd][layer];
                matrix[iEnd][layer] = matrix[layerEnd][iEnd];
                matrix[layerEnd][iEnd] = matrix[i][layerEnd];
                matrix[i][layerEnd] = temp;
            }
        }
    }
}
// shubham gangwal