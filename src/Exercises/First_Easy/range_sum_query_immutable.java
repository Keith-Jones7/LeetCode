package Exercises.First_Easy;
//303 区域和检索-数组不可变
public class range_sum_query_immutable {
    int[] sum;
    public range_sum_query_immutable(int[] nums) {
        sum = new int[nums.length + 1];
        for(int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + nums[i - 1];
        }
    }
    public int sumRange(int left, int right) {
        return sum[right + 1] - sum[left];
    }
}
