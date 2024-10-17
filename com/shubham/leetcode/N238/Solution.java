package com.shubham.leetcode.N238;

/**
 * <a href="https://leetcode.com/problems/product-of-array-except-self/">238. Product of Array Except Self</a>
 */
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        result[0] = 1;
        for (int i = 1; i < n; i++) {
            result[i] = nums[i - 1] * result[i - 1];
        }
        int prod = 1;
        //System.out.println(Arrays.toString(result));
        for (int i = n - 2; i >= 0; i--) {
            prod = prod * nums[i + 1];
            result[i] *= prod;
        }
        return result;
    }
}
//Shubham Gangwal
