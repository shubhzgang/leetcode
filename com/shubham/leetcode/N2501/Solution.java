package com.shubham.leetcode.N2501;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/longest-square-streak-in-an-array/">2501. Longest Square Streak in an Array</a>
 */
class Solution {
    public int longestSquareStreak(int[] nums) {
        int max = -1;
        int currLen = 0;
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        Arrays.sort(nums);
        // System.out.println(set);
        for (int num: nums) {
            int sq = num;
            currLen = 0;
            while(set.contains(sq)) {
                // System.out.println(sq);
                set.remove(sq);
                sq *= sq;
                currLen++;
            }
            if (currLen > 1) {
                max = Math.max(max, currLen);
            }
        }
        return max;
    }
}
// Shubham Gangwal