package com.shubham.leetcode.N1310;

/**
 * <a href="https://leetcode.com/problems/xor-queries-of-a-subarray/">1310. XOR Queries of a Subarray</a>
 */
class Solution {
    public int[] xorQueries(int[] arr, int[][] queries) {
        int n = arr.length;
        int[] xor = new int[n];
        xor[0] = arr[0];
        for (int i = 1; i < n; i++) {
            xor[i] = xor[i-1] ^ arr[i];
        }
        int l,r;
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            l = queries[i][0];
            r = queries[i][1];
            if (l > 0) {
                result[i] = xor[r] ^ xor[l - 1];
            } else {
                result[i] = xor[r];
            }
        }
        return result;
    }
}