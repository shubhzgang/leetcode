package com.shubham.leetcode.N2416;

/**
 * <a href="https://leetcode.com/problems/sum-of-prefix-scores-of-strings/">2416. Sum of Prefix Scores of Strings</a>
 */
class Solution {
    public int[] sumPrefixScores(String[] words) {
        Trie root = new Trie();
        Trie travel;
        int cidx;
        for (String word: words) {
            travel = root;
            for (int i = 0; i < word.length(); i++) {
                cidx = word.charAt(i) - 'a';
                if (travel.next[cidx] == null) {
                    travel.next[cidx] = new Trie(1);
                } else {
                    travel.next[cidx].count++;
                }
                travel = travel.next[cidx];
            }
            //constructTrie(word, 0, root);
        }

        int[] result = new int[words.length];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            result[i] = getPrefixScore(word, root);
        }
        return result;
    }

    private int getPrefixScore(String word, Trie trie) {
        char c;
        int score = 0;
        int cidx;
        for (int i = 0; i < word.length(); i++) {
            c = word.charAt(i);
            cidx = c - 'a';
            score += trie.next[cidx].count;
            trie = trie.next[cidx];
        }
        return score;
    }

}

class Trie {
    public int count;
    public Trie[] next;

    public Trie() {
        this.count = 0;
        this.next = new Trie[26];
        //Arrays.fill(this.next, null);
    }

    public Trie(int count) {
        this.count = count;
        this.next = new Trie[26];
        //Arrays.fill(this.next, null);
    }
}