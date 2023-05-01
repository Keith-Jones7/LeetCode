package Exercises.Second_Medium;

import java.util.Random;

//497 非重叠矩阵中的随机点
public class random_point_in_non_overlapping_rectangles {
    int[] Area_sum;
    int MAX;
    int len;
    Random random;
    int[][] rects;
    public random_point_in_non_overlapping_rectangles(int[][] rects) {
        this.rects = rects;
        this.len = rects.length;
        Area_sum = new int[len];
        for(int i = 0; i < len; i++) {
            int area = area(rects[i][0], rects[i][2], rects[i][1], rects[i][3]);
            Area_sum[i] = (i == 0 ? 0 : Area_sum[i - 1]) + area;
        }
        random = new Random();
        MAX = Area_sum[len - 1];
    }
    public int[] pick() {
        int random_area = random.nextInt(MAX);
        int index = -1;
        for(int i = 0; i < len; i++) {
            if(Area_sum[i] > random_area) {
                index = i;
                break;
            }
        }
        return pickInRectangle(rects[index][0], rects[index][2], rects[index][1], rects[index][3]);
    }
    public int[] pickInRectangle(int x1, int x2, int y1, int y2) {
        int x = random.nextInt(x2 - x1 + 1) + x1;
        int y = random.nextInt(y2 - y1 + 1) + y1;
        return new int[]{x, y};
    }
    public int area(int x1, int x2, int y1, int y2) {
        return (y2 - y1 + 1) * (x2 - x1 + 1);
    }
}

