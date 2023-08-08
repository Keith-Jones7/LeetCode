package Exercises.Second_Medium;

import java.util.Arrays;

//2679 矩阵中的和
public class sum_in_a_matrix {
    public int matrixSum(int[][] nums) {
        int col = nums[0].length;
        for (int[] num : nums) {
            Arrays.sort(num);
        }
        int sum = 0;
        for (int j = 0; j < col; j++) {
            int max = 0;
            for (int[] num : nums) {
                max = Math.max(max, num[j]);
            }
            sum += max;
        }
        return sum;
    }
}
