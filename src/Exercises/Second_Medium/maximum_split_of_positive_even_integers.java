package Exercises.Second_Medium;
import java.util.*;
//2178 拆分成最多数目的正偶数之和
public class maximum_split_of_positive_even_integers {
    public List<Long> maximumEvenSplit(long finalSum) {
        List<Long> list = new ArrayList<>();
        if (finalSum % 2 == 0) {
            long add = 2, sum = 0;
            while (sum + add <= finalSum) {
                list.add(add);
                sum += add;
                add += 2;
            }
            if (sum < finalSum) {
                list.remove(list.size() - 1);
                list.add(finalSum - sum + add);
            }
        }
        return list;
    }

}
