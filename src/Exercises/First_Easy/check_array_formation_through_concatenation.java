package Exercises.First_Easy;

import java.util.*;

//1640 能否连接形成数组
public class check_array_formation_through_concatenation {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }
        int count = 0;
        for (int[] piece : pieces) {
            int[] index = new int[piece.length];
            for (int i = 0; i < piece.length; i++) {
                index[i] = map.getOrDefault(piece[i], -2);
                if ((index[i] == -2) || (i > 0 && (index[i] - index[i - 1] != 1))) {
                    return false;
                }
            }
            count += piece.length;
        }
        return count == arr.length;
    }
}
