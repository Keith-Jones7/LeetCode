package Exercises.Second_Medium;

import java.util.LinkedList;
import java.util.Queue;

//1034 边界着色
public class coloring_a_border {
    public int[][] colorBorder(int[][] grid, int row, int col, int color){
        Queue<int[]> queue = new LinkedList<>();
        LinkedList<int[]> linkedlist = new LinkedList<>();
        int[] start = {row, col};
        int[][] visit = new int[grid.length][grid[0].length];
        queue.add(start);
        while(!queue.isEmpty()){
            int[] index = queue.poll();
            int x = index[0];
            int y = index[1];
            visit[x][y] = 1;
            if(isBorder(index, grid)){
                linkedlist.add(index);
            }
            for(int i = 0; i < 4; i++){
                int[] linked = linkedIndex(index, grid, i);
                if(linked != null && visit[linked[0]][linked[1]] == 0) {
                    queue.add(linked);
                }
            }
        }
        for(int[] index : linkedlist){
            grid[index[0]][index[1]] = color;
        }
        return grid;
    }
    public int[] linkedIndex(int[] index, int[][] grid, int coordinate){
        int x = index[0];
        int y = index[1];
        int color = grid[x][y];
        if(coordinate == 0){
            if(x > 0){
                if(color == grid[x - 1][y]){
                    return new int[]{x - 1, y};
                }
            }
            return null;
        }
        if(coordinate == 1){
            if(y > 0){
                if(color == grid[x][y - 1]){
                    return new int []{x, y - 1};
                }
            }
            return null;
        }
        if(coordinate == 2){
            if(x < grid.length - 1){
                if(color == grid[x + 1][y]){
                    return new int[] {x + 1, y};
                }
            }
            return null;
        }
        if(coordinate == 3){
            if(y < grid[0].length){
                if(color == grid[x][y + 1]){
                    return new int[] {x, y + 1};
                }
            }
            return null;
        }
        return null;
    }
    public boolean isBorder(int[] index, int[][] grid){
        int x = index[0];
        int y = index[1];
        if(x == 0 || y == 0 || x == grid.length - 1 || y == grid[0].length - 1){
            return true;
        }
        int color = grid[x][y];
        return grid[x - 1][y] != color || grid[x + 1][y] != color || grid[x][y - 1] != color || grid[x][y + 1] != color;
    }

}
