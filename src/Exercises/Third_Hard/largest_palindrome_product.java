package Exercises.Third_Hard;
//479 最大的回文数乘积
public class largest_palindrome_product {
    int MOD = 1337;
    public int largestPalindrome(int n) {
        if(n == 1) {
            return 9;
        }
        int upper = (int) Math.pow(10, n) - 1;
        int ans = 0;
        for(int left = upper; ans == 0; --left) {
            long p = left;
            for(int x = left; x > 0; x /= 10) {
                p = (p * 10) + x % 10;
            }
            for(long x = upper; x * x >= p; --x) {
                if(p % x == 0) {
                    ans = (int) (p % MOD);
                    break;
                }
            }
        }
        return ans;
    }

}
