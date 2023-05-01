package Exercises.First_Easy;

import java.util.Arrays;

//1608 特殊数组的特征值
public class special_array_with_x_elements_greater_than_or_equal_x {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        for(int i = 0; i <= nums.length; i++) {
            if(i == binarySearch(nums, i)) {
                return i;
            }
        }
        return -1;
    }
    public int binarySearch(int[] nums, int target) {
        if(nums[0] > target) {
            return nums.length;
        }
        int left = 0, right = nums.length - 1, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if(nums[mid] >= target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        while (left >= 0 && nums[left] >= target) {
            left--;
        }
        return nums.length - 1 - left;
    }
}
