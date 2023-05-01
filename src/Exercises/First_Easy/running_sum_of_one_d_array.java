package Exercises.First_Easy;
//1480 一维数组的动态和
public class running_sum_of_one_d_array {
    public int[] runningSum(int[] nums) {
        for(int i = 1; i < nums.length; i++) {
            nums[i] += nums[i - 1];
        }
        return nums;
    }
}
