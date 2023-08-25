package Exercises.Second_Medium;
//1267 统计参与通信的服务器
public class count_servers_that_communicate {
    public int countServers(int[][] grid) {
        int m = grid.length, n = grid[0].length;
        int[] cntRow = new int[m];
        int[] cntCol = new int[n];
        int sum = 0, cnt = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                cntRow[i] += grid[i][j];
                sum += grid[i][j];
            }
        }
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                cntCol[j] += grid[i][j];
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && cntRow[i] == 1 && cntCol[j] == 1) {
                    cnt++;
                }
            }
        }
        return sum - cnt;
    }
}
