package Exercises.First_Easy;
//724 寻找数组的中心下标
public class find_pivot_index {
    public int pivotIndex(int[] nums) {
        int len = nums.length;
        int sum = 0, pre_sum = 0;
        for(int num : nums) {
            sum += num;
        }
        for(int i = 0; i < len; i++) {
            int right = sum - pre_sum - nums[i];
            if(pre_sum == right) {
                return i;
            }
            pre_sum += nums[i];
        }
        return -1;
    }
}
