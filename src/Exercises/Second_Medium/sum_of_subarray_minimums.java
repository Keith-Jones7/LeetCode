package Exercises.Second_Medium;
//907 子数组的最小值之和
import java.util.*;
public class sum_of_subarray_minimums {
    public int sumSubarrayMins(int[] arr) {
        int MOD = (int) (1e9 + 7), len = arr.length, index = 0, sum = 0;
        int[] stack = new int[len];
        Arrays.fill(stack, -1);
        int[] dp = new int[len];
        dp[0] = arr[0];
        stack[index++] = 0;
        for (int i = 1; i < len; i++) {
            if (arr[i] >= arr[i - 1]) {
                dp[i] = (dp[i - 1] + arr[i]) % MOD;
            }else {
                while (index > 0 && arr[stack[index - 1]] > arr[i]) {
                    index--;
                }
                if (index == 0) {
                    dp[i] = ((i + 1) * arr[i]) % MOD;
                }else {
                    dp[i] = (dp[stack[index - 1]] + arr[i] * (i - stack[index - 1])) % MOD;
                }
            }
            stack[index++] = i;
        }
        for (int num : dp) {
            sum = (sum + num) % MOD;
        }
        return sum;
    }
}
