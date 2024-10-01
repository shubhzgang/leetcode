package com.shubham.leetcode.N1497;

/**
 * <a href="https://leetcode.com/problems/check-if-array-pairs-are-divisible-by-k/">1497. Check If Array Pairs Are Divisible by k</a>
 */
class Solution {
    public boolean canArrange(int[] arr, int k) {
        int[] freq = new int[k];
        for (int i = 0; i < arr.length; i++) {
            freq[((arr[i] % k) + k) % k]++;
        }
        //System.out.println(Arrays.toString(freq));
        if (freq[0] % 2 != 0) {
            return false;
        }
        if (k % 2 == 0) {
            if (freq[k / 2] % 2 != 0) {
                return false;
            }
        }
        for (int i = 1; i <= k / 2; i++) {
            if (freq[i] != freq[k - i]) {
                return false;
            }
        }
        return true;
    }
}