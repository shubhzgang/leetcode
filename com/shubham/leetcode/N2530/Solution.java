package com.shubham.leetcode.N2530;

import java.util.PriorityQueue;

/**
 * <a href="https://leetcode.com/problems/maximal-score-after-applying-k-operations/">2530. Maximal Score After Applying K Operations</a>
 */
class Solution {
    public long maxKelements(int[] nums, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);
        for (int num : nums) {
            pq.add(num);
        }

        long ans = 0;
        int num;
        for (int i = 0; i < k; i++) {
            num = pq.poll();
            ans += num;
            pq.offer((num + 2) / 3);

        }
        return ans;
    }
}
//shubham gangwal