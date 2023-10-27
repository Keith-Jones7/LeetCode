package Exercises.Second_Medium;

import java.util.Arrays;

//1465 切歌后面积最大的蛋糕
public class maximum_area_of_a_piece_of_cake_after_horizontal_and_vertical_cuts {
    public int maxArea(int h, int w, int[] horizontalCuts, int[] verticalCuts) {
        Arrays.sort(horizontalCuts);
        Arrays.sort(verticalCuts);
        int col = horizontalCuts.length, row = verticalCuts.length;
        int maxHo = Math.max(h - horizontalCuts[col - 1], horizontalCuts[0]);
        int maxVe = Math.max(w - verticalCuts[row - 1], verticalCuts[0]);
        for (int i = 1; i < col; i++) {
            maxHo = Math.max(horizontalCuts[i] - horizontalCuts[i - 1], maxHo);
        }
        for (int i = 1; i < row; i++) {
            maxVe = Math.max(verticalCuts[i] - verticalCuts[i - 1], maxVe);
        }
        return (int) ((long) maxHo * maxVe % (int)(1e9 + 7));
    }
}
