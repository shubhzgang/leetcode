package com.shubham.leetcode.N2425;

/**
 * <a href="https://leetcode.com/problems/bitwise-xor-of-all-pairings/">https://leetcode.com/problems/bitwise-xor-of-all-pairings/</a>
 */
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int ans = 0;
        if (n1 % 2 == 1) {
            // xor of all elements in nums2
            for (int num: nums2) {
                ans ^= num;
            }
        }
        if (n2 % 2 == 1) {
            // xor all elements in nums1
            for (int num: nums1) {
                ans ^= num;
            }
        }
        return ans;
    }
}
// shubham gangwal