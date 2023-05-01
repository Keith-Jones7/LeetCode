package Exercises.First_Easy;
//231 2的幂
public class power_of_two {
    public boolean isPowerOfTwo(int n){
        if(n <= 0){
            return false;
        }
        return (n & (n - 1)) == 0;
    }
}
