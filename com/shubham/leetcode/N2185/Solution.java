package com.shubham.leetcode.N2185;

/**
 * <a href="https://leetcode.com/problems/counting-words-with-a-given-prefix/">2185. Counting Words With a Given Prefix</a>
 */
class Solution {
    public int prefixCount(String[] words, String pref) {
        int ans = 0;
        for (String word: words) {
            if (word.startsWith(pref)) {
                ans++;
            }
        }
        return ans;
    }
}
// shubham gangwal