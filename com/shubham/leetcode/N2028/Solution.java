package com.shubham.leetcode.N2028;

/**
 * <a href="https://leetcode.com/problems/find-missing-observations/">2028. Find Missing Observations</a>
 */
class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int sum = 0;
        int m = rolls.length;
        for (int roll: rolls) {
            sum += roll;
        }
        int total = mean * (m + n);
        int remaining = total - sum;
        if (remaining > 6 * n || remaining < n) {
            return new int[0];
        }
        int[] ans = new int[n];
        for (int i = 0; i < n - 1; i++) {
            ans[i] = remaining / (n - i);
            remaining -= ans[i];
        }
        ans[n-1] = remaining;
        return ans;
    }
}