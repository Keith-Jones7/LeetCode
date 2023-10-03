package Exercises.Third_Hard;
//123 买卖股票的最佳时机3
public class best_time_to_buy_and_sell_stock_3 {
    public int maxProfit(int[] prices) {
        int len = prices.length;
        int[] reverse = new int[len + 1];
        int min = Integer.MAX_VALUE, tempAns = 0;
        for (int i = len - 1; i >= 0; i--) {
            if ((-prices[i]) > min) {
                tempAns = Math.max(tempAns, -prices[i] - min);
            }else {
                min = -prices[i];
            }
            reverse[i] = tempAns;
        }
        min = Integer.MAX_VALUE;
        tempAns = 0;
        int ans = reverse[0];
        for (int i = 0; i < len; i++) {
            if (prices[i] > min) {
                tempAns = Math.max(tempAns, prices[i] - min);
            }else {
                min = prices[i];
            }
            ans = Math.max(ans, tempAns + reverse[i + 1]);
        }
        return ans;
    }
}
