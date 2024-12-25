package com.shubham.leetcode.N515;

import com.shubham.leetcode.commons.TreeNode;

import java.util.ArrayList;
import java.util.List;


/**
 * <a href="https://leetcode.com/problems/find-largest-value-in-each-tree-row/">515. Find Largest Value in Each Tree Row</a>
 */
class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        if (root == null) {
            return ans;
        }
        ans.add(root.val);
        List<TreeNode> nodes = new ArrayList<>();
        nodes.add(root);
        List<TreeNode> sorted = new ArrayList<>();
        while (true) {
            for (TreeNode node : nodes) {
                if (node.left != null) {
                    sorted.add(node.left);
                }
                if (node.right != null) {
                    sorted.add(node.right);
                }
            }
            if (sorted.isEmpty()) {
                return ans;
            }
            sorted.sort((a, b) -> Integer.compare(b.val, a.val));
            ans.add(sorted.getFirst().val);
            nodes = sorted;
            sorted = new ArrayList<>();
        }
    }
}
// shubham gangwal