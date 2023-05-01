package Exercises.First_Easy;
//1266 访问所有点的最小时间
public class minimun_time_visiting_all_points {
    public int minTimeToVisitAllPoints(int[][] points) {
        int sum_time = 0;
        for(int i = 0; i < points.length - 1; i++) {
            int x_interval = Math.abs(points[i][0] - points[i + 1][0]);
            int y_interval = Math.abs(points[i][1] - points[i + 1][1]);
            sum_time += Math.max(x_interval, y_interval);
        }
        return sum_time;
    }
}
