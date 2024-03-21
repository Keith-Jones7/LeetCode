package Exercises.Second_Medium;
//1969 数组元素的最小非零乘积
public class minimum_non_zero_product_of_the_array_elements {
    int MOD = 10_000;
    public int minNonZeroProduct(int p) {
        long n = (1L << p);
        long ans = quickPow(n - 2, (n - 2) / 2) * (n - 1) % MOD;
        return (int) ans;
    }

    public long quickPow(long a, long b) {
        a %= MOD;
        if (b == 0) {
            return 1;
        }
        if (b == 1) {
            return a;
        }
        long ans = quickPow(a, b / 2);
        ans = (ans * ans) % MOD;
        if (b % 2 == 1) {
            ans = (ans * a) % MOD;
        }
        return ans;
    }
}
