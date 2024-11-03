package com.shubham.leetcode.N796;

/**
 * <a href="https://leetcode.com/problems/rotate-string/">https://leetcode.com/problems/rotate-string/</a>
 */
class Solution {
    public boolean rotateString(String s, String goal) {
        int sn, goaln;
        sn = s.length();
        goaln = goal.length();
        if (sn != goaln) {
            return false;
        }
        String s2 = s + s;
        return s2.contains(goal);
    }
}