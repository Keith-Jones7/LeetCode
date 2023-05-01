package Exercises.First_Easy;

import java.util.*;

//594 最长和谐子序列
public class longest_harmonious_subsequence {
    public static int findLHS(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num:nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int max = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            int key = entry.getKey();
            int value = entry.getValue();
            max = Math.max(max, value + map.getOrDefault(key + 1, -value));
        }
        return max;
    }

    public static void main(String[] args) {
        int[] nums = {1,3,5,7,9,11,13,15,17};
        findLHS(nums);
    }
}
