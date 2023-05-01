package Exercises.Second_Medium;

//264 丑数2
public class ugly_number_2 {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n + 1];
        dp[1] = 1;
        int p1 = 1, p2 = 1, p3 = 1;
        for (int i = 2; i <= n; i++) {
            int num1 = dp[p1] * 2, num2 = dp[p2] * 3, num3 = dp[p3] * 5;
            dp[i] = Math.min(Math.min(num1, num2), num3);
            if (dp[i] == num1) {
                p1++;
            }
            if (dp[i] == num2) {
                p2++;
            }
            if (dp[i] == num3) {
                p3++;
            }
        }
        return dp[n];
    }
}
