package Exercises.First_Easy;
//121 买卖股票的最佳时机
public class best_time_to_buy_and_sell_stock {
    public static int maxProfit(int[] prices){
        if(prices.length  < 2){
            return 0;
        }
        int local_min = prices[0];
        int profit = 0;
        for(int i = 1; i < prices.length; i++){
            profit = Math.max(prices[i] - local_min, profit);
            local_min = Math.min(local_min, prices[i]);
        }
        return profit;
    }

    public static void main(String[] args) {
        int[] prices = {2,2,5,1,3,4,7};
        System.out.println(maxProfit(prices));
    }
}
