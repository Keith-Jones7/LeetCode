package Exercises.Third_Hard;
//878 第n个神奇数字
public class nth_magical_number {
    int MOD = (int)1e9 + 7;
    public int nthMagicalNumber(int n, int a, int b) {
        if (a % b == 0) {
            return nthMagicalNumber(n, a);
        }
        if (b % a == 0) {
            return nthMagicalNumber(n, b);
        }
        System.out.println(gcd(a, b));
        int lcm = a / gcd(a, b) * b;
        long left = 0, right = Long.MAX_VALUE;
        while (left < right) {
            long mid = left + (right - left) / 2;
            long f = mid / a + mid / b - mid / lcm;
            if (n <= f) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return (int)(left % MOD);
    }

    public int gcd(int a, int b) {
        if (b % a == 0) {
            return a;
        }
        if (a % b == 0) {
            return b;
        }
        if (a > b) {
            return gcd(a % b, b);
        }else {
            return gcd(a, b % a);
        }

    }
    public int nthMagicalNumber(int n, int a) {
        return (int)((long) n * a % MOD);
    }
}
