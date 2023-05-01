package Exercises.Second_Medium;
//1765 地图中的最高点
public class map_of_highest_peak {
    public int[][] highestPeak(int[][] mat){
        int row = mat.length, col = mat[0].length;
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(mat[i][j] == 1){
                    mat[i][j] = col + row;
                }
                else {
                    mat[i][j] = 1;
                }
                if(i > 0){
                    mat[i][j] = Math.min(mat[i][j], mat[i - 1][j] + 1);
                }
                if(j > 0){
                    mat[i][j] = Math.min(mat[i][j], mat[i][j - 1] + 1);
                }
            }
        }
        for (int i = row - 1; i > -1; i--){
            for(int j = col - 1; j > -1; j--){
                if(i < row - 1){
                    mat[i][j] = Math.min(mat[i][j], mat[i + 1][j] + 1);
                }
                if(j < col - 1){
                    mat[i][j] = Math.min(mat[i][j], mat[i][j + 1] + 1);
                }
            }
        }
        return mat;
    }
}
