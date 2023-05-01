package Exercises.Second_Medium;
//153 寻找旋转排序数组中的最小值
public class find_minimum_in_rotated_sorted_array {
    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length - 1);
    }
    public int findMin(int[] nums, int left, int right) {
        if(nums[left] <= nums[right]) {
            return nums[left];
        }
        int mid = left + (right - left) / 2;
        System.out.println(left + "   " + right + "   " + mid);
        if(nums[mid] >= nums[left]) {
            return findMin(nums, mid + 1, right);
        }else {
            return findMin(nums, left, mid);
        }
    }
}
