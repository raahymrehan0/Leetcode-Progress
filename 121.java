class Solution {
    public int maxProfit(int[] prices) 
    {
        int min_price = 100_000;
        int max_profit = -1;
        int profit;

        for (int price : prices)
        {
            if (price < min_price)
            {
                min_price = price;
            }

            profit = price - min_price;

            if (profit > max_profit)
            {
                max_profit = profit;
            }

        }
        return max_profit;
    }
}