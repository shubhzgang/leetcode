package com.shubham.leetcode.N1975;

/**
 * <a href="https://leetcode.com/problems/maximum-matrix-sum/">1975. Maximum Matrix Sum</a>
 */
class Solution {
    public long maxMatrixSum(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int minAbs = Integer.MAX_VALUE;
        int negCount = 0;
        int num;
        long sum = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                num = matrix[i][j];
                if (num < 0) {
                    negCount++;
                    minAbs = Math.min(minAbs, -1 * num);
                    sum -= num;
                } else {
                    minAbs = Math.min(minAbs, num);
                    sum += num;
                }
            }
        }
        if (negCount % 2 == 1) {
            return sum - 2 * minAbs;
        }
        return sum;
    }
}
// shubham gangwal