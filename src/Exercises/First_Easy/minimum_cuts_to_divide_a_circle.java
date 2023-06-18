package Exercises.First_Easy;
//2481 分割圆的最少切割次数
public class minimum_cuts_to_divide_a_circle {
    public int numberOfCuts(int n) {
        if (n == 1) {
            return 0;
        }
        if (n % 2 == 0) {
            return n / 2;
        }else {
            return n;
        }
    }
}
