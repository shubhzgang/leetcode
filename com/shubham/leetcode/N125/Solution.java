package com.shubham.leetcode.N125;

class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int l = 0;
        int r = n - 1;
        char lc, rc, llc, lrc;
        while (l < r) {
            lc = s.charAt(l);
            rc = s.charAt(r);
            llc = getLowerCase(lc);
            lrc = getLowerCase(rc);
            if (llc == '!') {
                l++;
                continue;
            }
            if (lrc == '!') {
                r--;
                continue;
            }
            if (llc != lrc) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    private char getLowerCase(char c) {
        if (c >= 'a' && c <= 'z') {
            return c;
        }
        if (c >= '0' && c <= '9') {
            return c;
        }
        if (c >= 'A' && c <= 'Z') {
            return (char)('a' + c - 'A');
        }
        return '!';
    }
}
// shubham gangwal