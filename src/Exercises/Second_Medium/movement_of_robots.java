package Exercises.Second_Medium;

import java.util.Arrays;

//2731 移动机器人
public class movement_of_robots {
    public int sumDistance(int[] nums, String s, int d) {
        int len = nums.length;
        long[] preSums = new long[len];
        for (int i = 0; i < len; i++) {
            if (s.charAt(i) == 'L') {
                preSums[i] = nums[i] - d;
            }else {
                preSums[i] = nums[i] + d;
            }
        }
        Arrays.sort(preSums);
        long MOD = (long)(1e9 + 7), ans = 0, sum = 0;
        for (int i = 1; i < len; i++) {
            sum += (long) i * (preSums[i] - preSums[i - 1]) % MOD;
            ans += sum;
            ans %= MOD;
        }
        return (int)ans;
    }
}
