package Exercises.Second_Medium;
import java.util.*;
//215 数组中的第K个最大元素
public class kth_largest_element_in_an_array {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length - k];
    }
}
