package com.shubham.leetcode.N1408;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/string-matching-in-an-array/">1408. String Matching in an Array</a>
 */
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ans = new ArrayList<>();
        int n = words.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                }
                if (words[j].contains(words[i])) {
                    j = n;
                    ans.add(words[i]);
                }
            }
        }
        return ans;
    }
}
// shubham gangwal