package Exercises.Third_Hard;
//1289 下降路径最小和2
public class minimum_falling_path_sum_2 {
    public int minFallingPathSum(int[][] grid) {
        int min1 = 0, min2 = 0, idx1 = -1, n = grid.length;
        for (int[] nums : grid) {
            int tempMin1 = Integer.MAX_VALUE, tempMin2 = Integer.MAX_VALUE, tempIdx1 = -1;
            for (int i = 0; i < n; i++) {
                int sum = nums[i];
                if (i == idx1) {
                    sum += min2;
                }else {
                    sum += min1;
                }
                if (sum < tempMin1) {
                    tempMin2 = tempMin1;
                    tempMin1 = sum;
                    tempIdx1 = i;
                }else if (sum < tempMin2) {
                    tempMin2 = sum;
                }
            }
            min1 = tempMin1;
            min2 = tempMin2;
            idx1 = tempIdx1;
        }
        return min1;
    }

}
