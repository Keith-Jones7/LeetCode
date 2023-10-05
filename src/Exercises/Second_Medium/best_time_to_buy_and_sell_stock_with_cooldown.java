package Exercises.Second_Medium;
//309 最佳买卖股票时机含冷冻期
public class best_time_to_buy_and_sell_stock_with_cooldown {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[][] dp = new int[len + 1][2];
        if (prices.length < 2) {
            return 0;
        }
        dp[1][0] = -prices[0];
        dp[2][1] = Math.max(0, prices[1] - prices[0]);
        for (int i = 1; i < len; i++) {
            dp[i + 1][0] = Math.max(dp[i][0], dp[i - 1][1] - prices[i]);
            dp[i + 1][1] = Math.max(dp[i][1], dp[i][0] + prices[i]);
        }
        return dp[len][1];
    }
}
