package com.shubham.leetcode.N144;

import com.shubham.leetcode.commons.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/binary-tree-preorder-traversal/description/">144. Binary Tree Preorder Traversal</a>
 */
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        Stack<TreeNode> s = new Stack<>();
        List<Integer> result = new ArrayList<>();
        s.push(root);
        while(!s.isEmpty()) {
            TreeNode node = s.pop();
            if (node == null) {
                continue;
            }
            result.add(node.val);
            s.push(node.right);
            s.push(node.left);
        }
        return result;
    }
}
// shubham gangwal