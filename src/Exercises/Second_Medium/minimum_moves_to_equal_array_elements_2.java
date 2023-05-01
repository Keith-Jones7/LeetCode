package Exercises.Second_Medium;

import java.util.Arrays;

//462 最少移动次数使数组元素相等2
public class minimum_moves_to_equal_array_elements_2 {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        int mid = nums[nums.length / 2];
        int ans = 0;
        for(int num : nums) {
            ans += Math.abs(ans - mid);
        }
        return ans;
    }
}
