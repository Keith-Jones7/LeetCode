package Exercises.First_Easy;
//338 比特位计数
public class counting_bits {
    public int[] countBits(int n) {
        int dp[] = new int[n + 1];
        for (int i = 0; i <= n / 2; i++) {
            dp[i*2] = dp[i];
            if(i*2+1 <= n)
                dp[i*2+1] = dp[i] + 1;
        }
        return dp;
    }
}
