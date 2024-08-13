package com.shubham.leetcode.N40;

import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(candidates, target, result, 0, 0, new ArrayList<>());
        return result;
    }

    public void backtrack(int[] candidates, int target, List<List<Integer>> result, int sum, int index, List<Integer> curr) {
        // stop if target reached
        if (sum == target) {
            result.add(new ArrayList<>(curr));
            return;
        }
        if (sum > target) {
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i-1]) {
                continue;
            }
            if (candidates[i] > target) {
                break;
            }
            curr.add(candidates[i]);
            backtrack(candidates, target, result, sum + candidates[i], i + 1, curr);
            curr.removeLast();
        }
    }

}