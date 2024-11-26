package com.shubham.leetcode.N2924;

/**
 * <a href="https://leetcode.com/problems/find-champion-ii/">2924. Find Champion II</a>
 */
class Solution {
    public int findChampion(int n, int[][] edges) {
        int elen = edges.length;
        int[] weak = new int[n];
        for (int i = 0; i < elen; i++) {
            weak[edges[i][1]] = 1;
        }
        int ans = -1;
        for (int i = 0; i < n; i++) {
            if (weak[i] == 0) {
                if (ans == -1) {
                    ans = i;
                } else {
                    return -1;
                }
            }
        }
        return ans;
    }
}
// shubham gangwal
