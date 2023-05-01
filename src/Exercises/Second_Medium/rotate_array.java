package Exercises.Second_Medium;

//189 轮转数组
public class rotate_array {
    public void rotate(int[] nums, int k){
        int n = nums.length;
        k %= n;
        reverse(nums, 0, n - 1);
        reverse(nums, k, n - 1);
        reverse(nums, 0, k - 1);
    }
    public void reverse(int[] nums, int start, int end){
        while (start < end){
            int temp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = temp;
        }
    }
}
