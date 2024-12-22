package com.shubham.leetcode.N128;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/longest-consecutive-sequence/">128. Longest Consecutive Sequence</a>
 */
class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        int ans = 0;
        int count = 0;
        for (int num: nums) {
            count = 0;
            if (!set.contains(num - 1)) {
                while (set.contains(num++)) {
                    count++;
                }
                if (count > ans) {
                    ans = count;
                }
            }
        }
        return ans;
    }
}
// shubham gangwal