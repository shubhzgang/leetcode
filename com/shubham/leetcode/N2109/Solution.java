package com.shubham.leetcode.N2109;

/**
 * <a href="https://leetcode.com/problems/adding-spaces-to-a-string/">2109. Adding Spaces to a Stringe</a>
 */
class Solution {
    public String addSpaces(String s, int[] spaces) {
        char[] arr = s.toCharArray();
        int n = arr.length;
        int si = 0;
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            if (si < spaces.length && i == spaces[si]) {
                sb.append(' ');
                si++;
            }
            sb.append(arr[i]);
        }
        return sb.toString();
    }
}
// shubham gangwal
