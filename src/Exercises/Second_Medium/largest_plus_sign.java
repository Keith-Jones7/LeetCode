package Exercises.Second_Medium;
//764 最大加号标志
public class largest_plus_sign {
    public int orderOfLargestPlusSign(int n, int[][] mines) {
        int[][] mat = new int[n][n];
        for (int[] mine: mines) {
            mat[mine[0]][mine[1]] = 1;
        }
        int left = -1, right = n / 2;
        int mid = -1;
        int flag = 0;
        while (left < right) {
            mid = (left + right) / 2;
            if (search(mat, mid)) {
                flag = 1;
                left = mid + 1;
            }else {
                flag = 0;
                right = mid - 1;
            }
        }
        return mid + flag;
    }
    public boolean search(int[][] mat, int len) {
        if (len == -1) {
            return true;
        }
        int n = mat.length;
        for (int i = len; i < n - len; i++) {
            for (int j = len; j < n - len; j++) {
                boolean flag = true;
                for (int k = (-len); k <= len; k++) {
                    if (mat[i][j + k] == 1 || mat[i + k][j] == 1) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    return true;
                }
            }
        }
        return false;
    }
}
