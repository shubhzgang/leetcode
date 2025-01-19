package com.shubham.leetcode.N118;

import java.util.ArrayList;
import java.util.List;

/**
 <a href="https://leetcode.com/problems/pascals-triangle/">118. Pascal's Triangle</a>*
 */
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        List<Integer> prevRow;
        list.add(1);
        result.add(list);
        for (int i = 1; i < numRows; i++) {
            list = new ArrayList<>();
            prevRow = result.get(i - 1);
            list.add(1);
            for (int j = 1; j < i; j++) {
                list.add(prevRow.get(j) + prevRow.get(j - 1));
            }
            list.add(1);
            result.add(list);
        }
        return result;
    }
}
// shubham gangwal