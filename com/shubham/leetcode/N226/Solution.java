package com.shubham.leetcode.N226;

import com.shubham.leetcode.commons.TreeNode;

/**
 *
 * <a href="https://leetcode.com/problems/invert-binary-tree/">226. Invert Binary Tree</a>
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        invert(root);
        return root;
    }

    private void invert(TreeNode node) {
        if (node == null) {
            return;
        }
        TreeNode temp = node.left;
        node.left = node.right;
        node.right = temp;
        invert(node.left);
        invert(node.right);
    }
}