package Exercises.Second_Medium;
//172 阶乘后的零
public class factorial_trailing_zeros {
    public int trailingZeroes(int n) {
        if(n < 5) {
            return 1;
        }
        int ans = n / 5;
        return ans + trailingZeroes(ans);
    }
}
