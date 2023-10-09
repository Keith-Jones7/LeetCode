package Exercises.First_Easy;

import java.util.*;

//2578 最小和分割
public class split_with_minimum_sum {
    public int splitNum(int num) {
        List<Integer> list = new ArrayList<>();
        for (char ch : Integer.toString(num).toCharArray()) {
            list.add(ch - '0');
        }
        list.sort((o1, o2) -> (o2 - o1));
        int index1 = 0, index2 = 1;
        int sum = 0, index = 1, len = list.size();
        while (index1 < len && index2 < len) {
            sum += index * (list.get(index1) + list.get(index2));
            index1 += 2;
            index2 += 2;
            index *= 10;
        }
        if (index1 < len) {
            sum += index * list.get(index1);
        }
        if (index2 < len) {
            sum += index * list.get(index2);
        }
        return sum;
    }
}
