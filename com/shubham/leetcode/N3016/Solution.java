package com.shubham.leetcode.N3016;

import java.util.Arrays;

class Solution {
    public int minimumPushes(String word) {
        int[] freq = new int[26];
        char c;
        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            freq[c-'a']++;
        }
        Arrays.sort(freq);
        int ans = 0;
        for (int i = 0; i < 8; i++) {
            ans += freq[25 - i];
        }
        for (int i = 8; i < 16; i++) {
            ans += (2 * freq[25 - i]);
        }
        for (int i = 16; i < 24; i++) {
            ans += (3 * freq[25 - i]);
        }
        for (int i = 24; i < 26; i++) {
            ans += (4 * freq[25 - i]);
        }
        return ans;
    }
}