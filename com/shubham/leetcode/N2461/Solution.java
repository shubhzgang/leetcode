package com.shubham.leetcode.N2461;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/maximum-sum-of-distinct-subarrays-with-length-k/">2461. Maximum Sum of Distinct Subarrays With Length K</a>
 */
class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        long sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
            if (freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            } else {
                freq.put(nums[i], 1);
            }
        }
        long max = 0;
        if (freq.size() == k) {
            max = Math.max(max, sum);
        }
        for (int i = k; i < nums.length; i++) {
            if (freq.containsKey(nums[i])) {
                freq.put(nums[i], freq.get(nums[i]) + 1);
            } else {
                freq.put(nums[i], 1);
            }
            if (freq.get(nums[i - k]) == 1) {
                freq.remove(nums[i - k]);
            } else {
                freq.put(nums[i - k], freq.get(nums[i - k]) - 1);
            }
            sum += nums[i];
            sum -= nums[i - k];
            if (freq.size() == k) {
                max = Math.max(max, sum);
            }
        }
        return max;
    }
}
// shubham gangwal