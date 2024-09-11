package com.shubham.leetcode.N2807;

import com.shubham.leetcode.commons.ListNode;

/**
 * <a href="https://leetcode.com/problems/insert-greatest-common-divisors-in-linked-list/">2807. Insert Greatest Common Divisors in Linked List</a>
 */
class Solution {
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode current = head;
        ListNode next = head.next;
        while (next != null) {
            int gcd = findGcd(current.val, next.val);
            current.next = new ListNode(gcd, next);
            current = next;
            next = next.next;
        }
        return head;
    }

    private int findGcd(int a, int b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            } else {
                b = b - a;
            }
        }
        return a;
    }
}