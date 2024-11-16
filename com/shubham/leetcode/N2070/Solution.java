package com.shubham.leetcode.N2070;

import java.util.Arrays;
import java.util.TreeMap;

/**
 * <a href="https://leetcode.com/problems/most-beautiful-item-for-each-query/">2070. Most Beautiful Item for Each Queryf</a>
 */
class Solution {
    public int[] maximumBeauty(int[][] items, int[] queries) {
        TreeMap<Integer, Integer> map = new TreeMap<>();
        int n = items.length;
        Arrays.sort(items, (a, b) -> Integer.compare(a[0], b[0]));
        int maxBeauty = 0;
        for (int i = 0; i < n; i++) {
            if (items[i][1] <= maxBeauty) {
                continue;
            }
            maxBeauty = items[i][1];
            map.put(items[i][0], maxBeauty);
        }
        int[] ans = new int[queries.length];
        Integer floorKey;
        for (int i = 0; i < queries.length; i++) {
            floorKey = map.floorKey(queries[i]);
            if (floorKey != null) {
                ans[i] = map.get(floorKey);
            }

        }
        return ans;
    }
}
// shubham gangwal