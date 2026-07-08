import java.util.HashSet;
import java.util.Set;

class Solution {
    public int mincostTickets(int[] days, int[] costs) {
        // Use a set for O(1) lookups to check if a day is a travel day
        Set<Integer> travelDays = new HashSet<>();
        for (int day : days) {
            travelDays.add(day);
        }

        // Find the last day we need to travel so we don't loop all the way to 365 unnecessarily
        int lastDay = days[days.length - 1];
        int[] dp = new int[lastDay + 1];

        for (int i = 1; i <= lastDay; i++) {
            // If it's not a travel day, the cost is the same as the previous day
            if (!travelDays.contains(i)) {
                dp[i] = dp[i - 1];
                continue;
            }

            // If it is a travel day, evaluate all three pass choices
            int option1 = dp[i - 1] + costs[0];
            int option2 = dp[Math.max(0, i - 7)] + costs[1];
            int option3 = dp[Math.max(0, i - 30)] + costs[2];

            // Pick the minimum cost
            dp[i] = Math.min(option1, Math.min(option2, option3));
        }

        return dp[lastDay];
    }
}