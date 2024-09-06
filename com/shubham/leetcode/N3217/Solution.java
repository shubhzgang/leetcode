package com.shubham.leetcode.N3217;

import com.shubham.leetcode.commons.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * <a href="https://leetcode.com/problems/delete-nodes-from-linked-list-present-in-array/">3217. Delete Nodes From Linked List Present in Array</a>
 */
class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int num: nums) {
            set.add(num);
        }
        while (head != null && set.contains(head.val)) {
            head = head.next;
        }
        if (head == null) {
            return head;
        }
        ListNode node = head.next;
        ListNode prev = head;
        while (node != null) {
            if (set.contains(node.val)) {
                prev.next = node.next;
            }
            else {
                prev = prev.next;
            }
            node = node.next;
        }
        return head;
    }
}