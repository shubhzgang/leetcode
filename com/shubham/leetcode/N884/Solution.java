package com.shubham.leetcode.N884;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * <a href="https://leetcode.com/problems/uncommon-words-from-two-sentences/">884. Uncommon Words from Two Sentences</a>
 */
class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        Map<String, Boolean> count = new HashMap<>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        for (String word: words1) {
            if (count.containsKey(word)) {
                count.put(word, false);
            } else {
                count.put(word, true);
            }
        }
        for (String word: words2) {
            if (count.containsKey(word)) {
                count.put(word, false);
            } else {
                count.put(word, true);
            }
        }
        List<String> ans = count.entrySet().stream()
                .filter(k -> k.getValue().equals(Boolean.TRUE)).map(Map.Entry::getKey).toList();
        return ans.toArray(new String[0]);
    }
}