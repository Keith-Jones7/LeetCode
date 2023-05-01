package Exercises.Second_Medium;
//29 两数相除
public class divide_two_integer {
    public int divide(int dividend, int divisor) {
        if (dividend == 0) {
            return 0;
        }
        if (divisor == 1) {
            return dividend;
        }
        if (dividend == Integer.MIN_VALUE && divisor == -1) {
            return Integer.MAX_VALUE;
        }
        boolean negative;
        negative = (dividend ^ divisor) < 0;
        long t = Math.abs((long) dividend);
        long d = Math.abs((long) divisor);
        int result = 0;
        for (int index = 31; index >= 0; index--) {
            if ((t >> index) >= d) {
                result += (1 << index);
                t -= (d << index);
            }
        }
        return negative ? (-result) : result;
    }
}
