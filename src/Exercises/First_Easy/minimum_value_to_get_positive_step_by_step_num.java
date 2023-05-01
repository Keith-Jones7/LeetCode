package Exercises.First_Easy;
//1413 逐步求和得到正数的最小值
public class minimum_value_to_get_positive_step_by_step_num {
    public int minStartValue(int[] nums) {
        int[] pre_sum = new int[nums.length];
        pre_sum[0] = nums[0];
        int min = pre_sum[0];
        for (int i = 1; i < nums.length; i++) {
            pre_sum[i] = pre_sum[i - 1] + nums[i];
            min = Math.min(min, pre_sum[i]);
            System.out.println(min);
        }
        return Math.max(1, 1 - min);
    }
}
