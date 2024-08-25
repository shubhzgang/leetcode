package com.shubham.leetcode.N104;

import com.shubham.leetcode.commons.TreeNode;

class Solution {
    public int maxDepth(TreeNode root) {
        return maxDepth(0, root);
    }

    private int maxDepth(int depth, TreeNode node) {
        if (node == null) {
            return depth;
        }
        depth++;
        return Math.max(maxDepth(depth, node.left), maxDepth(depth, node.right));
    }
}