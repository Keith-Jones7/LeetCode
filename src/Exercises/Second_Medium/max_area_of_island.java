package Exercises.Second_Medium;

import java.util.*;

//695 岛屿的最大面积
public class max_area_of_island {
    static boolean[][] visit;
    public int maxAreaOfIsland(int[][] grid){
        Queue<Integer> queue = new LinkedList<>();
        int row = grid.length, col = grid[0].length, max_area = 0;
        visit = new boolean[row][col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(grid[i][j] == 1 && !visit[i][j]){
                    int coordinate = i + j * 100, area = 0;
                    visit[i][j] = true;
                    queue.add(coordinate);
                    while (!queue.isEmpty()){
                        int temp = queue.poll();
                        int x = temp % 100;
                        int y = temp / 100;
                        System.out.println("x : " + x + " y : " + y);
                        System.out.println();
                        area++;
                        if((x + 1) < row && grid[x + 1][y] == 1 && !visit[x + 1][y]){
                            queue.add((x + 1) + y * 100);
                            visit[x + 1][y] = true;
                        }
                        if((x > 0) && grid[x - 1][y] == 1 && !visit[x - 1][y]){
                            queue.add((x - 1) + y * 100);
                            visit[x - 1][y] = true;
                        }
                        if((y + 1) < col && grid[x][y + 1] == 1 && !visit[x][y + 1]){
                            queue.add(x + (y + 1) * 100);
                            visit[x][y + 1] = true;
                        }
                        if((y > 0) && grid[x][y - 1] == 1 && !visit[x][y - 1]){
                            queue.add(x + (y - 1) * 100);
                            visit[x][y - 1] = true;
                        }
                    }
                    max_area = Math.max(max_area, area);
                }
            }
        }
        return max_area;
    }
}
