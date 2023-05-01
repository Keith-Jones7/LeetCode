package Exercises.Second_Medium;
//1828 统计一个圆中点的数目
public class queries_on_number_of_points_inside_a_circle {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] ans = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int x0 = queries[i][0];
            int y0 = queries[i][1];
            int r2 = queries[i][2];
            int count = 0;
            for (int[] point : points) {
                int x = point[0];
                int y = point[1];
                if ((x0 - x) * (x0 - x) + (y0 - y) * (y0 - y) <= r2 * r2) {
                    count++;
                }
            }
            ans[i] = count;
        }
        return ans;
    }
}
