package Exercises.First_Easy;

import java.util.LinkedList;
import java.util.List;

//66 加一
public class plus_one {
    public int[] plusOne(int[] digits) {
        int len = digits.length;
        if(digits[len - 1] < 9) {
            digits[len - 1]++;
            return digits;
        }
        List<Integer> list = new LinkedList<>();
        list.add(digits[len - 1] + 1 - 10);
        int add = 1;
        for(int i = len - 2; i >= 0; i--) {
            int num = digits[i] + add;
            if(num > 9) {
                num -= 10;
                add = 1;
            }else {
                add = 0;
            }
            System.out.println(num);
            list.add(0, num);
        }
        if(add > 0) {
            list.add(0, 1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
