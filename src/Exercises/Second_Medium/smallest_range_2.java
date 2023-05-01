package Exercises.Second_Medium;

import java.util.Arrays;

//910 最小差值2
public class smallest_range_2 {
    public int smallestRange2(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        int ans = nums[len - 1] - nums[0];
        for(int i = 1; i < len; i++) {
            int min = Math.min(nums[0] + k, nums[i] - k);
            int max = Math.max(nums[len - 1] - k, nums[i - 1] + k);
            ans = Math.min(max - min, ans);
        }
        return ans;
    }
}
