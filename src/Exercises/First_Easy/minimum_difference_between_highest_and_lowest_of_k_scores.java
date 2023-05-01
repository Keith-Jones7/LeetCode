package Exercises.First_Easy;

import java.util.Arrays;

//1984 学生分数的最小差值
public class minimum_difference_between_highest_and_lowest_of_k_scores {
    public int minimumDifference(int[] nums, int k){
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0;
        int right = Math.min(k, len);
        int gap = nums[right - 1] - nums[left];
        while (right < len){
            right++;
            left++;
            gap = Math.min(gap, nums[right - 1] - nums[left]);
        }
        return gap;
    }
}
