package Exercises.Second_Medium;
//34 在排序数组中查找元素的第一个位置和最后一个位置
public class find_first_and_last_position_of_element_in_sorted_array {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = new int[2];
        ans[0] = searchBorder(nums, target, true, 0);
        ans[1] = searchBorder(nums, target, false, ans[0]);
        return ans;
    }
    public int searchBorder(int[] nums, int target, boolean leftOrRight, int left) {
        if(left == -1) {
            return -1;
        }
        int right = nums.length - 1, ans = -1, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if(nums[mid] < target) {
                left = mid + 1;
            }else if(nums[mid] > target){
                right = mid - 1;
            }else {
                ans = mid;
                if(leftOrRight) {
                    right = mid - 1;
                }else {
                    left = mid + 1;
                }
            }
        }
        return ans;
    }
}
