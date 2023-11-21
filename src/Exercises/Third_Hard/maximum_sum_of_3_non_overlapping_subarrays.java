package Exercises.Third_Hard;
//689 三个无重叠子数组的最大和
public class maximum_sum_of_3_non_overlapping_subarrays {
    public int[] maxSumOfThreeSubarrays(int[] nums, int k){
        int len = nums.length;
        int[] sum = new int[len - k + 1];
        int left = 0, right = 0, s = 0;
        while (right < k) {
            s += nums[right++];
        }
        sum[left] = s;
        while (right < len) {
            s += nums[right++];
            s -= nums[left++];
            sum[left] = s;
        }
        int len2 = sum.length - 2 * k;
        int[] dp1 = new int[len2];
        int[][] dp2 = new int[len2][2];
        dp1[0] = 0;
        for (int i = 1; i < len2; i++) {
            int index = dp1[i - 1];
            if (sum[i] > sum[index]) {
                dp1[i] = i;
            }else {
                dp1[i] = index;
            }
        }
        dp2[0][0] = dp1[0];
        dp2[0][1] = k;
        for (int i = 1; i < len2; i++) {
            int index1 = dp2[i - 1][0];
            int index2 = dp2[i - 1][1];
            if (sum[i + k] + sum[dp1[i]] > sum[index1] + sum[index2]) {
                dp2[i][0] = dp1[i];
                dp2[i][1] = i + k;
            }else {
                dp2[i][0] = index1;
                dp2[i][1] = index2;
            }
        }
        int idx1 = 0, idx2 = k, idx3 = 2 * k;
        int max = sum[idx1] + sum[idx2] + sum[idx3];
        for (int i = 1; i < len2; i++) {
            if (sum[i + 2 * k] + sum[dp2[i][0]] + sum[dp2[i][1]] > max) {
                idx1 = dp2[i][0];
                idx2 = dp2[i][1];
                idx3 = i;
                max = sum[i + 2 * k] + sum[dp2[i][0]] + sum[dp2[i][1]];
            }
        }
        return new int[]{idx1, idx2, idx3};
    }
}
