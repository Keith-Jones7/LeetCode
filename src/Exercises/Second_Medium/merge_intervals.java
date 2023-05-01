package Exercises.Second_Medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//56 合并区间
public class merge_intervals {
    public int[][] merge(int[][] intervals){
        Arrays.sort(intervals, Comparator.comparingInt(x -> x[0]));
        List<int[]> list = new ArrayList<>();
        int left = Integer.MAX_VALUE, index = -1;
        int right = -1;
        for (int[] interval : intervals) {
            if (interval[0] <= right) {
                right = Math.max(right, interval[1]);
                list.set(index, new int[]{left, right});
            }
            if (interval[0] > right) {
                left = interval[0];
                right = interval[1];
                list.add(new int[]{left, right});
                index++;
            }
        }
        int[][] ans = new int[list.size()][2];
        for(int i = 0; i < ans.length; i++){
            ans[i] = list.get(i);
        }
        return ans;
    }
}
