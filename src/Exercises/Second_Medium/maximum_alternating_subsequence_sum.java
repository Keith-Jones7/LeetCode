package Exercises.Second_Medium;
//1911 最大子序列交替和
public class maximum_alternating_subsequence_sum {
    public long maxAlternatingSum(int[] nums) {
        int len = nums.length;
        long dp0 = nums[0], dp1 = 0;
        for (int i = 1; i < len; i++) {
            dp0 = Math.max(dp1 + nums[i], dp0);
            dp1 = Math.max(dp0 - nums[i], dp1);
        }
        return dp0;
    }
}
