package Exercises.Second_Medium;
//808 分汤
public class soup_servings {
    public double soupServings(int n) {
        if (n > 4800) return 1;
        n = (int) Math.ceil(n / 25.0);
        double[][] dp = new double[n + 1][n + 1];
        dp[0][0] = 0.5;
        for (int j = 1; j <= n; j++) {
            dp[0][j] = 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                double a = dp[Math.max(i - 4, 0)][j];
                double b = dp[Math.max(i - 3, 0)][Math.max(j - 1, 0)];
                double c = dp[Math.max(i - 2, 0)][Math.max(j - 2, 0)];
                double d = dp[Math.max(i - 1, 0)][Math.max(j - 3, 0)];
                dp[i][j] = 0.25 * (a + b + c + d);
            }
        }

        return dp[n][n];
    }
}
