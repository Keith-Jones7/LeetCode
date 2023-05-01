package Exercises.Second_Medium;
//633 平方数之和
public class sum_of_square_numbers {
    public boolean judgeSquareSum(int c) {
        if(c % 4 == 3) {
            return false;
        }
        for(int base = 2; base * base <= c; base++) {
            if(c % base != 0) {
                continue;
            }
            int exp = 0;
            while (c % base == 0) {
                c /= base;
                exp++;
            }
            if(base % 4 == 3 && exp % 2 != 0) {
                return false;
            }
        }
        return c % 4 == 3;
    }

}
