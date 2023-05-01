package Exercises.First_Easy;

import java.util.Arrays;

//1608 特殊数组的特征值
public class special_array_wth_x_elements_greater_than_or_equal_x {
    public int specialArray(int[] nums) {
        Arrays.sort(nums);
        int special = nums.length;
        if (nums[0] >= special) {
            return special;
        }
        special--;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] >= special && nums[i - 1] < special) {
                break;
            } else {
                special--;
            }
        }
        if (special == 0) {
            return -1;
        }else {
            return special;
        }
    }
}
