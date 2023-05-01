package Exercises.Second_Medium;
//304 二维区域和检索-矩阵不可变
public class range_sum_query_2d_immutable {
    public int[][] sumMatrix;
    public range_sum_query_2d_immutable(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        sumMatrix = new int[row + 1][col + 1];
        for(int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                sumMatrix[i + 1][j + 1] = sumMatrix[i][j + 1] + sumMatrix[i + 1][j] - sumMatrix[i][j] + matrix[i][j];
            }
        }
    }
    public int sumRegion(int row1, int col1, int row2, int col2) {
        return sumMatrix[row2 + 1][col2 + 1] - sumMatrix[row2 + 1][col1] - sumMatrix[row1][col2 + 1] + sumMatrix[row1][col1];
    }
}
