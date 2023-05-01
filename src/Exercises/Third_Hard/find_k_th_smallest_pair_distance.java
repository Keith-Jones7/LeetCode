package Exercises.Third_Hard;

import java.util.Arrays;

//719 找出第K小的数对距离
public class find_k_th_smallest_pair_distance {
    public int smallestDistancePair(int[] nums, int k) {
        Arrays.sort(nums);
        int len = nums.length;
        int left = 0, right = nums[len - 1] - nums[0];
        while (left < right) {
            int mid = left + (right - left) / 2;
            if(check(nums, mid, k)) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
    public boolean check(int[] nums, int dist, int k) {
        int left = 0, right = 0, count = 0;
        for(; right < nums.length; right++) {
            while (nums[right] - nums[left] > dist) {
                left++;
            }
            count += right - left;
        }
        return count >= k;
    }
}
