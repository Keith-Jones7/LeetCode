package Exercises.Second_Medium;
//795 区间子数组个数
public class number_of_subarrays_with_bounded_maximum {
    public int numSubarrayBoundedMax(int[] nums, int left, int right) {
        int ans = 0;
        int j = -1;
        for (int i = 0; i < nums.length; i++) {
            int temp = 0;
            if (nums[i] > right) {
                j = i;
            }
            if (nums[i] >= left) {
                temp = i - j;
            }
            ans += temp;
        }
        return ans;
    }
}
