package Exercises.First_Easy;
// 删除有序数组中的重复项
public class remove_duplicates_from_sorted_array {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int pre_num = 0;
        for(int i = 0; i < nums.length; i++) {
            if(i == 0) {
                pre_num = nums[i];
                index++;
            }else {
                if(nums[i] != pre_num) {
                    nums[index++] = nums[i];
                    pre_num = nums[i];
                }
            }
        }
        return index;
    }
}
