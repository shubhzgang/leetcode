package com.shubham.leetcode.N2275;

/**
 * <a href="https://leetcode.com/problems/largest-combination-with-bitwise-and-greater-than-zero/">2275. Largest Combination With Bitwise AND Greater Than Zero</a>
 */
class Solution {
    public int largestCombination(int[] candidates) {
        int[] set = new int[33];
        int pos;
        for (int num: candidates) {
            pos = 0;
            while (num != 0) {
                set[pos++] += num & 1;
                num = num >> 1;
            }
        }
        int max = 1;
        for (int i = 0; i < 33; i++) {
            max = Math.max(set[i], max);
        }
        return max;
    }
}
// shubham gangwal