package com.shubham.leetcode.N1829;

/**
 * <a href="https://leetcode.com/problems/maximum-xor-for-each-query/">1829. Maximum XOR for Each Query</a>
 */
class Solution {
    public int[] getMaximumXor(int[] nums, int maximumBit) {
        int target = (1 << maximumBit) - 1;
        int all_xor = target;
        int n = nums.length;
        int[] result = new int[n];
        result[n-1] = all_xor ^ nums[0];
        for (int i = 1; i < n; i++) {
            result[n-i-1] = result[n-i] ^ nums[i];
        }
        return result;
    }
}
// shubham gangwal