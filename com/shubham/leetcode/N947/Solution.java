package com.shubham.leetcode.N947;

/**
 * <a href="https://leetcode.com/problems/most-stones-removed-with-same-row-or-column/">947. Most Stones Removed with Same Row or Column</a>
 */
class Solution {
    public int removeStones(int[][] stones) {
        int groups = 0;
        int n = stones.length;
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(stones, visited, i);
                groups++;
            }
        }
        return n - groups;
    }

    private void dfs(int[][] stones, boolean[] vis, int idx) {
        vis[idx] = true;
        for (int i = 0; i < vis.length; i++) {
            if (!vis[i]) {
                if (stones[idx][0] == stones[i][0]) {
                    dfs(stones, vis, i);
                }
                if (stones[idx][1] == stones[i][1]) {
                    dfs(stones, vis, i);
                }
            }
        }
    }
}
