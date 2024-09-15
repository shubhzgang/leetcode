package com.shubham.leetcode.N1371;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/find-the-longest-substring-containing-vowels-in-even-counts/">1371. Find the Longest Substring Containing Vowels in Even Counts</a>
 */
class Solution {
    public int findTheLongestSubstring(String s) {
        int[] map = new int[32];
        Arrays.fill(map, -2);
        int mask = 0;
        int maxLen = 0;
        map[0] = -1;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch(c) {
                case 'a':
                    mask ^= 1;
                    break;
                case 'e':
                    mask ^= 2;
                    break;
                case 'i':
                    mask ^= 4;
                    break;
                case 'o':
                    mask ^= 8;
                    break;
                case 'u':
                    mask ^= 16;
                    break;
                default:
            }

            int prev = map[mask];
            if (prev == -2) {
                map[mask] = i;
            } else {
                maxLen = Math.max(i - prev, maxLen);
            }
        }
        return maxLen;
    }
}