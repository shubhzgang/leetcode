package com.shubham.leetcode.N2938;

/**
 * <a href="https://leetcode.com/problems/separate-black-and-white-balls/">2938. Separate Black and White Balls</a>
 */
class Solution {
    public long minimumSteps(String s) {
        long ans = 0;
        int zi = 0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '0') {
                ans += (i - zi);
                zi++;
            }
        }
        return ans;
    }
}
// shubham gangwal