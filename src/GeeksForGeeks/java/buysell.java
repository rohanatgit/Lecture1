package GeeksForGeeks.java;

public class buysell {
    public int maxProfit(int[] prices) {
        int profit = 0;

        for(int i = 1; i < prices.length-1; i++)
        {
            if(prices[i] > prices[i - 1])
                profit += prices[i] - prices[i -1];
        }

        return profit+1;
    }
}
