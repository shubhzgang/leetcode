package com.shubham.leetcode.N19;

import com.shubham.leetcode.commons.ListNode;

/**
 * <a href="https://leetcode.com/problems/remove-nth-node-from-end-of-list/">19. Remove Nth Node From End of List</a>
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode end = head;
        for (int i = 1; i < n; i++) {
            end = end.next;
        }
        ListNode curr = head;
        ListNode prev = head;
        while (end.next != null) {
            prev = curr;
            curr = curr.next;
            end = end.next;
        }
        if (curr == head) {
            head = head.next;
        } else {
            prev.next = curr.next;
        }
        return head;
    }
}
// shubham gangwal