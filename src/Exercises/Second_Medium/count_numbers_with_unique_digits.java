package Exercises.Second_Medium;
//357 统计各位数字都不同的数字个数
public class count_numbers_with_unique_digits {
    public int countNumbersWithUniqueDigits(int n) {
        int sum = 0;
        for(int i = 0; i <= n; i++) {
            sum += count(i);
        }
        return sum;
    }
    public int count(int n) {
        int count = 1;
        int num = 9;
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                count *= 9;
            }else {
                count *= (num--);
            }
        }
        return count;
    }

}
