package Exercises.Second_Medium;
//714 买卖股票的最佳时机含手续费
public class best_time_to_buy_and_sell_stock_with_transaction_fee {
    public static int maxProfit(int[] prices, int fee){
        if(prices.length == 1){
            return 0;
        }
        int profit = 0;
        int buy = prices[0] + fee;
        for(int i = 1; i < prices.length; i++){
            if(prices[i] + fee < buy){
                buy = prices[i] + fee;
            }
            if(prices[i] > buy){
                profit += prices[i] - buy;
                buy = prices[i];
            }
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {1,3,2,8,4,9};
        maxProfit(prices, 2);
    }
}
