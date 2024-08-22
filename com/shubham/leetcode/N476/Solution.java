package com.shubham.leetcode.N476;

class Solution {
    public int findComplement(int num) {
        int[] bits = new int[32];
        int count = 0;
        while (num != 0) {
            bits[count++] = num & 1;
            num /= 2;
        }
        //System.out.println(Arrays.toString(bits));
        int ans = 0;
        while (count > 0) {
            int bit = bits[--count];
            ans = ans << 1;
            if (bit == 0) {
                ans++;
            }
        }
        return ans;
    }
}