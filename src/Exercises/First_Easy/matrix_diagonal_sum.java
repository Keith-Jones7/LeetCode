package Exercises.First_Easy;
//1572 矩阵对角线元素的和
public class matrix_diagonal_sum {
    public int diagonalSum(int[][] mat) {
        int sum = 0, n = mat.length;
        for (int i = 0; i < n; i++) {
            int j = n - i - 1;
            sum += mat[i][i];
            sum += mat[i][j];
            if (i == j) {
                sum -= mat[i][i];
            }
        }
        return sum;
    }
}
