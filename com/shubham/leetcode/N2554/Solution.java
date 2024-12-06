package com.shubham.leetcode.N2554;

/**
 * <a href="https://leetcode.com/problems/maximum-number-of-integers-to-choose-from-a-range-i/">2554. Maximum Number of Integers to Choose From a Range I</a>
 */
class Solution {
    public int maxCount(int[] banned, int n, int maxSum) {
        int[] set = new int[n + 1];
        for (int num: banned) {
            if (num <= n) {
                set[num] = 1;
            }
        }

        int sum = 0;
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (set[i] == 0) {
                sum += i;
                count++;
            }
            if (sum > maxSum) {
                count--;
                break;
            }
        }
        return count;
    }
}
// shubham gangwal