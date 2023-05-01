package Exercises.First_Easy;
//283 移动零
public class move_zeroes {
    public void moveZeroes(int[] nums){
        int count_zeroes = 0;
        for(int num: nums){
            if(num == 0){
                count_zeroes++;
            }
        }
        int index = 0, len = nums.length;
        for(int i = 0; i < len; i++){
            if(nums[i] != 0){
                nums[index++] = nums[i];
            }
        }
        for(int i = len - count_zeroes; i < len; i++){
            nums[i] = 0;
        }
    }
}
