package Exercises.Second_Medium;
// 419甲板上的战舰
public class battleships_in_a_board {
    public int countBattleships(char[][] board){
        int count = 0, m = board.length, n = board[0].length;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] == 'X' && (i == 0 || board[i - 1][j] == '.') && (j == 0 || board[i][j - 1] == '.')){
                    count++;
                }
            }
        }
        return count;
    }
}
