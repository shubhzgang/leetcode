package com.shubham.leetcode.N1346;

/**
 * <a href="https://leetcode.com/problems/check-if-n-and-its-double-exist/">1346. Check If N and Its Double Exist</a>
 */
class Solution {
    public boolean checkIfExist(int[] arr) {
        int[] set = new int[5003];
        for (int num: arr) {
            if (num % 2 == 0) {
                if (set[num / 2 + 2000] == 1) {
                    return true;
                }
            }
            if (set[num * 2 + 2000] == 1) {
                return true;
            }
            set[num + 2000] = 1;
        }
        return false;
    }
}
// shubham gangwal