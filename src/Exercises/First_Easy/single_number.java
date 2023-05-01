package Exercises.First_Easy;
//136 只出现一次的数字
public class single_number {
    public int singleNumber(int[] nums){
        int n = 0;
        for(int num : nums){
            n ^= num;
        }
        return n;
    }
}
