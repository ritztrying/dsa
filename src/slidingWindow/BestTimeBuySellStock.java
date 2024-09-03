package slidingWindow;
/*
Problem link: https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
 */
public class BestTimeBuySellStock {

    public static int maxProfit(int[] prices) {
        int maxProfit = 0;
        int buyingPrice = prices[0];
        for(int i=1; i<prices.length; i++) {
            if(buyingPrice>prices[i]){
                buyingPrice = prices[i];
            }
            int profit = prices[i] - buyingPrice;
            maxProfit = Math.max(maxProfit, profit);
        }
        return maxProfit;
    }

    public static void main(String[] args) {
        int[] prices = {7,6,4,3,1};
        int result = maxProfit(prices);
        System.out.println("Result: "+result);
    }
}
