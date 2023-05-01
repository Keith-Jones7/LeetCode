package Exercises.Second_Medium;
//1780 判断一个数字是否可以表示成三的幂的和
public class check_if_number_is_a_sum_of_powers_of_three {
    public boolean checkPowersOfThree(int n) {
        if (n == 1) {
            return true;
        }
        if (n % 3 == 2) {
            return false;
        }
        return checkPowersOfThree(n / 3);
    }
}
