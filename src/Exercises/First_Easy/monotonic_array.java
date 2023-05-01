package Exercises.First_Easy;
//696 单调数列
public class monotonic_array {
    public boolean isMonotonic(int[] nums) {
        int len = nums.length;
        if(len == 1) {
            return true;
        }
        int diff = nums[1] - nums[0];
        for(int i = 1; i < nums.length; i++) {
            int temp_diff = (nums[i] - nums[i - 1]);
            if(temp_diff == 0) {
                continue;
            } else if(diff != 0 && ((diff ^ temp_diff) >>> 31) == 1) {
                return false;
            }
            diff = temp_diff;
        }
        return true;
    }
}
