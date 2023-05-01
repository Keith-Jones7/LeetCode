package Exercises.Second_Medium;
//1020 飞地的数量
public class number_of_enclaves {
    int row;
    int col;
    int[][] grid;
    public int numEnclaves(int[][] grid){
        this.grid = grid;
        row = grid.length;
        col = grid[0].length;
        for(int i = 0; i < row; i++){
            DFS(i, 0);
            DFS(i, col - 1);
        }
        for(int j = 0; j < col; j++){
            DFS(0, j);
            DFS(row - 1, j);
        }
        int count = 0;
        for(int i = 1; i < row - 1; i++){
            for(int j = 1; j < col - 1; j++){
                if(this.grid[i][j] == 1){
                    count++;
                }
            }
        }
        return count;
    }
    public void DFS(int x, int y){
        if(x < 0 || x == row || y < 0 || y == col || this.grid[x][y] == 0){
            return;
        }
        this.grid[x][y] = 0;
        DFS(x - 1, y);
        DFS(x + 1, y);
        DFS(x, y - 1);
        DFS(x, y + 1);
    }
}
