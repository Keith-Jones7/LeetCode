package Exercises.First_Easy;

import java.util.Arrays;

//2441 与对应负数同时存在的最大正整数
public class largest_positive_integer_that_exists_with_its_negative {
    public int findMaxK(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length, left = 0, right = len - 1;
        while (left < right) {
            int num1 = nums[right];
            int num2 = -nums[left];
            if (num1 == num2) {
                return num1;
            }else if (num1 < num2) {
                left++;
            }else {
                right--;
            }
        }
        return -1;
    }
}
