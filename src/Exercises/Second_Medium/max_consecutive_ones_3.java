package Exercises.Second_Medium;
//1004 最大连续1的个数3
public class max_consecutive_ones_3 {
    public int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, count = 0, max = 0;
        while (right < nums.length) {
            if(nums[right] == 0) {
                count++;
            }
            right++;
            while (count > k) {
                if(nums[left++] == 0) {
                    count--;
                }
            }
            max = Math.max(max, right - left - 1);
        }
        return max;
    }
}
