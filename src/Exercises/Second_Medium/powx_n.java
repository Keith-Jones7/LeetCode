package Exercises.Second_Medium;
//50 Pow(x,n)
public class powx_n {
    public double myPow(double x, int n) {
        if(n == -1) {
            return 1 / x;
        }
        if(n == 0) {
            return 1;
        }
        if(n == 1) {
            return x;
        }
        return myPow(x * x, n / 2) * myPow(x, n - (n / 2) * 2);
    }
}
