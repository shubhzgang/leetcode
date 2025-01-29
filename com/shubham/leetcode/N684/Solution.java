package com.shubham.leetcode.N684;

/**
 * <a href="https://leetcode.com/problems/redundant-connection/">684. Redundant Connection</a>
 */
class Solution {
    public int[] findRedundantConnection(int[][] edges) {
        int n = edges.length;
        int[] parent = new int[n + 1];
        for (int i = 0; i <= n; i++) {
            parent[i] = i;
        }
        int n1, n2;
        int p1, p2;
        for (int[] edge: edges) {
            n1 = edge[0];
            n2 = edge[1];
            p1 = find(n1, parent);
            p2 = find(n2, parent);
            if (p1 == p2) {
                return new int[]{n1, n2};
            }
            parent[p1] = p2;
        }
        return new int[]{1, 2};
    }

    private int find(int n, int[] parent) {
        if (parent[n] == n) {
            return n;
        }
        parent[n] = find(parent[n], parent);
        return parent[n];
    }
}
// shubham gangwal