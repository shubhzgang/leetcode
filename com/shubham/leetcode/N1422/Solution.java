package com.shubham.leetcode.N1422;

/**
 * <a href="https://leetcode.com/problems/maximum-score-after-splitting-a-string/">1422. Maximum Score After Splitting a String</a>
 */
class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int[] zeros = new int[n];
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == '0') {
                count++;
            }
            zeros[i] = count;
        }
        count = 0;
        int sum, maxSum;
        maxSum = 0;
        for (int i = n - 1; i > 0; i--) {
            if (s.charAt(i) == '1') {
                count++;
            }
            sum = count + zeros[i - 1];
            if (sum > maxSum) {
                maxSum = sum;
            }
        }
        return maxSum;
    }
}
// shubham gangwal
