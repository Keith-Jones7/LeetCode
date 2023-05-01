package Exercises.First_Easy;
//69 x的平方根
public class sqrtx {
    int C;
    public int mySqrt(int x) {
        double x0 = 1;
        double eps = 1e-5;
        C = -x;
        while (Math.abs(x0 * x0 - x ) > eps) {
            x0 = (x0 - Fx(x0)/(2 * x0));
        }
        return (int) x0;
    }
    public double Fx(double x) {
        return x * x + C;
    }
}
