package com.shubham.leetcode.N1894;

/**
 * <a href="https://leetcode.com/problems/find-the-student-that-will-replace-the-chalk/">1894. Find the Student that Will Replace the Chalk</a>
 */
class Solution {
    public int chalkReplacer(int[] chalk, int k) {
        long total = 0;
        int n = chalk.length;
        for (int i = 0; i < n; i++) {
            total += chalk[i];
        }
        long remainder = k % total;
        int ans = 0;
        //System.out.println("remainder: " + remainder);
        while (remainder >= chalk[ans]) {
            remainder -= chalk[ans];
            ans++;
        }
        return ans;
    }
}