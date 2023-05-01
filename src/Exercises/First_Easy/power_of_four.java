package Exercises.First_Easy;
//342 4的幂
public class power_of_four {
    public boolean isPowerOfFour(int n) {
        if (n == 1 || n == 4) {
            return true;
        }
        if (n < 4) {
            return false;
        }else {
            return isPowerOfFour(n / 4) && (n % 4 == 0);
        }
    }
}
