package Exercises.Second_Medium;
//1976 到达目的地的方案数
public class number_of_ways_to_arrive_at_destination {
    public int countPaths(int n, int[][] roads) {
        long[][] map = new long[n][n];
        int[][] dp = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                map[i][j] = Long.MAX_VALUE / 2;
            }
            map[i][i] = 0;
            dp[i][i] = 1;
        }
        for (int[] road : roads) {
            int x = road[0];
            int y = road[1];
            int time = road[2];
            map[x][y] = time;
            map[y][x] = time;
            dp[x][y] = 1;
            dp[y][x] = 1;
        }
        int MOD = (int) (1e9 + 7);
        for (int k = 0; k < n; k++) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    if (i == j || i == k || j == k) {
                        continue;
                    }
                    if (map[i][k] + map[k][j] < map[i][j]) {
                        map[i][j] = map[i][k] + map[k][j];
                        dp[i][j] = dp[i][k] * dp[k][j];
                        dp[i][j] %= MOD;
                    }else if (map[i][k] + map[k][j] == map[i][j]){
                        dp[i][j] += dp[i][k] * dp[k][j];
                        dp[i][j] %= MOD;
                    }
                }
            }
        }
        return dp[0][n - 1];
    }
}
