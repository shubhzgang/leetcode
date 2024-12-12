package com.shubham.leetcode.N2558;

import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/take-gifts-from-the-richest-pile/">2558. Take Gifts From the Richest Pile</a>
 */
class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int gift: gifts) {
            pq.offer(gift);
        }
        for (int i = 0; i < k; i++) {
            int newGift = (int) Math.floor(Math.sqrt(pq.poll()));
            pq.offer(newGift);
        }
        Iterator<Integer> it = pq.iterator();
        long ans = 0;
        while(it.hasNext()) {
            ans += it.next();
        }
        return ans;
    }
}
// shubham gangwal