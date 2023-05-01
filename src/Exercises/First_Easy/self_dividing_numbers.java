package Exercises.First_Easy;
import java.util.*;
//728 自除数
public class self_dividing_numbers {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int num = left; num <= right; num++) {
            if(isSelfDividing(num)) {
                list.add(num);
            }
        }
        return list;
    }
    public boolean isSelfDividing(int num) {
        if(num < 10) {
            return true;
        }
        int MOD = 1;
        while (MOD <= num) {
            int divide = (num / MOD) % 10;
            if(divide == 0) {
                return false;
            }
            if(num % divide != 0) {
                return false;
            }
            MOD *= 10;
        }
        return true;
    }
}
