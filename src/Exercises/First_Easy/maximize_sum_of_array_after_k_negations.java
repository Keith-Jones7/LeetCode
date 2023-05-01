package Exercises.First_Easy;

import java.util.Arrays;

//1005 K次取反后的最大化的数组和
public class maximize_sum_of_array_after_k_negations {
    public int largestSumAfterKNegations(int[] nums, int k){
        Arrays.sort(nums);
        int sum = 0;
        int min = 101;
        for(int num: nums){
            if(num < 0 && k > 0){
                k--;
                num = -num;
            }
            sum += num;
            min = Math.min(num, min);
        }
        if(k % 2 == 1){
            sum = sum - 2 * min;
        }
        return sum;
    }
}
