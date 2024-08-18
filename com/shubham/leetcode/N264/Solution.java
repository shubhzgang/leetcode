package com.shubham.leetcode.N264;

import java.util.*;
import java.lang.*;

public class Solution {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int two, three, five;
        int p2, p3, p5;
        p2 = p3 = p5 = 0;
        for (int i = 1; i < n; i++) {
            two = dp[p2] * 2;
            three = dp[p3] * 3;
            five = dp[p5] * 5;

            dp[i] = Math.min(two, Math.min(three, five));

            if (dp[i] == two) {
                p2++;
            }
            if (dp[i] == three) {
                p3++;
            }
            if (dp[i] == five) {
                p5++;
            }
        }
        return dp[n - 1];
    }
}
