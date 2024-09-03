package com.shubham.leetcode.N1945;

/**
 * <a href="https://leetcode.com/problems/sum-of-digits-of-string-after-convert/">1945. Sum of Digits of String After Convert</a>
 */
class Solution {
    public int getLucky(String s, int k) {
        int sum = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i) - 'a' + 1);
        }
        String sumstr = sb.toString();
        //System.out.println(sb.toString());
        int nsum = sum;
        for (int i = 0; i < k; i++) {
            nsum = 0;
            for (int j = 0; j < sumstr.length(); j++) {
                nsum += sumstr.charAt(j) - '0';
            }
            sumstr = Integer.toString(nsum);
        }
        return nsum;
    }
}