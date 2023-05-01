package Exercises.First_Easy;
//1752 检查数组是否经排序和轮转得到
public class check_if_array_is_sorted_and_rotated {
    public boolean check(int[] nums) {
        int count = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[(i + 1) % len] < nums[i]) {
                count++;
            }
        }
        return count < 2;
    }
}
