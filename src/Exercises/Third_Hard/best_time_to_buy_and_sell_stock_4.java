package Exercises.Third_Hard;
//188 买卖股票的最佳时机4
public class best_time_to_buy_and_sell_stock_4 {
    public int maxProfit(int k, int[] prices) {
        int n = prices.length;

        // 处理特殊情况，当交易次数k足够大时，可以当作不限交易次数来处理，以避免超时
        if (k >= n / 2) {
            int maxProfit = 0;
            for (int i = 1; i < n; i++) {
                if (prices[i] > prices[i - 1]) {
                    maxProfit += prices[i] - prices[i - 1];
                }
            }
            return maxProfit;
        }

        int[][] dp = new int[n][k + 1];

        for (int j = 1; j <= k; j++) {
            int maxDiff = -prices[0];
            for (int i = 1; i < n; i++) {
                dp[i][j] = Math.max(dp[i - 1][j], prices[i] + maxDiff);
                maxDiff = Math.max(maxDiff, dp[i - 1][j - 1] - prices[i]);
            }
        }

        return dp[n - 1][k];
    }
}
