package Exercises.Second_Medium;

//200 岛屿的数量
public class number_of_islands {
    char[][] Grid;
    int row;
    int col;
    public int numIslands(char[][] grid){
        this.Grid = grid;
        row = Grid.length;
        col = Grid[0].length;
        int count = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(Grid[i][j] == '1') {
                    BFS(i, j);
                    count++;
                }
            }
        }
        return count;
    }
    public void BFS(int x, int y) {
        if(x < 0 || x == row || y < 0 || y == col || Grid[x][y] == '0') {
            return;
        }
        Grid[x][y] = '0';
        BFS(x - 1, y);
        BFS(x + 1, y);
        BFS(x, y + 1);
        BFS(x, y - 1);
    }
}
