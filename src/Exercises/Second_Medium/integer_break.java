package Exercises.Second_Medium;
//343 整数拆分
public class integer_break {
    public int integerBreak(int n) {
        if(n < 4) {
            return n - 1;
        }
        if(n % 3 == 0) {
            return (int)Math.pow(3, n / 3);
        }else if(n % 3 == 1) {
            return (int)Math.pow(3, n / 3 - 1) * 4;
        }else{
            return (int)Math.pow(3, (n + 1) / 3 - 1) * 2;
        }
    }
}
