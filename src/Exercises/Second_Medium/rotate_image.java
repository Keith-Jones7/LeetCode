package Exercises.Second_Medium;

//48 旋转图像
public class rotate_image {
    public void rotate(int[][] matrix){
        int len = matrix.length;
        for(int i = 0; i < len; i++){
            for(int j = i + 1; j < len; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        for(int i = 0; i < len/2; i++){
            for(int j = 0; j < len; j++){
                int temp = matrix[j][i];
                matrix[j][i] = matrix[j][len - i - 1];
                matrix[j][len - i - 1] = temp;
            }
        }
    }
}
