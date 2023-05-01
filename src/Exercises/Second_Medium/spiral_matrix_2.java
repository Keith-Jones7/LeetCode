package Exercises.Second_Medium;
//59 螺旋矩阵2
public class spiral_matrix_2 {
    public int[][] generateMatrix(int n){
        int[][] matrix = new int[n][n];
        int index1 = 0, index2 = 0, count = 1, direction = 0;
        while (count <= (n * n)){
            matrix[index1][index2] = count;
            count++;
            if(direction == 0){
                if(index2 == (n - 1) || matrix[index1][index2 + 1] != 0){
                    direction = 1;
                    index1++;
                }
                else {
                    index2++;
                }
            }
            else if(direction == 1){
                if(index1 == (n - 1) || matrix[index1 + 1][index2] != 0){
                    direction = 2;
                    index2--;
                }
                else {
                    index1++;
                }
            }
            else if(direction == 2){
                if(index2 == 0 || matrix[index1][index2 - 1] != 0){
                    direction = 3;
                    index1--;
                }
                else {
                    index2--;
                }
            }
            else {
                if(matrix[index1 - 1][index2] != 0){
                    direction = 0;
                    index2++;
                }
                else {
                    index1--;
                }
            }
        }
        return matrix;
    }
}
