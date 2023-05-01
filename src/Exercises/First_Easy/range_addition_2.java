package Exercises.First_Easy;
//598 范围求和2
public class range_addition_2 {
    public int maxCount(int m, int n, int[][] ops) {
        int min_row = m;
        int min_col = n;
        for(int i = 0; i < ops.length; i++) {
            min_row = Math.min(ops[i][0], min_row);
            min_col = Math.min(ops[i][1], min_col);
        }
        return min_row * min_col;
    }
}
