package com.shubham.leetcode.N2419;

/**
 * <a href="https://leetcode.com/problems/longest-subarray-with-maximum-bitwise-and/">2419. Longest Subarray With Maximum Bitwise AND</a>
 */
class Solution {
    public int longestSubarray(int[] nums) {
        int max = nums[0];
        int count = 1;
        int maxCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max) {
                max = nums[i];
                count = 1;
                maxCount = 1;
            } else if (nums[i] == max) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}