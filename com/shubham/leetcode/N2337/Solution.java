package com.shubham.leetcode.N2337;

/**
 * <a href="https://leetcode.com/problems/move-pieces-to-obtain-a-string/">2337. Move Pieces to Obtain a String</a>
 */
class Solution {
    public boolean canChange(String start, String target) {
        int n = start.length();
        if (start.equals(target)) {
            return true;
        }
        int si, ti;
        si = 0;
        ti = 0;
        while (si < n && ti < n) {
            while (si < n && start.charAt(si) == '_') {
                si++;
            }
            while (ti < n && target.charAt(ti) == '_') {
                ti++;
            }
            if (si >= n || ti >= n) {
                break;
            }
            if (start.charAt(si) == 'L' && target.charAt(ti) == 'L') {
                if (ti > si) {
                    return false;
                }
            } else if (start.charAt(si) == 'R' && target.charAt(ti) == 'R') {
                if (ti < si) {
                    return false;
                }
            } else {
                return false;
            }
            si++;
            ti++;
        }
        if (si < n) {
            while (si < n && start.charAt(si) == '_') {
                si++;
            }
        }
        if (si < n) {
            return false;
        }

        if (ti < n) {
            while (ti < n && target.charAt(ti) == '_') {
                ti++;
            }
        }
        if (ti < n) {
            return false;
        }
        return true;
    }
}
// shubham gangwal