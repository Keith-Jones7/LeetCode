package Exercises.First_Easy;
//908 最小差值
public class smallest_range_1 {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0], min = nums[0];
        for(int num : nums) {
            max = Math.max(num, max);
            min = Math.min(num, min);
        }
        return Math.max(0, max - min - 2 * k);
    }
}
