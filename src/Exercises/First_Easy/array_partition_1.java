package Exercises.First_Easy;

import java.util.Arrays;

//561 数组拆分
public class array_partition_1 {
    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i = i + 2) {
            sum += nums[i];
        }
        return sum;
    }
}
