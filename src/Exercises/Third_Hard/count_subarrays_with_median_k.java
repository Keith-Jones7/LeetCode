package Exercises.Third_Hard;

import java.util.*;

//2488 统计中位数为K的子数组
public class count_subarrays_with_median_k {
    public int countSubarrays(int[] nums, int k) {
        int n = nums.length, index = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int pre_sum = 0;
        while (nums[index] != k) {
            if (nums[index] < k) {
                nums[index] = -1;
            }else {
                nums[index] = 1;
            }
            pre_sum += nums[index++];
            int count = map.getOrDefault(pre_sum, 0);
            map.put(pre_sum, count + 1);

        }
        int ans = 0;
        for (int i = index; i < n; i++) {
            if (nums[i] < k) {
                nums[i] = -1;
            }else if (nums[i] == k) {
                nums[i] = 0;
            }else {
                nums[i] = 1;
            }
            pre_sum += nums[i];
            int count1 = map.getOrDefault(pre_sum, 0);
            int count2 = map.getOrDefault(pre_sum - 1, 0);
            ans += (count1 + count2);
        }
        return ans;
    }
}
