package Exercises.First_Easy;
//1529 二进制矩阵中的特殊位置
public class special_positions_in_a_binary_matrix {
    public int numSpecial(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int count = 0;
        int[] count_row = new int[row];
        int[] count_col = new int[col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                count_row[i] += mat[i][j];
                count_col[j] += mat[i][j];
            }

        }
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (count_row[i] == 1 && count_col[j] == 1 && mat[i][j] == 1) {
                    count++;
                }
            }
        }
        return count;
    }
}
