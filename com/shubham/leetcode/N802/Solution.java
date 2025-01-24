package com.shubham.leetcode.N802;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/find-eventual-safe-states/">802. Find Eventual Safe States</a>
 */
class Solution {
    public List<Integer> eventualSafeNodes(int[][] graph) {
        int n = graph.length;
        boolean[] safe = new boolean[n];
        boolean[] vis = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (!vis[i]) {
                isSafe(i, safe, vis, graph);
            }
        }
        List<Integer> safeNodes = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (safe[i]) {
                safeNodes.add(i);
            }
        }
        return safeNodes;
    }

    private boolean isSafe(int node, boolean[] safe, boolean[] vis, int[][] graph) {
        if (safe[node]) {
            return true;
        }
        if (vis[node]) {
            return false;
        }
        if (graph[node].length == 0) {
            safe[node] = true;
            vis[node] = true;
            return true;
        }
        vis[node] = true;
        boolean result = true;
        int n = graph[node].length;
        for (int i = 0; i < n; i++) {
            result = result && isSafe(graph[node][i], safe, vis, graph);
        }
        safe[node] = result;
        return result;
    }
}
// shubham gangwal