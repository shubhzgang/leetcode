package com.shubham.leetcode.N2914;

/**
 * <a href="https://leetcode.com/problems/minimum-number-of-changes-to-make-binary-string-beautiful/">2914. Minimum Number of Changes to Make Binary String Beautiful</a>
 */
class Solution {
    public int minChanges(String s) {
        int n = s.length();
        int res = 0;
        for (int i = 0; i < n; i += 2) {
            if (s.charAt(i) != s.charAt(i + 1)) {
                res++;
            }
        }
        return res;
    }
}