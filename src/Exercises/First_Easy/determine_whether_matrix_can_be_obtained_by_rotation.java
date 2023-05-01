package Exercises.First_Easy;
//1886 判断矩阵经轮转后是否一致
public class determine_whether_matrix_can_be_obtained_by_rotation {
    public boolean findRotation(int[][] mat, int[][] target) {
        boolean bool1 = true;
        boolean bool2 = true;
        boolean bool3 = true;
        boolean bool4 = true;
        int n = mat.length;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                int val = target[i][j];
                bool1 &= (val == mat[i][j]);
                bool2 &= (val == mat[n - 1 - j][i]);
                bool3 &= (val == mat[n - 1 - i][n - 1 - j]);
                bool4 &= (val == mat[j][n - 1 - i]);
            }
        }
        return bool1 || bool2 || bool3 || bool4;
    }
}
