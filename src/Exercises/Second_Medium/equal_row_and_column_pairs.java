package Exercises.Second_Medium;

import java.util.*;

// 2352 相等行列对
public class equal_row_and_column_pairs {
    public int equalPairs(int[][] grid) {
        Map<Long, Integer> map = new HashMap<>();
        int n = grid.length, cnt = 0;
        for (int[] ints : grid) {
            long val = 0;
            for (int j = 0; j < n; j++) {
                val += (val * 10 + ints[j]);
            }
            map.put(val, map.getOrDefault(val, 0) + 1);
        }
        for (int i = 0; i < n; i++) {
            long val = 0;
            for (int[] ints : grid) {
                val += (val * 10 + ints[i]);
            }
            cnt += map.getOrDefault(val, 0);
        }
        return cnt;
    }


}
