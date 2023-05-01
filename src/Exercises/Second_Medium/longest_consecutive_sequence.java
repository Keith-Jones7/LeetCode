package Exercises.Second_Medium;

import java.util.*;

//128 最长连续序列
public class longest_consecutive_sequence {
    public int longestConsecutive(int[] nums) {
        int len = nums.length;
        if(len < 2) {
            return len;
        }
        Arrays.sort(nums);
        int count = 1;
        int max = 0;
        for(int i = 1; i < len; i++) {
            if(nums[i] - nums[i - 1] == 1) {
                count++;
                max = Math.max(max, count);
            }else if(nums[i] - nums[i - 1] != 0){
                count = 1;
            }
        }
        return max;
    }
}
