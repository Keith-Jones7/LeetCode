package Exercises.First_Easy;
//1779 找到最忌的有相同X或Y坐标的点
public class find_nearest_point_that_has_the_same_x_or_y_coordinate {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int index = -1, min_dist = Integer.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                int temp_dist = Math.abs(points[i][0] - x) + Math.abs(points[i][1] - y);
                if (temp_dist < min_dist) {
                    index = i;
                    min_dist = temp_dist;
                }
            }
        }
        return index;
    }
}
