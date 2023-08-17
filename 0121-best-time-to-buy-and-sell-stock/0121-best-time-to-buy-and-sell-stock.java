class Solution {
    public int maxProfit(int[] prices) {
        int profit = 0;
        int low = prices[0];
        for (int price : prices) {
            if (price < low) {
                low = price;
            }
            profit = Math.max(profit, price - low);
        }
        return profit;
    }
}