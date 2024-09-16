package com.shubham.leetcode.N539;

import java.util.List;

/**
 * <a href="https://leetcode.com/problems/minimum-time-difference/">539. Minimum Time Difference</a>
 */
class Solution {
    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() > 1440) return 0;

        boolean[] seen = new boolean[1440];

        for (String time : timePoints) {
            int minutes = convertToMinutes(time);
            if (seen[minutes]) return 0;
            seen[minutes] = true;
        }

        int first = Integer.MAX_VALUE, prev = Integer.MAX_VALUE;
        int minDiff = Integer.MAX_VALUE;
        int i = 0;
        for (; i < 1440; i++) {
            if (seen[i]) {
                first = i;
                prev = i;
                break;
            }
        }
        i++;
        for (; i < 1440; i++) {
            if (seen[i]) {
                minDiff = Math.min(minDiff, i - prev);
                prev = i;
            }
        }


        minDiff = Math.min(minDiff, 1440 - prev + first);

        return minDiff;
    }

    private int convertToMinutes(String time) {
        return ((time.charAt(0) - '0') * 10 + (time.charAt(1) - '0')) * 60
                + (time.charAt(3) - '0') * 10 + (time.charAt(4) - '0');
    }
}
//shubham gangwal