package Exercises.Second_Medium;

import java.util.HashMap;

//560 和为k的子数组
public class subarray_sum_equals_k {
    public int subarraySum(int[] nums, int k){
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        int sum = 0;
        map.put(0, 1);
        for (int num : nums) {
            sum += num;
            System.out.println(sum);
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
