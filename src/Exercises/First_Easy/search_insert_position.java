package Exercises.First_Easy;
//35 搜索插入位置
public class search_insert_position {
    public int searchInsert(int[] nums, int target){
        int right = nums.length;
        if(nums[0] > target){
            return 0;
        }
        if(nums[right - 1] < target){
            return right;
        }
        int left = 0;
        while (left < right){
            int mid = (left + right)/2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] < target){
                left = mid + 1;
            }
            else {
                right = mid;
            }
        }
        if(nums[right] < target){
            return right;
        }
        else {
            return right + 1;
        }
    }
}
