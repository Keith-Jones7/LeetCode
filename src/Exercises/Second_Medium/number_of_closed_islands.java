package Exercises.Second_Medium;
//1254 统计封闭岛屿的数目
public class number_of_closed_islands {
    public int closedIsland(int[][] grid) {
        int cnt = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0 && dfs(grid, i, j)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public boolean dfs(int[][] grid, int x, int y) {
        if (x < 0 || y < 0 || x == grid.length || y == grid[0].length) {
            return false;
        }
        if (grid[x][y] == 0) {
            grid[x][y] = 1;
            boolean up = dfs(grid, x - 1, y);
            boolean down = dfs(grid, x + 1, y);
            boolean left = dfs(grid, x, y - 1);
            boolean right = dfs(grid, x, y + 1);
            return up && down && left && right;
        }else {
            return true;
        }
    }
}
