package Exercises.First_Easy;
//566 重塑矩阵
public class reshape_the_matrix {
    public int[][] matrixReshape(int[][] mat, int r, int c){
        int m = mat.length;
        int n = mat[0].length;
        if(m * n != r * c){
            return mat;
        }
        int[][] reshape = new int[r][c];
        int mat_index1 = 0;
        int mat_index2 = 0;
        int re_index1 = 0;
        int re_index2 = 0;
        while(mat_index1 < m){
            reshape[re_index1][re_index2++] = mat[mat_index1][mat_index2++];
            if(re_index2 == c){
                re_index2 = 0;
                re_index1++;
            }
            if(mat_index2 == n){
                mat_index2 = 0;
                mat_index1++;
            }
        }
        return reshape;
    }
}
