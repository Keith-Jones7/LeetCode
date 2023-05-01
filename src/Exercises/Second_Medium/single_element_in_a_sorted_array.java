package Exercises.Second_Medium;
//540 有序数组的单一元素
public class single_element_in_a_sorted_array {
    public int singleNonDuplicate(int[] nums){
        int left = 0;
        int right = nums.length - 1;
        while (left < right){
            int mid = left + (right - left) / 2;
            if(mid % 2 == 1){
                mid--;
            }
            if(nums[mid] == nums[mid + 1]){
                left = mid + 1;
            }
            else{
                right = mid;
            }
        }
        return nums[left];
    }
}
