package Exercises.Second_Medium;
//794 有效的井字游戏
public class valid_tic_tac_toe_state {
    public boolean validTicTacToe(String[] board){
        int[][] new_board = new int[3][3];
        int count_1 = 0;
        int count_2 = 0;
        for(int i = 0; i < board.length; i++){
            char[] chars = board[i].toCharArray();
            for(int j = 0; j < chars.length; j++){
                if(chars[j] == ' '){
                    new_board[i][j] = 0;
                    continue;
                }
                if(chars[j] == 'X'){
                    new_board[i][j] = 1;
                    count_1++;
                }
                else {
                    new_board[i][j] = 2;
                    count_2++;
                }
            }
        }
        return valid1(count_1, count_2) && valid2(new_board, count_1, count_2);
    }
    public boolean valid1(int count_1, int count_2){//数量有效
        if(count_2 > count_1){
            return false;
        }
        return count_1 - count_2 <= 1;
    }
    public boolean valid2(int[][] new_board, int count_1, int count_2){//输赢有效
        if(isWin(new_board, 2) && isWin(new_board, 1)){
            return false;
        }
        if(isWin(new_board, 1) && count_1 < count_2 + 1){
            return false;
        }
        return !isWin(new_board, 2) || count_1 == count_2;
    }
    public boolean isWin(int[][] new_board, int count){//判断某位玩家是否赢
        boolean cross1 = true;
        boolean cross2 = true;
        for(int i = 0; i < new_board.length; i++){
            boolean col = true;
            boolean row = true;
            for(int j = 0; j < new_board[0].length; j++){
                col = col && (count == new_board[i][j]);
                row = row && (count == new_board[j][i]);
            }
            if(col || row){
                return true;
            }
            cross1 = cross1 && (count == new_board[i][i]);
            cross2 = cross2 && (count == new_board[new_board.length - 1 - i][i]);
        }
        return cross1 || cross2;
    }
}
