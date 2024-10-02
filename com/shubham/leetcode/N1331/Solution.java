package com.shubham.leetcode.N1331;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/rank-transform-of-an-array/">1331. Rank Transform of an Array</a>
 */
class Solution {
    public int[] arrayRankTransform(int[] arr) {
        Map<Integer, Integer> ranks = new HashMap<>();
        int[] sorted = Arrays.stream(arr).distinct().sorted().toArray();
        for (int i = 0; i < sorted.length; i++) {
            ranks.put(sorted[i], i + 1);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ranks.get(arr[i]);
        }
        return arr;
    }
}