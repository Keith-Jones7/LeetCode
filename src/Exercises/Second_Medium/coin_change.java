package Exercises.Second_Medium;

import java.util.Arrays;

//322 零钱兑换
public class coin_change {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0) {
            return amount;
        }
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, 2 * amount);
        for (int coin : coins) {
            if (coin <= amount) {
                dp[coin] = 1;
            }
        }
        for (int i = 0; i <= amount; i++) {
            for (int coin : coins) {
                if (coin < i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }
        return dp[amount] >= 2 * amount ? -1 : dp[amount];
    }
}
