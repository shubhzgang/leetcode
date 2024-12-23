package com.shubham.leetcode.N15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/3sum/">15. 3Sum</a>
 */
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        int left, right, target, sum;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            target = -nums[i];
            left = i + 1;
            right = nums.length - 1;
            while (left < right) {
                while (left > i + 1 && left < nums.length && nums[left] == nums[left - 1]) {
                    left++;
                }
                while (right < nums.length - 1 && right >= 0 && nums[right] == nums[right + 1]) {
                    right--;
                }
                if (right <= left) {
                    continue;
                }
                sum = nums[left] + nums[right];
                if (sum == target) {
                    ans.add(Arrays.stream(new int[] {nums[i], nums[left], nums[right]}).boxed().toList());
                    left++;
                    right--;
                } else if (sum > target) {
                    right--;
                } else {
                    left++;
                }
            }
        }
        return ans;
    }
}
