package Exercises.Second_Medium;
//994 腐烂的橘子
import java.util.*;
public class rotting_orange {
    static boolean[][] visit;
    int row;
    int col;
    public int orangesRotting(int[][] grid){
        int time = 0, count_fresh = 0;
        row = grid.length;
        col = grid[0].length;
        Queue<int[]> queue = new LinkedList<>();
        visit = new boolean[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1){
                    count_fresh++;
                }
                if(grid[i][j] == 2){
                    queue.add(new int[]{i, j});
                    visit[i][j] = true;
                }
            }
        }
        if(count_fresh == 0){
            return 0;
        }
        while (!queue.isEmpty()){
            Queue<int[]> queue2 = new LinkedList<>();
            while (!queue.isEmpty()){
                int[] index = queue.poll();
                int x = index[0], y = index[1];
                if(x > 0 && !visit[x - 1][y] && grid[x - 1][y] == 1){
                    grid[x - 1][y] = 2;
                    visit[x - 1][y] = true;
                    count_fresh--;
                    queue2.add(new int[]{x - 1, y});
                }
                if(x < row - 1 && !visit[x + 1][y] && grid[x + 1][y] == 1){
                    grid[x + 1][y] = 2;
                    visit[x + 1][y] = true;
                    count_fresh--;
                    queue2.add(new int[]{x + 1, y});
                }
                if(y > 0 && !visit[x][y - 1] && grid[x][y - 1] == 1){
                    grid[x][y - 1] = 2;
                    visit[x][y - 1] = true;
                    count_fresh--;
                    queue2.add(new int[]{x, y - 1});
                }
                if(y < col - 1 && !visit[x][y + 1] && grid[x][y + 1] == 1){
                    grid[x][y + 1] = 2;
                    visit[x][y + 1] = true;
                    count_fresh--;
                    queue2.add(new int[]{x, y + 1});
                }
            }
            queue = queue2;
            time++;
            if(count_fresh == 0){
                return time;
            }

        }
        if(count_fresh > 0){
            return -1;
        }
        return time;
    }
}
