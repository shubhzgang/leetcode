package com.shubham.leetcode.N145;

import com.shubham.leetcode.commons.TreeNode;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrderInternal(result, root);
        return result;
    }

    private void postOrderInternal(List<Integer> result, TreeNode node) {
        if (node == null) {
            return;
        }
        postOrderInternal(result, node.left);
        postOrderInternal(result, node.right);
        result.add(node.val);
    }
}