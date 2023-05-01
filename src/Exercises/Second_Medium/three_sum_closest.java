package Exercises.Second_Medium;

import java.util.*;

//16 最接近的三数之和
public class three_sum_closest {
    public int threeSumClosest(int[] nums, int target) {
        int ans = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for(int i = 0; i < nums.length - 2; i++) {
            int temp_sum = nums[i];
            temp_sum += (twoSumClosest(nums, i + 1, target - temp_sum));
            if(Math.abs(temp_sum - target) < Math.abs(ans - target)) {
                ans = temp_sum;
            }
            if((temp_sum > target && nums[i] >= target && nums[i] > 0) || temp_sum == target) {
                break;
            }
        }
        return ans;
    }

    public int twoSumClosest(int[] nums, int start, int target) {
        if(nums[start] >= target && nums[start] > 0) {
            return nums[start] + nums[start + 1];
        }
        int ans = nums[start] + nums[start + 1];
        for(int i = start; i < nums.length - 1; i++) {
            int temp_sum = nums[i];
            temp_sum += (oneClosest(nums, i + 1, target - temp_sum));
            if(Math.abs(temp_sum - target) < Math.abs(ans - target)) {
                ans = temp_sum;
            }
            if((temp_sum > target && nums[i] > target && nums[i] > 0) || temp_sum == target) {
                break;
            }
        }
        return ans;
    }

    public int oneClosest(int[] nums, int start, int target) {
        int left = start, right = nums.length - 1, mid;
        if(nums[left] >= target) {
            return nums[left];
        }
        if(nums[right] <= target) {
            return nums[right];
        }
        while (left < right) {
            mid = left + (right - left) / 2;
            if(nums[mid] == target) {
                return nums[mid];
            }else if(nums[mid] > target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        while (left < nums.length && nums[left] < target) {
            left++;
        }
        if(nums[left] - target > (target - nums[left - 1])) {
            return nums[left - 1];
        }else {
            return nums[left];
        }
    }
}
