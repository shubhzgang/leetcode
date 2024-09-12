package com.shubham.leetcode.N1684;

/**
 * <a href="https://leetcode.com/problems/count-the-number-of-consistent-strings/">1684. Count the Number of Consistent Strings</a>
 */
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        boolean[] allowArr = new boolean[26];
        for (char c: allowed.toCharArray()) {
            allowArr[c - 'a'] = true;
        }

        boolean cFlag = true;
        int cCount = 0;
        for (String word: words) {
            cFlag = true;
            for (char c: word.toCharArray()) {
                if (!allowArr[c - 'a']) {
                    cFlag = false;
                    break;
                }
            }
            if (cFlag) {
                cCount++;
            }
        }
        return cCount;
    }
}