package com.shubham.leetcode.N2053;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public String kthDistinct(String[] arr, int k) {
        Set<String> distinct = new HashSet<>(), nonDistinct = new HashSet<>();

        for (String s: arr) {
            if (nonDistinct.contains(s)) {
                continue;
            } else if (distinct.contains(s)) {
                nonDistinct.add(s);
                distinct.remove(s);
            } else {
                distinct.add(s);
            }
        }
        if (distinct.size() < k) {
            return "";
        }
        int distinctCount = 0;
        int i = 0;
        for (; i < arr.length; i++) {
            if (distinct.contains(arr[i])) {
                distinctCount++;
                if (distinctCount == k) {
                    break;
                }
            }
        }
        return arr[i];
    }
}