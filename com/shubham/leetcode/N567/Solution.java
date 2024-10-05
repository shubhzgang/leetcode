package com.shubham.leetcode.N567;

/**
 * <a href="https://leetcode.com/problems/permutation-in-string/">Permutation in String</a>
 */
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n1 = s1.length();
        int n2 = s2.length();
        if (n2 < n1) {
            return false;
        }
        int[] s1chars = new int[26], s2chars = new int[26];
        //Arrays.fill(s1chars, 0);
        //Arrays.fill(s2chars, 0);
        for (int i = 0; i < n1; i++) {
            s1chars[s1.charAt(i) - 'a']++;
            s2chars[s2.charAt(i) - 'a']++;
        }
        //System.out.println(Arrays.toString(s1chars));
        //System.out.println(Arrays.toString(s2chars));
        if (Arrays.equals(s1chars, s2chars)) {
            return true;
        }
        for (int i = n1; i < n2; i++) {
            s2chars[s2.charAt(i) - 'a']++;
            s2chars[s2.charAt(i - n1) - 'a']--;
            if (Arrays.equals(s1chars, s2chars)) {
                return true;
            }
        }
        return false;
    }
}
// Shubham Gangwal