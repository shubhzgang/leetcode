package com.shubham.leetcode.N624;

import java.util.List;

public class Solution {

    public int maxDistance(List<List<Integer>> arrays) {
        int max, max2, maxi, max2i;
        int min, min2, mini, min2i;
        max = max2 = maxi = max2i = -10001;
        min = min2 = mini = min2i = 10001;
        for (int i = 0; i < arrays.size(); i++) {
            List<Integer> a = arrays.get(i);
            for (Integer b : a) {
                if (b > max) {
                    max2 = max;
                    max2i = maxi;
                    max = b;
                    maxi = i;
                } else if (maxi != i && b > max2) {
                    max2 = b;
                    max2i = i;
                }
                if (b < min) {
                    min2 = min;
                    min2i = mini;
                    min = b;
                    mini = i;
                }  else if (mini != i && b < min2) {
                    min2 = b;
                    min2i = i;
                }
            }
        }
        //System.out.println(max + "," + max2 + "," + min + "," + min2);
        //System.out.println(maxi + "," + max2i + "," + mini + "," + min2i);
        int ans = 0;
        if (maxi != mini) {
            ans = max - min;
        }
        if (maxi != min2i) {
            ans = Math.max(max - min2, ans);
        }
        if (max2i != mini) {
            ans = Math.max(max2 - min, ans);
        }
        if (max2i != min2i) {
            ans = Math.max(max2 - min2, ans);
        }
        if (maxi != max2i) {
            ans = Math.max(max - max2, ans);
        }
        if (mini != min2i) {
            ans = Math.max(min2 - min, ans);
        }
        return ans;
    }
}