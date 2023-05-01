package Exercises.Second_Medium;
//73 矩阵置零
public class set_matrix_zero {
    public void setZeros(int[][] matrix){
        int[] m = new int[matrix.length];
        int[] n = new int[matrix[0].length];
        for(int i = 0; i < m.length; i++){
            for(int j = 0; j < n.length; j++){
                if(matrix[i][j] == 0){
                    m[i] = 1;
                    n[j] = 1;
                }
            }
        }
        for(int i = 0; i < m.length; i++){
            if(m[i] == 1){
                for(int j = 0; j < n.length; j++){
                    matrix[i][j] = 0;
                }
            }
        }
        for(int j = 0; j < n.length; j++){
            if(n[j] == 1){
                for(int i = 0; i < m.length; i++){
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
