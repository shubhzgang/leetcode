package com.shubham.leetcode.N590;

import java.util.ArrayList;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/n-ary-tree-postorder-traversal/">590. N-ary Tree Postorder Traversal</a>
 */
public class Solution {
    public List<Integer> postorder(Node root) {
        List<Integer> result = new ArrayList<>();
        postorder(root, result);
        if (root != null) {
            result.add(root.val);
        }
        return result;
    }

    private void postorder(Node node, List<Integer> result) {
        if (node == null) {
            return;
        }
        List<Node> nodes = node.children;
        for (Node n: nodes) {
            postorder(n, result);
            result.add(n.val);
        }
    }
}
