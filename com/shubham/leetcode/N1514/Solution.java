package com.shubham.leetcode.N1514;

import java.util.*;

/**
 * <a href="https://leetcode.com/problems/path-with-maximum-probability/">1514. Path with Maximum Probability</a>
 *
 * Bellman Ford algorithm is used. Relaxation done n times. n is number of nodes.
 */
class Solution {
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        double[] dist = new double[n];
        dist[start_node] = 1.0;

        for (int i = 0; i < n; i++) {
            boolean updated = false;
            for (int j = 0; j < edges.length; j++) {
                double prob = succProb[j];
                int u = edges[j][0];
                int v = edges[j][1];
                if (dist[u] * prob > dist[v]) {
                    dist[v] = dist[u] * prob;
                    updated = true;
                }
                if (dist[v] * prob > dist[u]) {
                    dist[u] = dist[v] * prob;
                    updated = true;
                }
            }
            if (!updated) {
                break;
            }
        }
        return dist[end_node];
    }
}