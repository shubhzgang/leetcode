package com.shubham.leetcode.N2270;

/**
 * <a href="https://leetcode.com/problems/number-of-ways-to-split-array/">2270. Number of Ways to Split Array</a>
 */
class Solution {
    public int waysToSplitArray(int[] nums) {
        int ans = 0;
        int n = nums.length;
        long preSum = 0;
        for (int i = 0; i < n - 1; i++) {
            preSum = preSum + nums[i];
        }
        long postSum = nums[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (preSum >= postSum) {
                ans++;
            }
            postSum += nums[i];
            preSum -= nums[i];
        }
        return ans;

    }
}
// shubham gangwal