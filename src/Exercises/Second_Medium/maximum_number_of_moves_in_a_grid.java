package Exercises.Second_Medium;
//2684 矩阵中移动的最大次数
public class maximum_number_of_moves_in_a_grid {
    public int maxMoves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] dp = new int[m][n];
        int ans = 0;

        for (int j = 1; j < n; j++) {
            for (int i = 0; i < m; i++) {
                dp[i][j] = -1;
                int val = grid[i][j];
                if ((i - 1) >= 0 && grid[i - 1][j - 1] < val && dp[i - 1][j - 1] >= 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i - 1][j - 1] + 1);
                }
                if (grid[i][j - 1] < val && dp[i][j - 1] >= 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i][j - 1] + 1);
                }
                if ((i + 1) < m && grid[i + 1][j - 1] < val && dp[i + 1][j - 1] >= 0) {
                    dp[i][j] = Math.max(dp[i][j], dp[i + 1][j - 1] + 1);
                }
                ans = Math.max(dp[i][j], ans);
            }
        }
        return ans;
    }
}
