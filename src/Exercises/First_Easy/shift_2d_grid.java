package Exercises.First_Easy;
import java.util.*;
//1260 二维网格迁移
public class shift_2d_grid {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> list = new ArrayList<>();
        int[] arr = shift(grid);
        int len = arr.length;
        int index = len * 100 - k;
        for(int i = 0; i < grid.length; i++) {
            List<Integer> subList = new ArrayList<>();
            for (int j = 0; j < grid[0].length; j++) {
                subList.add(arr[index++ % len]);
            }
            list.add(subList);
        }
        return list;
    }

    public int[] shift(int[][] grid) {
        int row = grid.length, col = grid[0].length;
        int[] arr = new int[row * col];
        int index = 0;
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                arr[index++] = grid[i][j];
            }
        }
        return arr;
    }
}
