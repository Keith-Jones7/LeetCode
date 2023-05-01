package Exercises.First_Easy;
//2016 增量元素之间的最大差值
public class maximum_difference_between_increasing_elements {
    public int maximumDifference(int[] nums){
        int local_min = nums[0];
        int max = -1 ;
        for(int i = 1; i < nums.length; i++) {
            max = Math.max(nums[i] - local_min, max);
            local_min = Math.min(nums[i], local_min);
        }
        return max == 0 ? -1 : max;
    }
}
