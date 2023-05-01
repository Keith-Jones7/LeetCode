package Exercises.First_Easy;

import java.util.*;

//2006 差的绝对值为k的数对数目
public class count_number_of_pairs_with_absolute_difference_k {
    public int countKDifference(int[] nums, int k){
        Map<Integer, Integer> map = new HashMap<>();
        for(int num : nums){
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        int count = 0;
        for(int num : map.keySet()){
            count += (map.get(num) * map.getOrDefault(num + k, 0));
        }
        return count;
    }
}
