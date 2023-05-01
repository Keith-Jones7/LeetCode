package Exercises.Second_Medium;
//396 旋转函数
public class rotate_function {
    public int maxRotateFunction(int[] nums) {
        int len = nums.length;
        int cur = 0;
        int sum = 0;
        for(int i = 0; i < len; i++) {
            cur += (i * nums[i]);
            sum += nums[i];
        }
        int max = cur;
        for(int j = len - 1; j > 0; j--) {
            cur += (sum - len * nums[j]);
            max = Math.max(cur, max);
        }
        return max;
    }
}
