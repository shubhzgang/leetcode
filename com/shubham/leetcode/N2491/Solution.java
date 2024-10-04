package com.shubham.leetcode.N2491;

/**
 * <a href="https://leetcode.com/problems/divide-players-into-teams-of-equal-skill/">2491. Divide Players Into Teams of Equal Skill</a>
 */
class Solution {
    public long dividePlayers(int[] skill) {
        int[] freq = new int[1001];
        int total = 0;
        int s;
        for (int i = 0; i < skill.length; i++) {
            s = skill[i];
            freq[s]++;
            total += s;
        }
        if (total % (skill.length / 2) != 0) {
            return -1;
        }
        total = total / (skill.length / 2);
        long chemistry = 0;

        int count = 0;
        int partner;
        for (int i = 0; i < skill.length && count < skill.length / 2; i++) {
            s = skill[i];
            partner = total - s;
            if (freq[s] == 0) {
                continue;
            }
            freq[s]--;

            if (freq[partner] < 1) {
                return -1;
            }
            count++;
            freq[partner]--;
            chemistry += s * (partner);

        }
        return chemistry;
    }
}
//Shubham Gangwal