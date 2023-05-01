package Exercises.First_Easy;
import java.util.*;
//1380 矩阵中的幸运数
public class lucky_numbers_in_a_matrix{
    public List<Integer> luckyNumbers(int[][] matrix){
        int row = matrix.length;
        int col = matrix[0].length;
        int[] index_row = new int[row];
        int[] index_col = new int[col];
        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(matrix[i][j] < matrix[i][index_row[i]]){
                    index_row[i] = j;
                }
                if(matrix[i][j] > matrix[index_col[j]][j]){
                    index_col[j] = i;
                }
            }
        }
        List<Integer> ans = new ArrayList<>();
        for(int i = 0; i < row; i++){
            if(i == index_col[index_row[i]]){
                ans.add(matrix[i][index_row[i]]);
            }
        }
        return ans;
    }
}
