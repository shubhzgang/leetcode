package com.shubham.leetcode.N2415;

import com.shubham.leetcode.commons.TreeNode;

/**
 * <a href="https://leetcode.com/problems/reverse-odd-levels-of-binary-tree/">2415. Reverse Odd Levels of Binary Tree</a>
 */
class Solution {
    public TreeNode reverseOddLevels(TreeNode root) {
        if (root.right == null) {
            return root;
        }
        reverseOddLevels(root.left, root.right, 1);
        return root;
    }

    private void reverseOddLevels(TreeNode n1, TreeNode n2, int level) {
        if (n1 == null) {
            return;
        }
        if (level % 2 == 1) {
            int temp = n1.val;
            n1.val = n2.val;
            n2.val = temp;
        }
        reverseOddLevels(n1.left, n2.right, level + 1);
        reverseOddLevels(n1.right, n2.left, level + 1);
    }
}
// shubham gangwal