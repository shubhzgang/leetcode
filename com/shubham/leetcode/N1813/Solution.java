package com.shubham.leetcode.N1813;

/**
 * <a href="https://leetcode.com/problems/sentence-similarity-iii/">1813. Sentence Similarity III</a>
 */
class Solution {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        int n1 = sentence1.length();
        int n2 = sentence2.length();
        String small, large;
        if (n1 > n2) {
            large = sentence1;
            small = sentence2;
        } else {
            large = sentence2;
            small = sentence1;
        }
        String[] swords = small.split("\\s+");
        String[] lwords = large.split("\\s+");
        int sl, sr, ll, lr;
        sl = ll = -1;
        sr = swords.length - 1;
        lr = lwords.length - 1;
        while (sl < swords.length - 1 && ll < lwords.length - 1 && swords[sl + 1].equals(lwords[ll + 1])) {
            sl++;
            ll++;
        }
        while (sr > sl && lr > ll && swords[sr].equals(lwords[lr])) {
            sr--;
            lr--;
        }
        return sr == sl;
    }
}