package com.shubham.leetcode.N1652;

/**
 * <a href="https://leetcode.com/problems/defuse-the-bomb/">1652. Defuse the Bomb</a>
 */
class Solution {
    public int[] decrypt(int[] code, int k) {
        int n = code.length;
        int res[] = new int[n];
        if (k == 0) {
            return res;
        }
        int sum = 0;
        if (k > 0) {
            for (int i = 0; i < n; i++) {
                sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i + j + n) % n];
                }
                res[i] = sum;
            }
        } else {
            k = -1 * k;
            for (int i = 0; i < n; i++) {
                sum = 0;
                for (int j = 1; j <= k; j++) {
                    sum += code[(i - j + n) % n];
                }
                res[i] = sum;
            }
        }
        return res;

    }
}

