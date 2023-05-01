package Exercises.First_Easy;
//2319 判断矩阵是否是一个X矩阵
public class check_if_matrix_is_x_matrix {
    public boolean checkMatrix(int[][] grid) {
        int len = grid.length;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (i == j || i + j == len - 1) {
                    if (grid[i][j] == 0) {
                        return false;
                    }
                }else {
                    if (grid[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
