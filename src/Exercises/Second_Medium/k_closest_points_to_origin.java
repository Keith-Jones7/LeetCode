package Exercises.Second_Medium;

import java.util.Arrays;

//973 最接近原点的k个点
public class k_closest_points_to_origin {
    public int[][] kClosest(int[][] points, int k) {
        int len = points.length;
        if(k == len) {
            return points;
        }
        int[][] ans = new int[k][2];
        Arrays.sort(points, (p1, p2) -> (p1[0] * p1[0] + p1[1] * p1[1] - p2[0] * p2[0] - p2[1] * p2[1]));
        System.arraycopy(points, 0, ans, 0, k);
        return ans;
    }
}
