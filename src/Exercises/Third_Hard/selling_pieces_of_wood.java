package Exercises.Third_Hard;

import java.util.*;

//2312 卖木头块
public class selling_pieces_of_wood {
    public long sellingWood(int m, int n, int[][] prices) {
        long[][] dp = new long[m + 1][n + 1];
        for (int[] price : prices) {
            int h = price[0];
            int w = price[1];
            int p = price[2];
            dp[h][w] = p;
        }
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                for (int ii = 0; ii <= i; ii++) {
                    dp[i][j] = Math.max(dp[i][j], dp[ii][j] + dp[i - ii][j]);
                }
                for (int jj = 0; jj <= j; jj++) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][jj] + dp[i][j - jj]);
                }
            }
        }
        return dp[m][n];
    }
}
