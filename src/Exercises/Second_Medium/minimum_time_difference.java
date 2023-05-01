package Exercises.Second_Medium;

import java.util.*;

//539 最小时间差
public class minimum_time_difference {
    public int findMinDifference(List<String> timePoints){
        int len = timePoints.size();
        if(len >= 1440){
            return 0;
        }
        int[] time = new int[len];
        for(int i = 0; i < len; i++){
            time[i] = timeToInt(timePoints.get(i));
        }
        Arrays.sort(time);
        int gap = time[0] + 1440 - time[len - 1];
        for(int i = 1; i < len; i++){
            if(gap == 0){
                return 0;
            }
            gap = Math.min(gap, time[i] - time[i - 1]);
        }
        return gap;
    }
    public int timeToInt(String time){
        char[] chars = time.toCharArray();
        return 600 * chars[0] + 60 * chars[1] + 10 * chars[3] + chars[4];
    }
}
