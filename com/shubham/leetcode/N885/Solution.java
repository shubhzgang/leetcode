package com.shubham.leetcode.N885;


class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        boolean out = false;
        int[][] ans = new int[rows * cols][2];
        int dir = 0;
        int count = 1;
        int r, c;
        r = rStart;
        c = cStart;
        int ansi = 0;
        while (!out) {
            out = true;
            for (int i = 0; i < count; i++) {
                if (r >= rows || r < 0 || c >= cols || c < 0) {
                    c++;
                } else {
                    out = false;
                    ans[ansi++] = new int[]{r,c};
                    c++;
                }
            }
            //System.out.println("after right: " + r + " " + c);
            for (int i = 0; i < count; i++) {
                if (r >= rows || r < 0 || c >= cols || c < 0) {
                    r++;
                } else {
                    out = false;
                    ans[ansi++] = new int[]{r,c};
                    r++;
                }
            }
            //System.out.println("after down: " + r + " " + c);
            count++;
            for (int i = 0; i < count; i++) {
                if (r >= rows || r < 0 || c >= cols || c < 0) {
                    c--;
                } else {
                    out = false;
                    ans[ansi++] = new int[]{r,c};
                    c--;
                }
            }
            //System.out.println("after left: " + r + " " + c);
            for (int i = 0; i < count; i++) {
                if (r >= rows || r < 0 || c >= cols || c < 0) {
                    r--;
                } else {
                    out = false;
                    ans[ansi++] = new int[]{r,c};
                    r--;
                }
            }
            //System.out.println("after up: " + r + " " + c);
            count++;
        }
        return ans;
    }
}
