package com.shubham.leetcode.N1405;

/**
 * <a href="https://leetcode.com/problems/longest-happy-string/">1405. Longest Happy String</a>
 */
class Solution {
    public String longestDiverseString(int a, int b, int c) {
        int max;
        StringBuffer sb = new StringBuffer();
        if (a == 0 && b == 0 && c == 0) {
            return "";
        }
        boolean change = true;
        int ca, cb, cc;
        ca = cb = cc = 0;
        char ch;
        while (change) {
            ch = 'd';
            if (a == 0 && b == 0 && c == 0) {
                break;
            }
            if (a >= b && a >= c) {
                if (ca < 2) {
                    ch = 'a';
                } else {
                    if (b >= c && b != 0) {
                        ch = 'b';
                    } else if (c != 0) {
                        ch = 'c';
                    }
                }
            } else if (b >= a && b >= c) {
                if (cb < 2) {
                    ch = 'b';
                } else {
                    if (a >= c && a != 0) {
                        ch = 'a';
                    } else if (c != 0) {
                        ch = 'c';
                    }
                }
            } else if (c >= b && c >= a) {
                if (cc < 2) {
                    ch = 'c';
                } else {
                    if (b >= a && b != 0) {
                        ch = 'b';
                    } else if (a != 0) {
                        ch = 'a';
                    }
                }
            }
            switch (ch) {
                case 'a':
                    ca++;
                    cb = cc = 0;
                    sb.append(ch);
                    a--;
                    break;
                case 'b':
                    cb++;
                    ca = cc = 0;
                    sb.append(ch);
                    b--;
                    break;
                case 'c':
                    cc++;
                    cb = ca = 0;
                    sb.append(ch);
                    c--;
                    break;
                default:
                    change = false;

            }
        }
        return sb.toString();
    }
}
// shubham gangwal