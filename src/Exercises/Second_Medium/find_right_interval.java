package Exercises.Second_Medium;

import java.util.Arrays;
import java.util.Comparator;

//436 寻找右区间
public class find_right_interval {
    public int[] findRightInterval(int[][] intervals) {
        int len = intervals.length;
        int[] ans = new int[len];
        int[][] interval = new int[len][3];
        for(int i = 0; i < len; i++) {
            interval[i][0] = intervals[i][0];
            interval[i][1] = intervals[i][1];
            interval[i][2] = i;
        }
        Arrays.sort(interval, Comparator.comparingInt(x -> x[0]));
        for(int i = 0; i < len; i++) {
            ans[i] = binarySearch(interval, intervals[i][1]);
        }
        return ans;
    }
    public int binarySearch(int[][] interval, int target) {
        int left = 0, right = interval.length - 1, mid = 0;
        if(interval[left][0] >= target) {
            return interval[left][2];
        }
        if(interval[right][0] < target) {
            return -1;
        }
        while (left < right) {
            mid = left + (right - left) / 2;
            if (interval[mid][0] < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        while (left < interval.length && interval[left][0] < target) {
            left++;
        }
        return interval[left][2];
    }
}
