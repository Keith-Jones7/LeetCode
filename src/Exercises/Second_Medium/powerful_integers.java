package Exercises.Second_Medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//970 强整数
public class powerful_integers {
    public List<Integer> powerfulIntegers(int x, int y, int bound) {
        if (bound < 2) {
            return new ArrayList<>();
        }
        Set<Integer> set = new HashSet<>();
        List<Integer> list_x = getPower(x, bound);
        List<Integer> list_y = getPower(y, bound);
        for (int num1 : list_x) {
            for (int num2 : list_y) {
                int sum = num1 + num2;
                if (sum > bound) {
                    break;
                }else {
                    set.add(sum);
                }
            }
        }
        return new ArrayList<>(set);
    }

    public List<Integer> getPower(int num, int bound) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        if (num != 1) {
            int power = num;
            while (power < bound) {
                list.add(power);
                power *= num;
            }
        }
        return list;
    }
}
