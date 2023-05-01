package Exercises.Third_Hard;

import java.util.Arrays;
import java.util.Comparator;

//1326 灌溉花园的最少水龙头数目
public class minimum_number_of_taps_to_open_to_water_a_garden {
    public int minTaps(int n, int[] ranges) {
        int[][] intervals = new int[n + 1][2];
        for (int i = 0; i <= n; i++) {
            intervals[i][0] = i - ranges[i];
            intervals[i][1] = i + ranges[i];
        }
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));

        int right = 0, index = 0;
        int ans = 0;
        while (right < n) {
            int flag = -1;
            while (index <= n && intervals[index][0] <= right) {
                flag = Math.max(flag, intervals[index][1]);
                index++;
            }
            if (flag == -1) {
                return -1;
            }
            ans++;
            right = flag;
        }
        return ans;
    }
}
