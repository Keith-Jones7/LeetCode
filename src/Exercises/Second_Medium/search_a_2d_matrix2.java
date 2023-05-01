package Exercises.Second_Medium;
//240 搜索二维矩阵2
public class search_a_2d_matrix2 {
    public static void main(String[] args) {
        int [][] matrix = {{1,1}};
        int target = 2;
        search_a_2d_matrix2 solution = new search_a_2d_matrix2();
        boolean result = solution.searchMatrix(matrix, target);
    }
    public boolean searchMatrix(int[][] matrix, int target){//10月25日 240
        if(matrix.length == 0 ||matrix[0].length == 0){
            return false;
        }
        int row = matrix.length - 1;
        int col = 0;
        while (row >= 0 && col < matrix[0].length){
            if(matrix[row][col] == target)
                return true;
            else if(matrix[row][col] > target)
                row--;
            else
                col++;
        }
        return false;
    }

}


