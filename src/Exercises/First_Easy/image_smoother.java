package Exercises.First_Easy;
//661 图片平滑器
public class image_smoother {
    public int[][] imageSmoother(int[][] img) {
        int col = img.length;
        int row = img[0].length;
        int[][] ans = new int[col][row];
        for(int i = 0; i < col; i++) {
            for(int j = 0; j < row; j++) {
                int num = 0;
                int sum = 0;
                for(int x = i - 1; x <= i + 1; x++) {
                    for(int y = j - 1; y <= j + 1; y++) {
                        if(x >= 0 && x < col && y >= 0 && y < row) {
                            num++;
                            sum += img[x][y];
                        }
                    }
                }
                ans[i][j] = sum / num;
            }
        }
        return ans;
    }
}
