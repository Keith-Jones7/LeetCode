package Exercises.Second_Medium;
//198 打家劫舍
public class house_robber {
    public int rob(int[] nums) {
        if(nums.length == 0) {
            return 0;
        }
        if(nums.length == 1) {
            return nums[0];
        }
        if(nums.length == 2) {
            return Math.max(nums[0], nums[1]);
        }
        int dp_n_2 = nums[0];
        int dp_n_1 = Math.max(nums[0], nums[1]);
        int dp_n = 0;
        for(int i = 2; i < nums.length; i++) {
            dp_n = Math.max(dp_n_2 + nums[i], dp_n_1);
            dp_n_2 = dp_n_1;
            dp_n_1 = dp_n;
        }
        return dp_n;
    }
}
