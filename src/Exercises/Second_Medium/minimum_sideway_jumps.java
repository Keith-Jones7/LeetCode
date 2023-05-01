package Exercises.Second_Medium;
//1824 最少侧跳次数
public class minimum_sideway_jumps {
    public int minSideJumps(int[] obstacles) {
        int len = obstacles.length;
        int[][] dp = new int[len][3];
        dp[0][0] = dp[0][2] = 1;
        for (int i = 1; i < dp.length; i++) {
            for (int j = 0; j < 3; j++) {
                if (obstacles[i] != j + 1) {
                    dp[i][j] = dp[i - 1][j];
                }
            }
            if (obstacles[i] != 0) {
                dp[i][obstacles[i] - 1] = 10000000;
            }
            if (obstacles[i] != 1) {
                dp[i][0] = Math.min(dp[i][0], Math.min(dp[i][1], dp[i][2]) + 1);
            }
            if (obstacles[i] != 2) {
                dp[i][1] = Math.min(dp[i][1], Math.min(dp[i][0], dp[i][2]) + 1);
            }
            if (obstacles[i] != 3) {
                dp[i][2] = Math.min(dp[i][2], Math.min(dp[i][0], dp[i][1]) + 1);
            }
        }
        return Math.min(dp[len - 1][0], Math.min(dp[len - 1][1], dp[len - 1][2]));
    }
}
