package Exercises.Second_Medium;
import java.util.*;
public class minimum_falling_path_sum {
    public int minFallingPathSum(int[][] matrix) {
        int n = matrix.length;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int min = matrix[i - 1][j];
                if (j > 0) {
                    min = Math.min(min, matrix[i - 1][j - 1]);
                }
                if (j < n - 1) {
                    min = Math.min(min, matrix[i - 1][j + 1]);
                }
                matrix[i][j] += min;
            }
        }
        int ans = Integer.MAX_VALUE;
        for (int j = 0; j < n; j++) {
            ans = Math.min(ans, matrix[n - 1][j]);
        }
        return ans;
    }

}
