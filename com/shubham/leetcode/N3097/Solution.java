package com.shubham.leetcode.N3097;

/**
 * <a href="https://leetcode.com/problems/shortest-subarray-with-or-at-least-k-ii/">3097. Shortest Subarray With OR at Least K II</a>
 */
class Solution {
    public int minimumSubarrayLength(int[] nums, int k) {
        int[] count = new int[32];
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int j = 0;
        int i = 0;
        while (i < n && j < n) {
            if (i > j) {
                j = i;
            }
            addCount(nums[j], count);
            //System.out.println(String.format("%d, %d, %s, %d", i, j, Arrays.toString(count), getInt(count)));
            if (getInt(count) >= k) {
                ans = Math.min(ans, j - i + 1);
                subCount(nums[i], count);
                subCount(nums[j], count);
                i++;
                continue;
            }
            j++;
        }
        if (ans == Integer.MAX_VALUE) {
            return -1;
        }
        return ans;

    }

    private int getInt(int[] count) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            if (count[i] > 0) {
                ans |= 1 << i;
            }
        }
        return ans;
    }

    private void addCount(int num, int[] count) {
        int i = 0;
        while (num != 0) {
            count[i++] += num & 1;
            num /= 2;
        }
    }

    private void subCount(int num, int[] count) {
        int i = 0;
        while (num != 0) {
            count[i] -= num & 1;
            num /= 2;
            i++;
        }
    }
}
// shubham gangwal