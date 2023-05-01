package Exercises.Second_Medium;

import java.util.Random;

//478 在圆内随机生成点
public class generate_random_point_in_a_circle {
    double X_center;
    double Y_center;
    double Radius;
    double R;
    Random random;
    public generate_random_point_in_a_circle(double radius, double x_center, double y_center) {
        X_center = x_center;
        Y_center = y_center;
        Radius = radius;
        R = radius * radius;
        random = new Random();
    }
    public double[] randPoint() {
        double[] ans = new double[2];
        ans[0] = random.nextDouble(2 * Radius) - Radius;
        ans[1] = random.nextDouble(2 * Radius) - Radius;
        while (Math.pow(ans[0], 2) + Math.pow(ans[1], 2) > R) {
            ans[0] = random.nextDouble(2 * Radius) - Radius;
            ans[1] = random.nextDouble(2 * Radius) - Radius;
        }
        ans[0] += X_center;
        ans[1] += Y_center;
        return ans;
    }

}

