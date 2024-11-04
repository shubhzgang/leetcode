package com.shubham.leetcode.N3163;

/**
 * <a href="https://leetcode.com/problems/string-compression-iii/">3163. String Compression III</a>
 */
class Solution {
    public String compressedString(String word) {
        int n = word.length();
        StringBuilder sb = new StringBuilder();
        int count;
        char currc, prevc;
        prevc = word.charAt(0);
        count = 1;

        for (int i = 1; i < n; i++) {
            currc = word.charAt(i);
            if (currc == prevc && count < 9) {
                count++;
            } else if (currc == prevc) {
                count = 1;
                sb.append('9');
                sb.append(currc);
            } else {
                sb.append((char)(count + '0'));
                sb.append(prevc);
                prevc = currc;
                count = 1;
            }
        }
        sb.append((char)(count + '0'));
        sb.append(prevc);
        return sb.toString();
    }
}
// shubham gangwal