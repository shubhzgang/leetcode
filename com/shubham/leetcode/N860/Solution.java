package com.shubham.leetcode.N860;

class Solution {
    public boolean lemonadeChange(int[] bills) {
        int count5, count10;
        count5 = count10 = 0;
        for (int bill : bills) {
            //System.out.println("bill " + bill + " count5: " + count5 + " count10: " + count10);
            switch (bill) {
                case 5:
                    count5++;
                    break;
                case 10:
                    count10++;
                    count5--;
                    break;
                default:
                    if (count10 > 0) {
                        count10--;
                    } else {
                        count5 -= 2;
                    }
                    count5--;
            }
            if (count5 < 0 || count10 < 0) {
                return false;
            }
        }
        return true;
    }
}