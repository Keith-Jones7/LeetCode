package Exercises.First_Easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//1331 数组序号转换
public class rank_transform_of_an_array {
    public int[] arrayRankTransform(int[] arr) {
        int len = arr.length;
        Map<Integer, Integer> map = new HashMap<>();
        int[] arr_copy = Arrays.copyOf(arr, len);
        Arrays.sort(arr);
        int index = 0;
        int cur = Integer.MIN_VALUE;
        for (int num : arr) {
            if (num > cur) {
                index++;
                cur = num;
            }
            map.put(num, index);
        }
        for(int i = 0; i < len; i++) {
            arr_copy[i] = map.get(arr_copy[i]);
        }
        return arr_copy;
    }
}
