package Exercises.Second_Medium;

//36 有效的数独
public class valid_sudoku {
    public boolean isValidSudoku(char[][] board){
        int[][] row = new int[9][9];
        int[][] col = new int[9][9];
        int[][] sub = new int[9][9];
        for(int i = 0; i < 9; i++){
            for(int j = 0; j < 9; j++){
                if(board[i][j] != '.'){
                    int num = board[i][j] - '1';
                    int sub_index = i/3 * 3 + j / 3;
                    if(row[i][num] == 1 || col[j][num] == 1 || sub[sub_index][num] == 1){
                        return false;
                    }
                    row[i][num] = 1;
                    col[j][num] = 1;
                    sub[sub_index][num] = 1;
                }
            }
        }
        return true;
    }
}
