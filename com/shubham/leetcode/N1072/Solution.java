package com.shubham.leetcode.N1072;

import java.util.HashMap;
import java.util.Map;

/**
 * <a href="https://leetcode.com/problems/flip-columns-for-maximum-number-of-equal-rows/">1072. Flip Columns For Maximum Number of Equal Rows</a>
 */
class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        if (cols == 1) {
            return rows;
        }

        StringBuilder sb = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        for (int[] ints : matrix) {
            sb.setLength(0);
            for (int j = 1; j < cols; j++) {
                sb.append('0' + (ints[j] ^ ints[j - 1]));
            }
            String key = sb.toString();
            if (map.containsKey(key)) {
                map.put(key, map.get(key) + 1);
            } else {
                map.put(key, 1);
            }
        }
        int max = 1;
        for (var entry: map.entrySet()) {
            max = Math.max(max, entry.getValue());
        }
        return max;
    }
}
// shubham gangwal