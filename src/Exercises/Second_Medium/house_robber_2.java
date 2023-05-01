package Exercises.Second_Medium;
//213 打家劫舍2
//思路：分为两个方案，从1到n-1和从2到n，比较两种方案哪个更大
public class house_robber_2 {
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
        if(nums.length == 3) {
            return Math.max(Math.max(nums[0], nums[1]), nums[2]);
        }
        int dp1_n_2 = nums[0];
        int dp1_n_1 = Math.max(nums[0], nums[1]);
        int dp1_n = 0;
        int dp2_n_2 = nums[1];
        int dp2_n_1 = Math.max(nums[1], nums[2]);
        int dp2_n = 0;
        for(int i = 2; i < nums.length - 1; i++) {
            dp1_n = Math.max(dp1_n_2 + nums[i], dp1_n_1);
            dp1_n_2 = dp1_n_1;
            dp1_n_1 = dp1_n;
            dp2_n = Math.max(dp2_n_2 + nums[i + 1], dp2_n_1);
            dp2_n_2 = dp2_n_1;
            dp2_n_1 = dp2_n;
        }
        return Math.max(dp1_n, dp2_n);
    }
}
