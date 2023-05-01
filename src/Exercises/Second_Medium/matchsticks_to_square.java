package Exercises.Second_Medium;

import java.util.Arrays;

//473 火柴拼正方形
public class matchsticks_to_square {
    public boolean makeSquare(int[] matchsticks) {
        if(matchsticks.length < 4) {
            return false;
        }
        int sum = 0, len = matchsticks.length;
        for(int matchstick : matchsticks) {
            sum += matchstick;
        }
        if(sum % 4 != 0) {
            return false;
        }
        Arrays.sort(matchsticks);
        return allocate(matchsticks, len - 1, new int[4], sum / 4);
    }
    public boolean allocate(int[] nums, int pos, int[] sums, int avg)  {
        if(pos == -1) {
            return sums[0] == avg && sums[1] == avg && sums[2] == avg;
        }
        for(int i = 0; i < 4; i++) {
            if(sums[i] + nums[pos] > avg) {
                continue;
            }
            sums[i] += nums[pos];
            if(allocate(nums, pos - 1, sums, avg)) {
                return true;
            }
            sums[i] -= nums[pos];
        }
        return false;
    }
}
