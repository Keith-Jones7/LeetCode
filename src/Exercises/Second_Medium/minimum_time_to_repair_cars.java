package Exercises.Second_Medium;

import java.util.Comparator;
import java.util.PriorityQueue;

//2594 修车的最少时间
public class minimum_time_to_repair_cars {
    public long repairCars(int[] ranks, int cars) {
        long left = 0, right = (long) cars * cars * 100L;
        while (left < right) {
            long mid = left + (right - left) / 2;
            long sum = 0;
            for (int rank : ranks) {
                sum += Math.sqrt((double) mid / rank);
            }
            if (sum < cars) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}
