package Exercises.First_Easy;
//53 最大子序和
public class maximum_subarray {
    public int maxSubarray(int[] nums) {
        int local_max = 0;
        int max = Integer.MIN_VALUE;
        for(int num:nums) {
            local_max = Math.max(num, local_max + num);
            max = Math.max(max, local_max);
        }
        return max;
    }
}
