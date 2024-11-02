package com.shubham.leetcode.N2490;

/**
 * <a href="https://leetcode.com/problems/circular-sentence/">2490. Circular Sentence</a>
 */
class Solution {
    public boolean isCircularSentence(String sentence) {
        int n = sentence.length();
        if (sentence.charAt(0) != sentence.charAt(n - 1)) {
            return false;
        }
        char c;
        for (int i = 1; i < n; i++) {
            c = sentence.charAt(i);
            if (c == ' ') {
                if (sentence.charAt(i - 1) != sentence.charAt(i + 1)) {
                    return false;
                }
            }
        }
        return true;
    }
}