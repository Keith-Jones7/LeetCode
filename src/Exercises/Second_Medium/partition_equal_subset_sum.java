package Exercises.Second_Medium;
//416 等分割子集
public class partition_equal_subset_sum {
    public boolean canPartition(int[] nums) {
        int sum = 0;
        int maxNum = 0;
        for (int num : nums) {
            sum += num;
            maxNum = Math.max(maxNum, num);
        }
        if ((sum & 1) == 1) {
            return false;
        }
        int W = sum / 2;
        if (maxNum > W) {
            return false;
        }
        if (maxNum == W) {
            return true;
        }
        int[] dp = new int[W + 1];
        dp[0] = 0;
        for (int num : nums) {
            for (int i = W; i >= num; i--) {
                dp[i] = Math.max(dp[i], dp[i - num] + num);
            }
        }
        return dp[W] == W;
    }
}
