package Exercises.Second_Medium;
//2789 合并后数组中的最大元素
public class largest_element_in_an_array_after_merge_operations {
    public long maxArrayValue(int[] nums) {
        long ans = 0;
        int len = nums.length;
        if (len == 1) {
            return nums[0];
        }
        long temp = nums[len - 1];
        for (int i = len - 2; i >= 0; i--) {
            if (temp >= nums[i]) {
                temp += nums[i];
            }else {
                temp = nums[i];
            }
            ans = Math.max(temp, ans);
        }
        return ans;
    }
}
