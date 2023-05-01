package Exercises.Second_Medium;

import java.lang.reflect.Array;
import java.util.Arrays;

//1798 你能构造出连续值的最大数目
public class maximum_number_of_consecutive_values_you_can_make {
    public int getMaximumConsecutive(int[] coins) {
        int max = 0;
        Arrays.sort(coins);
        for (int coin : coins) {
            if (coin <= max + 1) {
                max += coin;
            }else {
                break;
            }
        }
        return max + 1;
    }
}
