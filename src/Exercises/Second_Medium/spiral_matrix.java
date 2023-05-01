package Exercises.Second_Medium;
//54 螺旋矩阵
import java.util.*;
public class spiral_matrix {
    static boolean[][] visit;
    public List<Integer> spiralOrder(int[][] matrix){
        int index1 = 0, index2 = 0, count = 0;
        int row = matrix.length, col = matrix[0].length;
        int direction = 0;
        List<Integer> list = new ArrayList<>();
        visit = new boolean[row][col];
        while (count < row * col){
            list.add(matrix[index1][index2]);
            visit[index1][index2] = true;
            count++;
            if(direction == 0){
                if(index2 == (col - 1) || visit[index1][index2 + 1]){
                    direction = 1;
                    index1++;
                }
                else {
                    index2++;
                }
            }
            else if(direction == 1){
                if(index1 == (row - 1) || visit[index1 + 1][index2]){
                    direction = 2;
                    index2--;
                }
                else {
                    index1++;
                }
            }
            else if(direction == 2){
                if(index2 == 0 || visit[index1][index2 - 1]){
                    direction = 3;
                    index1--;
                }
                else {
                    index2--;
                }
            }
            else {
                if(visit[index1 - 1][index2]){
                    direction = 0;
                    index2++;
                }
                else {
                    index1--;
                }
            }
        }
        return list;
    }
}
