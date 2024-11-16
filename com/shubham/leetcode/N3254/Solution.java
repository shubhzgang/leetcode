package com.shubham.leetcode.N3254;

/**
 * <a href="https://leetcode.com/problems/find-the-power-of-k-size-subarrays-i/">3254. Find the Power of K-Size Subarrays I</a>
 */
class Solution {
    public int[] resultsArray(int[] nums, int k) {
        if (k == 1) {
            return nums;
        }
        int n = nums.length;
        boolean cons = true;
        int[] ans = new int[n - k + 1];
        for (int i = k - 1; i < n; i++) {
            cons = true;
            for (int j = 1; j < k; j++) {
                if (nums[i - j] != nums[i - j + 1] - 1) {
                    cons = false;
                    break;
                }
            }
            if (!cons) {
                ans[i - k + 1] = -1;
            } else {
                ans[i - k + 1] = nums[i];
            }
        }
        return ans;

    }
}
// shubham gangwal