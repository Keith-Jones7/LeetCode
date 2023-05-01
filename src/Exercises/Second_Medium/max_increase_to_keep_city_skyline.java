package Exercises.Second_Medium;
//807 保持城市天际线
public class max_increase_to_keep_city_skyline {
    public int maxIncreaseKeepingSkyline(int[][] grid){
        int length = grid.length;
        int[] front = new int[length];
        int[] left = new int[length];
        for(int i = 0; i < length; i++){
            int front_max = 0;
            int left_max = 0;
            for(int j = 0; j < length; j++){
                front_max = Math.max(grid[i][j], front_max);
                left_max = Math.max(grid[j][i], left_max);
            }
            front[i] = front_max;
            left[i] = left_max;
        }
        int sum = 0;
        for(int i = 0; i < length; i++){
            for(int j = 0; j < length; j++){
               sum += (Math.min(front[i], left[j]) - grid[i][j]);
            }
        }
        return sum;
    }
}
