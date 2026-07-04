class Solution {
    public int maxProfit(int[] prices) {
        // Edge case: if there are fewer than 2 days, no profit can be made
        if (prices == null || prices.length < 2) {
            return 0;
        }

        int minPrice = prices[0]; 
        int maxProfit = 0;      

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } 
            else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }

        return maxProfit;
    }
}