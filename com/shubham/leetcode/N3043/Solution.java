package com.shubham.leetcode.N3043;

/**
 * <a href="https://leetcode.com/problems/find-the-length-of-the-longest-common-prefix/">3043. Find the Length of the Longest Common Prefix</a>
 *
 */
class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        int n1 = arr1.length;
        int n2 = arr2.length;
        Set<Integer> prefixSet = new HashSet<>();

        int ans = 0;
        if (n1 < n2) {
            fillPrefixSet(arr1, prefixSet);
            ans = maxPrefixLen(arr2, prefixSet);
        } else {
            fillPrefixSet(arr2, prefixSet);
            ans = maxPrefixLen(arr1, prefixSet);
        }

        return ans;
    }

    private int maxPrefixLen(int[] arr, Set<Integer> prefixSet) {
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            while (a > 0) {
                if (prefixSet.contains(a)) {
                    ans = Math.max(ans, findLen(a));
                    break;
                }
                a /= 10;
            }
        }
        return ans;
    }

    private void fillPrefixSet(int[] arr, Set<Integer> set) {
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            while (a > 0) {
                set.add(a);
                a /= 10;
            }
        }
    }

    private int findLen(int a) {
        int ans = 0;
        if (a == 0) return 1;
        while (a > 0) {
            ans++;
            a /= 10;
        }
        return ans;
    }
}