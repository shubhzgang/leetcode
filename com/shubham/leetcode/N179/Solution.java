package com.shubham.leetcode.N179;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * <a href="https://leetcode.com/problems/largest-number/">179. Largest Number</a>
 */
public class Solution {
    public String largestNumber(int[] nums) {
        List<String> strings = new java.util.ArrayList<>(Arrays.stream(nums).mapToObj(Integer::toString).toList());
        strings.sort(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                String order1 = o1 + o2;
                String order2 = o2 + o1;
                return order2.compareTo(order1);
            }
        });
        //System.out.println(strings);
        if (strings.getFirst().equals("0")) {
            return "0";
        }
        return String.join("", strings);
    }
}
