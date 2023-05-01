package Exercises.Second_Medium;

import java.util.Arrays;

//324 摆动排序2
public class wiggle_sorted_2 {
    public void wiggleSort(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        int index = copy.length - 1;
        for(int i = 1; i < nums.length; i += 2) {
            nums[i] = copy[index--];
        }
        for(int i = 0; i < nums.length; i += 2) {
            nums[i] = copy[index--];
        }
    }
}
