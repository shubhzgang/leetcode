package com.shubham.leetcode.N2825;

/**
 * <a href="https://leetcode.com/problems/make-string-a-subsequence-using-cyclic-increments/">2825. Make String a Subsequence Using Cyclic Increments</a>
 */
class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int n1 = str1.length();
        int n2 = str2.length();
        int i1, i2;
        i1 = i2 = 0;
        char c1, c2;
        while (i1 < n1 && i2 < n2) {
            c1 = str1.charAt(i1);
            c2 = str2.charAt(i2);
            if (isMatch(c1, c2)) {
                i2++;
            }
            i1++;
        }
        return i2 == n2;
    }

    private boolean isMatch(char c1, char c2) {

        // System.out.printf("%c %c %c%n", c1, newC1, c2);
        if (c1 == c2) {
            return true;
        }
        char newC1 = c1 == 'z' ? 'a' : (char)(c1 + 1);
        return newC1 == c2;
    }
}
// shubham gangwal