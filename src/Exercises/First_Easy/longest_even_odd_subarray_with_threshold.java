package Exercises.First_Easy;
//2760 最长奇偶子数组
public class longest_even_odd_subarray_with_threshold {
    public int longestAlternatingSubarray(int[] nums, int threshold) {
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            if (nums[i] <= threshold) {
                nums[i] = nums[i] % 2;
            }else {
                nums[i] = -1;
            }
        }
        int max = -1;
        for (int i = 0; i < len; i++) {
            if (nums[i] == 0) {
                int cnt = 0, cur = 0;
                while (i < len) {
                    if (nums[i] != cur) {
                        i--;
                        break;
                    }
                    cur = 1 - cur;
                    cnt++;
                    i++;
                }
                max = Math.max(max, cnt);
            }
        }
        return max;
    }
}
