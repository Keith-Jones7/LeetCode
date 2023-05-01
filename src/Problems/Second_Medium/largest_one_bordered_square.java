package Problems.Second_Medium;
//1139 最大的以1为边界的正方形
public class largest_one_bordered_square {
    public int largest1BorderedSquare(int[][] grid) {
        for (int i = Math.min(grid.length, grid[0].length); i > 0; i--) {
            if (hasSquare(grid, i)) {
                return i * i;
            }
        }
        return 0;
    }

    public boolean hasSquare(int[][] grid, int len) {
        for (int i = 0; i <= grid.length - len; i++) {
            for (int j = 0; j <= grid[0].length - len; j++) {
                boolean flag = true;
                for (int ii = i; ii < i + len; ii++) {
                    flag &= (grid[ii][j] == 1);
                    flag &= (grid[ii][j + len - 1] == 1);
                }
                for (int jj = j; jj < j + len; jj++) {
                    flag &= (grid[i][jj] == 1);
                    flag &= (grid[i + len - 1][jj] == 1);
                }
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }
}
