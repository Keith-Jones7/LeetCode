package Exercises.First_Easy;

import java.util.Arrays;

//2335 装满杯子需要的最短总时长
public class minimum_amount_of_time_to_fill_cups {
    public int fillCups(int[] amount) {
        Arrays.sort(amount);
        int a0 = amount[2], a1 = amount[1], a2 = amount[0];
        if (a0 >= a1 + a2) {
            return a0;
        }else {
            return (a0 + a1 + a2 + 1) / 2;
        }
    }
}
