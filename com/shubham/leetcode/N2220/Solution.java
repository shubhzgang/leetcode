package com.shubham.leetcode.N2220;

/**
 * <a href="https://leetcode.com/problems/minimum-bit-flips-to-convert-number/">2220. Minimum Bit Flips to Convert Number</a>
 */
class Solution {
    public int minBitFlips(int start, int goal) {
        int flips = 0;
        while (start != 0 || goal != 0) {
            if ((start & 1) != (goal & 1)) {
                flips++;
            }
            start = start >> 1;
            goal = goal >> 1;
        }
        return flips;
    }
}