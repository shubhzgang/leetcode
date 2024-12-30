package com.shubham.leetcode.N2466;

/**
 * <a href="https://leetcode.com/problems/count-ways-to-build-good-strings/">2466. Count Ways To Build Good Strings</a>
 */
class Solution {
    public int countGoodStrings(int low, int high, int zero, int one) {
        int[] combs = new int[high + 1];
        combs[zero]++;
        combs[one]++;
        int min = Math.min(zero, one);
        int zs, os;
        for (int i = min + 1; i < high + 1; i++) {
            zs = (i - zero) < 0 ? 0 : combs[i - zero];
            os = (i - one) < 0 ? 0 : combs[i - one];
            combs[i] = (combs[i] + zs + os) % 1000000007;
        }
        int ans = 0;
        for (int i = low; i <= high; i++) {
            ans = (ans + combs[i]) % 1000000007;
        }
        return ans;
    }
}