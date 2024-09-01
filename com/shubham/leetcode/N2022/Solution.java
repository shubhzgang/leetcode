package com.shubham.leetcode.N2022;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/convert-1d-array-into-2d-array/">2022. Convert 1D Array Into 2D Array</a>
 */
class Solution {
    public int[][] construct2DArray(int[] original, int m, int n) {
        int len = original.length;
        if (m * n != len) {
            return new int[0][0];
        }
        int[][] res = new int[m][];
        for (int i = 0; i < m; i++) {
            res[i] = Arrays.copyOfRange(original, n * i, n * i + n);
        }
        return res;
    }
}