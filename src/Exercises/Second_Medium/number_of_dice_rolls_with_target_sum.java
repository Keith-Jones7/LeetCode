package Exercises.Second_Medium;
//1155 掷骰子等于目标和的方法数
public class number_of_dice_rolls_with_target_sum {
    public int numRollsToTarget(int n, int k, int target) {
        int MOD = (int)(1e9 + 7);
        int[][] dp = new int[n + 1][target + 1];
        for (int i = 1; i <= k && i <= target; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j <= target; j++) {
                for (int kk = 1; kk <= k; kk++) {
                    if (j > kk) {
                        dp[i][j] += dp[i - 1][j - kk];
                        dp[i][j] %= MOD;
                    }
                }
            }
        }
        return dp[n][target];
    }
}
