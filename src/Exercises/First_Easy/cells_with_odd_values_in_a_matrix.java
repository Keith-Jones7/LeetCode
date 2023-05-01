package Exercises.First_Easy;
//1252 奇数值单元格的数目
public class cells_with_odd_values_in_a_matrix {
    public int oddCells(int m, int n, int[][] indices) {
        int[] row = new int[m];
        int[] col = new int[n];
        for(int[] indice : indices) {
            row[indice[0]]++;
            col[indice[1]]++;
        }
        int count_row = 0;
        int count_col = 0;
        for(int r : row) {
            if((r & 1) == 0) {
                count_row++;
            }
        }
        for(int c : col) {
            if((c & 1) == 0) {
                count_col++;
            }
        }
        return count_row * (n - count_col) + count_col * (m - count_row);
    }
}
