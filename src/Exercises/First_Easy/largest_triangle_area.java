package Exercises.First_Easy;
//812 最大三角形面积
public class largest_triangle_area {
    public double largestTriangleArea(int[][] points) {
        double area = 0;
        for(int i = 0; i < points.length; i++) {
            for(int j = i + 1; j < points.length; j++) {
                for(int k = j + 1; k < points.length; k++) {
                    double x1 = points[i][0] - points[k][0];
                    double x2 = points[j][0] - points[k][0];
                    double y1 = points[i][1] - points[k][1];
                    double y2 = points[j][1] - points[k][1];
                    area = Math.max(area, Math.abs(x1 * y2 - x2 * y1) / 2);
                }
            }
        }
        return area;
    }
}
