package com.shubham.leetcode.N1769;

/**
 * <a href="https://leetcode.com/problems/minimum-number-of-operations-to-move-all-balls-to-each-box/">1769. Minimum Number of Operations to Move All Balls to Each Box</a>
 */
class Solution {
    public int[] minOperations(String boxes) {
        char[] carr = boxes.toCharArray();
        int n = carr.length;
        int[] ans = new int[n];
        int count = 0;
        int balls = 0;
        for (int i = 0; i < n; i++) {
            ans[i] = count;
            if (carr[i] == '1') {
                balls++;
            }
            count += balls;
        }
        count = balls = 0;
        for (int i = n - 1; i >= 0; i--) {
            ans[i] += count;
            if (carr[i] == '1') {
                balls++;
            }
            count += balls;
        }
        return ans;
    }
}
// shubham gangwal