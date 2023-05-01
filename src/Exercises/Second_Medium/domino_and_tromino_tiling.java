package Exercises.Second_Medium;
//790 多米诺和托米诺平铺
public class domino_and_tromino_tiling {
    final static int MOD = 1000000007;
    public int numTilings(int n) {
        if (n == 1) {
            return 1;
        }
        long[] dp = new long[n + 1];
        dp[0] = dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < dp.length; i++) {
            dp[i] = (dp[i - 1] * 2 + dp[i - 3]) % MOD;
        }
        return (int)dp[n];
    }
}
