package Exercises.Second_Medium;
//775 全局倒置与局部倒置
public class global_and_local_inversions {
    public boolean isIdealPermutation(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int interval = nums[i] - i;
            if (interval < -1 || interval > 1) {
                return false;
            }
        }
        return true;
    }
}
