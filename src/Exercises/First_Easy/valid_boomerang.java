package Exercises.First_Easy;
//1037 有效的回旋镖
public class valid_boomerang {
    public boolean isBoomerang(int[][] points) {
        int x1 = points[0][0] - points[1][0];
        int y1 = points[0][1] - points[1][1];
        int x2 = points[2][0] - points[1][0];
        int y2 = points[2][1] - points[1][1];
        return x1 * y2 != x2 * y1;
    }
}
