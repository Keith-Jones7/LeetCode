package Exercises.First_Easy;
//374 猜数字大小
public class guess_number_higher_or_lower {
    public int guessNumber(int n){
        if(n == 1){
            return n;
        }
        int mid = n/2;
        int left = 1;
        int right = n;
        while(guess(mid) != 0){
            if(guess(mid) == -1){
                left = mid;
            }
            else{
                right = mid;
            }
            mid = (right + left)/2;
        }
        return mid;
    }
    int guess(int num){
        return 0;
    }
}
