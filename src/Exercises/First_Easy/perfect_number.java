package Exercises.First_Easy;
//507 完美数
public class perfect_number {
    public boolean checkPerfectNumber(int num){
        int sum = 0;
        double sqrt = Math.sqrt(num);
        for(int i = 2; i <= sqrt; i++){
            if(num % i == 0){
                sum += i;
                sum += (num/i);
            }
        }
        if(sqrt == (int) sqrt){
            sum -= (int)sqrt;
        }
        return ++sum == num;
    }
}
