package com.shubham.leetcode.N347;

import java.util.Arrays;

/**
 * <a href="https://leetcode.com/problems/top-k-frequent-elements/">347. Top K Frequent Elements</a>
 */
class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int[][] freq = new int[20001][2];
        for (int num: nums) {
            freq[num + 10000][0] = num;
            freq[num + 10000][1]++;
        }

        Arrays.sort(freq, (a, b) -> b[1] - a[1]);

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = freq[i][0];
        }
        return result;
    }
}
// shubham gangwal