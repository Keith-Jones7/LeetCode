package Exercises.First_Easy;

//202 快乐数
public class happy_number {
    public boolean isHappy(int n) {
        int sum = 0;
        while (n > 0) {
            sum += (n % 10) * (n % 10);
            n = n / 10;
        }
        if(sum == 1) {
            return true;
        }
        if(sum == 4) {
            return false;
        }
        return isHappy(sum);
    }
}
