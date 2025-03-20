package services.stocks;

public class BestTimeToBuySell {

    //121
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int maxProfit = 0;

        for(int i=1; i<prices.length; i++){

            int cost = prices[i] - min;
            maxProfit = Math.max(cost, maxProfit);
            min = Math.min(prices[i], min);
        }

        return maxProfit;
    }
}
