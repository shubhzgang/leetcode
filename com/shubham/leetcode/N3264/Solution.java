package com.shubham.leetcode.N3264;

/**
 * <a href="https://leetcode.com/problems/final-array-state-after-k-multiplication-operations-i/">3264. Final Array State After K Multiplication Operations I</a>
 */
class Solution {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        int n = nums.length;
        int min = 101;
        for (int i = 0; i < k; i++) {
            min = nums[0];
            int minI = 0;
            for (int j = 1; j < n; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    minI = j;
                }
            }
            nums[minI] *= multiplier;
        }
        return nums;
    }
}
// shubham gangwal