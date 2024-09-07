package com.shubham.leetcode.N1367;

import com.shubham.leetcode.commons.ListNode;
import com.shubham.leetcode.commons.TreeNode;

/**
 * <a href="https://leetcode.com/problems/linked-list-in-binary-tree/">1367. Linked List in Binary Tree</a>
 */
class Solution {
    public boolean isSubPath(ListNode head, TreeNode root) {
        if (root == null) {
            return false;
        }
        // searching for first match of list node
        if (root.val != head.val) {
            return isSubPath(head, root.right) || isSubPath(head, root.left);
        }
        // tree node val is equal to head val but first match might be repeated.
        return isSubPathStart(head, root) || isSubPath(head, root.right) || isSubPath(head, root.left);
    }

    private boolean isSubPathStart(ListNode lnode, TreeNode tnode) {
        if (tnode == null && lnode != null) {
            return false;
        }
        if (lnode == null) {
            return true;
        }
        if (tnode.val != lnode.val) {
            return false;
        }
        return isSubPathStart(lnode.next, tnode.left) || isSubPathStart(lnode.next, tnode.right);
    }
}