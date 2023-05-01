package Exercises.Second_Medium;

import java.util.Arrays;

// 面试题01.08 零矩阵
public class zero_matrix_lcci {
    public void setZeroes(int[][] matrix) {
        boolean[] row = new boolean[matrix.length];
        boolean[] column = new boolean[matrix[0].length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = column[j] = true;
                }
            }
        }
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (column[j] || row[i]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
