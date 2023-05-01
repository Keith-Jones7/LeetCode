package Exercises.First_Easy;
//485 最大连续1的个数
public class max_consecutive_ones {
    //滑动窗口
    public int findMaxConsecutiveOnes(int[] nums) {
        int left = 0;
        int right = 0;
        int max = 0;
        while (right < nums.length) {
            if(nums[right] == 1) {
                right++;
            }
            else {
                while (right < nums.length && nums[right] != 1) {
                    right++;
                }
                left = right;
            }
            max = Math.max(max, right - left);
        }
        return max;
    }
    //普通计数
    public int findMaxConsecutiveOnes2(int[] nums) {
        int count = 0;
        int max = 0;
        for(int num : nums) {
            if(num == 1) {
                count++;
            }else {
                max = Math.max(max, count);
                count = 0;
            }
        }
        return Math.max(max, count);
    }
    public static void main(String[] args) {
        max_consecutive_ones test = new max_consecutive_ones();
        int[] nums = {1,0,1,1,0,1};
        int max = test.findMaxConsecutiveOnes2(nums);
    }
}
