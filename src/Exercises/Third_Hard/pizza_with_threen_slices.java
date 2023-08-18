package Exercises.Third_Hard;
//1388 3n块披萨
public class pizza_with_threen_slices {
    public int maxSizeSlices(int[] slices) {
        int n = slices.length;
        int k = n / 3;
        return Math.max(getMaxSum(slices, 0, n - 2, k),
                getMaxSum(slices, 1, n - 1, k));
    }

    public int getMaxSum(int[] nums, int start, int end, int k) {
        int[][] dp = new int[end - start + 2][k + 1];
        for (int i = 1; i <= end - start + 1; i++) {
            for (int j = 1; j <= k; j++) {
                if (i == 1) {
                    dp[i][j] = nums[start];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 2][j - 1] + nums[start + i - 1]);
                }
            }
        }
        return dp[end - start + 1][k];
    }
}
