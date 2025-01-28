package com.shubham.leetcode.N160;

import com.shubham.leetcode.commons.ListNode;

/**
 * <a href="https://leetcode.com/problems/intersection-of-two-linked-lists/">160. Intersection of Two Linked Lists</a>
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int n1, n2;
        n1 = n2 = 1;
        ListNode a = headA;
        ListNode b = headB;
        while (a.next != null) {
            a = a.next;
            n1++;
        }
        while (b.next != null) {
            b = b.next;
            n2++;
        }
        if (a != b) {
            return null;
        }
        a = headA;
        b = headB;
        if (n1 > n2) {
            while (n1 != n2) {
                a = a.next;
                n1--;
            }
        } else if (n2 > n1) {
            while (n2 != n1) {
                b = b.next;
                n2--;
            }
        }
        while (a != b) {
            a = a.next;
            b = b.next;
        }
        return a;
    }
}
// shubham gangwal