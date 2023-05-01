package Exercises.Third_Hard;
//37 解数独
public class sudoku_solver {

    public void solveSudoku(char[][] board) {
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] sub = new int[9][9];
        for(int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                if(board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int sub_index = i / 3 * 3 + j / 3;
                    row[i][num] = 1;
                    col[j][num] = 1;
                    sub[sub_index][num] = 1;
                }
            }
        }
        solve(board, 0, 0, row, col, sub);
    }
    public boolean solve(char[][] board, int row_index, int col_index, int[][] row, int[][] col, int[][] sub) {
        while (board[row_index][col_index] != '.') {
            if((++col_index) >= 9) {
                row_index++;
                col_index = 0;
            }
            if(row_index >= 9) {
                return true;
            }
        }
        int sub_index = row_index / 3 * 3 + col_index / 3;
        for(int i = 0; i < 9; i++) {
            if(row[row_index][i] == 0 && col[col_index][i] == 0 && sub[sub_index][i] == 0) {
                board[row_index][col_index] = (char) (i + '1');
                row[row_index][i] = 1;
                col[col_index][i] = 1;
                sub[sub_index][i] = 1;
                if(solve(board, row_index, col_index, row, col, sub)) {
                    return true;
                }else {
                    board[row_index][col_index] = '.';
                    row[row_index][i] = 0;
                    col[col_index][i] = 0;
                    sub[sub_index][i] = 0;
                }
            }
        }
        return false;
    }
}
