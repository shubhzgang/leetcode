package com.shubham.leetcode.N962;

import java.util.Stack;

/**
 * <a href="https://leetcode.com/problems/maximum-width-ramp/">Maximum Width Ramp</a>
 */
class Solution {
    public int maxWidthRamp(int[] nums) {
        Stack<Integer> stack = new Stack<>();
        int n = nums.length;
        stack.push(0);
        for (int i = 1; i < n; i++) {
            if (nums[stack.peek()] > nums[i]) {
                stack.push(i);
            }
        }
        int result = 0;
        for (int i = n - 1; i > 0; i--) {
            while (!stack.empty() && nums[stack.peek()] <= nums[i]) {
                int diff = i - stack.pop();
                result = Math.max(result, diff);
            }
        }
        return result;
    }
}