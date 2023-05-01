package Exercises.Second_Medium;
//1219 黄金矿工
public class path_with_maximum_gold {
    int[][] grid;
    int row;
    int col;
    int max;
    public int getMaximumGold(int[][] grid){
        this.grid = grid;
        this.row = grid.length;
        this.col = grid[0].length;
        this.max = 0;
        for(int i = 0; i < grid.length; i++) {
            for(int j = 0; j < grid[0].length; j++) {
                if(grid[i][j] != 0) {
                    DFS(i, j, 0);
                }
            }
        }
        return max;
    }
    public void DFS(int x, int y, int gold){
        if(x < 0 || y < 0 || x == row || y == col || grid[x][y] == 0) {
            return;
        }
        int count = grid[x][y];
        grid[x][y] = 0;
        gold += count;
        max = Math.max(gold, max);
        DFS(x - 1, y, gold);
        DFS(x + 1, y, gold);
        DFS(x, y - 1, gold);
        DFS(x, y - 1, gold);
        grid[x][y] = count;
    }
}
