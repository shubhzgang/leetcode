package com.shubham.leetcode.N921;

/**
 * <a href="https://leetcode.com/problems/minimum-add-to-make-parentheses-valid/">921. Minimum Add to Make Parentheses Valid</a>
 */
class Solution {
    public int minAddToMakeValid(String s) {
        int opens, closes;
        opens = closes = 0;
        char c;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            if (c == '(') {
                opens++;
            } else {
                if (opens == 0) {
                    closes++;
                } else {
                    opens--;
                }
            }
        }
        return opens + closes;
    }
}