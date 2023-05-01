package Exercises.Second_Medium;

import java.util.Arrays;

//1806 还原排列的最少操作步数
public class minimum_number_of_operations_to_reinitialize_permutation {
    public int reinitializePermutation(int n) {
        int count = 0, index = 1;
        do {
            if (index < n / 2) {
                index *= 2;
            }else {
                index = (2 * index - n + 1);
            }
        }while (index != 1);
        return count;
    }
}
