package Exercises.Second_Medium;
//122 买卖股票最佳时机2
public class best_time_to_but_and_sell_stock_2 {
    public int maxProfit(int[] prices){
        if(prices.length == 1){
            return 0;
        }
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            profit += Math.max(prices[i] - prices[i - 1], 0);
        }
        return profit;
    }
}
