package Exercises.Second_Medium;
import java.util.*;
//417 太平洋大西洋水流问题
public class pacific_atlantic_water_flow {
    boolean[][] pacific;
    boolean[][] atlantic;
    int row;
    int col;
    int[][] dist = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    int[][] grid;
    public List<List<Integer>> pacificAtlantic(int[][] height) {
        row = height.length;
        col = height[0].length;
        pacific = new boolean[row][col];
        atlantic = new boolean[row][col];
        grid = height;
        for(int i = 0; i < row; i++) {
            Pacific(i, 0);
            Atlantic(i, col - 1);
        }
        for(int j = 0; j < col; j++) {
            Pacific(0, j);
            Atlantic(row - 1, j);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(pacific[i][j] && atlantic[i][j]) {
                    List<Integer> list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    ans.add(list);
                }
            }
        }
        return ans;
    }
    public void Pacific(int x, int y) {
        pacific[x][y] = true;
        for (int[] ints : dist) {
            int next_x = x + ints[0];
            int next_y = y + ints[1];
            if (inArea(next_x, next_y) && !pacific[next_x][next_y] && grid[next_x][next_y] >= grid[x][y]) {
                Pacific(next_x, next_y);
            }
        }

    }
    public void Atlantic(int x, int y) {
        atlantic[x][y] = true;
        for (int[] ints : dist) {
            int next_x = x + ints[0];
            int next_y = y + ints[1];
            if (inArea(next_x, next_y) && !atlantic[next_x][next_y] && grid[next_x][next_y] >= grid[x][y]) {
                Atlantic(next_x, next_y);
            }
        }
    }
    public boolean inArea(int x, int y) {
        return x >= 0 && y >= 0 && x != row && y != col;
    }
}

