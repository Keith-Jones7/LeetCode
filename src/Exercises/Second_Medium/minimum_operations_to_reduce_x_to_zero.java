package Exercises.Second_Medium;
//1658 将x减到0的最小操作数
public class minimum_operations_to_reduce_x_to_zero {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        sum -= x;
        if (sum < 0) {
            return -1;
        }
        if (sum == 0) {
            return nums.length;
        }
        int left = 0, right = 0, cur_sum = 0, max_gap = -(nums.length + 1);
        while (right < nums.length) {
            cur_sum += nums[right++];
            while (cur_sum > sum && left < nums.length) {
                cur_sum -= nums[left++];
            }
            if (cur_sum == sum) {
                max_gap = Math.max(right - left, max_gap);
            }
        }
        return nums.length - Math.abs(max_gap);
    }

}
