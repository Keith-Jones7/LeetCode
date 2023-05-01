package Exercises.First_Easy;

import java.util.Arrays;
import java.util.Comparator;

//435 无重叠区间
public class non_overlapping_intervals {
    public int eraseOverlapIntervals(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
        int count = 0;
        int right = intervals[0][1];
        for (int i = 1; i < intervals.length; i++){
            if (intervals[i][0] < right) {
                count++;
                right = Math.min(intervals[i][1], right);
            } else {
                right = intervals[i][1];
            }
        }
        return count;
    }
}
