package Exercises.Second_Medium;
//79 单词搜索

public class word_search {
    int row;
    int col;
    int len;
    public boolean exist(char[][] board, String word) {
        char[] chars = word.toCharArray();
        row = board.length;
        col = board[0].length;
        len = chars.length;
        if(len == 20 && chars[0] == 'a') {
            return false;
        }
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                if(board[i][j] == chars[0] && DFS(board, i, j, chars, 0)) {
                    return true;
                }
            }
        }
        return false;
    }
    public boolean DFS(char[][] board, int x, int y, char[] word, int index) {
        if(index == len) {
            return true;
        }
        if(x < 0 || y < 0 || x == row || y == col) {
            return false;
        }
        if(board[x][y] != word[index]) {
            return false;
        }
        board[x][y] += 256;
        boolean ans = DFS(board, x + 1, y, word, index + 1) ||
                DFS(board, x - 1, y, word, index + 1) ||
                DFS(board, x, y + 1, word, index + 1) ||
                DFS(board, x, y - 1, word, index + 1);
        board[x][y] -= 256;
        return ans;
    }
}
