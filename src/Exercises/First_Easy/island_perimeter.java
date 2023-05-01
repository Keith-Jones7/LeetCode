package Exercises.First_Easy;
//463 岛屿的周长
public class island_perimeter {
    public int islandPerimeter(int[][] grid) {
        int sum = 0;
        int row = grid.length;
        int col = grid[0].length;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(grid[i][j] == 1) {
                    int count = 0;
                    if(i == 0 || grid[i - 1][j] == 0) {
                        count++;
                    }
                    if(i == row - 1 || grid[i + 1][j] == 0) {
                        count++;
                    }
                    if(j == 0 || grid[i][j - 1] == 0) {
                        count++;
                    }
                    if(j == col - 1 || grid[i][j + 1] == 0) {
                        count++;
                    }
                    sum += count;
                }
            }
        }
        return sum;
    }
}
