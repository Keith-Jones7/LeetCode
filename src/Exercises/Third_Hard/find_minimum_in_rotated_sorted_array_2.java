package Exercises.Third_Hard;
//154 寻找旋转排序数组中的最小值2
public class find_minimum_in_rotated_sorted_array_2 {
    public int findMin(int[] nums) {
        return findMin(nums, 0, nums.length - 1);
    }

    public int findMin(int[] nums, int start, int end) {
        if(nums[start] < nums[end] || start == end) {
            return nums[start];
        }
        int mid = start + (end - start) / 2;
        System.out.println(nums[mid]);
        if(nums[mid] < nums[start]) {
            return findMin(nums, start, mid);
        }else if(nums[mid] > nums[start]){
            return findMin(nums, mid + 1, end);
        }else {
            return Math.min(findMin(nums, start, mid), findMin(nums, mid + 1, end));
        }
    }
}
