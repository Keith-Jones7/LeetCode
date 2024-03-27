package Exercises.Second_Medium;

import java.util.*;
import java.util.Arrays;

//2580 统计将重叠区间合并成组的方案数
public class count_ways_to_group_overlapping_range {
    int MOD = 1_000_000_007;
    public int countWays(int[][] ranges) {
        Arrays.sort(ranges, Comparator.comparingInt(o -> o[0]));
        int cnt = 0;
        int tempRight = -1;
        for (int[] range : ranges) {
            int left = range[0];
            int right = range[1];
            if (left > tempRight) {
                cnt++;
            }
            if (right > tempRight) {
                tempRight = right;
            }
        }
        return quickPow(cnt);
    }

    public int quickPow(int pow) {
        if (pow < 30) {
            return 1 << pow;
        }
        long result = quickPow(pow / 2);
        result *= result;
        if ((pow & 1) == 1) {
            result *= 2;
        }
        return (int)(result % MOD);
    }
}
