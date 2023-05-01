package Exercises.First_Easy;
//367 有效的完全平方数
public class valid_perfect_square {
    public boolean isPerfectSquare(int num) {
        int left = 1, right = num, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            int temp = num / mid;
            if(temp == mid) {
                if(temp * mid == num) {
                    return true;
                }else {
                    left = mid + 1;
                }
            }else if(temp < mid) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        return false;
    }
}
