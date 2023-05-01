package Exercises.Second_Medium;
//498 对角线遍历
public class diagonal_traverse {
    public int[] findDiagonalOrder(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;
        int[] diag = new int[row * col];
        int index1 = 0, index2 = 0, count = 0;
        boolean flag = true;
        while (count < diag.length) {
            diag[count++] = mat[index1][index2];
            int x, y;
            if(flag) {
                x = index1 - 1;
                y = index2 + 1;
            }else {
                x = index1 + 1;
                y = index2 - 1;
            }
            if(count < diag.length && (x < 0 || x == row || y < 0 || y == col)) {
                if(flag) {
                    x = index2 + 1 < col ? index1 : index1 + 1;
                    y = index2 + 1 < col ? index2 + 1 : index2;
                }else {
                    x = index1 + 1 < row ? index1 + 1 : index1;
                    y = index1 + 1 < row ? index2 : index2 + 1;
                }
                flag = !flag;
            }
            index1 = x;
            index2 = y;
        }
        return diag;
    }
}
