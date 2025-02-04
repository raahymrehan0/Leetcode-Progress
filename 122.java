class Solution {
    public int maxProfit(int[] prices) 
    {
        int profit = 0;
        int i = 0;
        int hold = prices[0];
        while (i < prices.length)
        {
            if (prices[i] > hold)
            {
                profit += prices[i] - hold;
                hold = prices[i];
            }
            else
            {
                hold = prices[i];
            }
            i++;
        }
        return profit;
    }
}