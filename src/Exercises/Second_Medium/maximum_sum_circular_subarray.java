package Exercises.Second_Medium;
//918 环形子数组的最大和
public class maximum_sum_circular_subarray {
    public int maxSubarraySumCircular(int[] nums) {
        int local_max = nums[0];
        int local_min = nums[0];
        int sum = nums[0];
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < nums.length; i++) {
            local_max = Math.max(nums[i], local_max + nums[i]);
            max = Math.max(max, local_max);
            sum += nums[i];
        }
        if(max < 0) {
            return max;
        }
        for(int i = 1; i < nums.length; i++) {
            local_min = Math.min(nums[i], local_min + nums[i]);
            max = Math.max(max, sum - local_min);
        }
        return max;
    }
}
