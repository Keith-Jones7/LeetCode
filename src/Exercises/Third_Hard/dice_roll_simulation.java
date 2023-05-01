package Exercises.Third_Hard;
//1233 掷骰子模拟
public class dice_roll_simulation {
    final static int MOD = 1000000007;
    public int dieSimulator(int n, int[] rollMax) {
        int[][] dp = new int[n + 1][7];
        for (int i = 1; i < 7; i++) {
            dp[1][i] = 1;
        }
        dp[0][0] = 1;
        dp[1][0] = 6;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j < 7; j++) {
                int cur = rollMax[j - 1];
                dp[i][j] = (dp[i - 1][0] - dp[i - 1][j]) % MOD;
                if (cur >= i) {
                    dp[i][j] = (dp[i][j] + dp[i - 1][j]) % MOD;
                }else if (cur > 1) {
                    dp[i][j] = ((dp[i][j] + dp[i - 1][j]) % MOD - (dp[i - cur - 1][0] - dp[i - cur - 1][j]) % MOD) % MOD;
                    if (dp[i][j] < 0) {
                        dp[i][j] += MOD;
                    }
                }
                dp[i][0] = (dp[i][0] + dp[i][j]) % MOD;
            }
        }
        return dp[n][0];
    }
}
