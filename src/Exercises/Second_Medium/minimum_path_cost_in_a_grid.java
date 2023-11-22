package Exercises.Second_Medium;

import java.util.Arrays;

//2304 网格中的最小路径代价
public class minimum_path_cost_in_a_grid {
    public int minPathCost(int[][] grid, int[][] moveCost) {
        int m = grid.length, n = grid[0].length;
        int[][] dp = new int[n][2];
        for (int j = 0; j < n; j++) {
            dp[j][0] = grid[0][j];
        }
        for (int i = 1; i < m; i++) {
            for (int j = 0; j < n; j++) {
                dp[j][1] = Integer.MAX_VALUE;
                for (int k = 0; k < n; k++) {
                    dp[j][1] = Math.min(dp[j][1], dp[k][0] + moveCost[grid[i - 1][k]][j] + grid[i][j]);
                }
            }
            for (int k = 0; k < n; k++) {
                dp[k][0] = dp[k][1];
                dp[k][1] = Integer.MAX_VALUE;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int i = 0; i < n; i++) {
            ans = Math.min(dp[i][0], ans);
        }
        return ans;
    }
}
