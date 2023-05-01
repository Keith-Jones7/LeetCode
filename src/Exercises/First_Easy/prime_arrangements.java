package Exercises.First_Easy;
//1175 质数排列
public class prime_arrangements {
    int MOD = 1000000007;
    public int numPrimeArrangements(int n) {
        int countPrime = 0;
        for(int i = 1; i <= n; i++) {
            if(isPrime(i)) {
                countPrime++;
            }
        }
        return (int)((arrange(n - countPrime) * arrange(countPrime)) % MOD);
    }

    public long arrange(int n) {
        long ans = 1;
        for(int i = 2; i <= n; i++) {
            ans *= i;
            ans %= MOD;
        }
        return ans;
    }

    public boolean isPrime(int n) {
        if(n == 1) {
            return false;
        }
        if(n == 2) {
            return true;
        }
        for(int i = 2; i < Math.sqrt(n) + 1; i++) {
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
