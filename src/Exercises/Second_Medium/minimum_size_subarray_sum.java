package Exercises.Second_Medium;
//209 长度最小的子数组
public class minimum_size_subarray_sum {
    public int minSubArrayLen(int target, int[] nums) {
        int len = nums.length;
        int minLen = nums.length;
        int right = 0, left = 0;
        int sum = 0;
        while (right < len) {
            int val = nums[right];
            if(val >= target) {
                return 1;
            }
            sum += val;
            right++;
            while (sum - nums[left] >= target) {
                sum -= nums[left];
                left++;
            }
            if(sum >= target) {
                minLen = Math.min(right - left, minLen);
            }
        }
        return sum < target ? 0 : minLen;
    }
}
