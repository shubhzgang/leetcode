package com.shubham.leetcode.N237;

import com.shubham.leetcode.commons.ListNode;

/**
 * <a href="https://leetcode.com/problems/delete-node-in-a-linked-list/">237. Delete Node in a Linked List</a>
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode prev = node;
        while (node.next != null) {
            node.val = node.next.val;
            prev = node;
            node = node.next;
        }
        prev.next = null;
    }
}
// shubham gangwal