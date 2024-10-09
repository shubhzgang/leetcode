package com.shubham.leetcode.N2696;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/minimum-string-length-after-removing-substrings/">2696. Minimum String Length After Removing Substrings</a>
 */
class Solution {
    public int minLength(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'B':
                    if (!stack.empty() && stack.peek() == 'A') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                    break;
                case 'D':
                    if (!stack.empty() && stack.peek() == 'C') {
                        stack.pop();
                    } else {
                        stack.push(c);
                    }
                    break;
                default:
                    stack.push(c);
            }
        }
        return stack.size();
    }
}