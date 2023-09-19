package Exercises.Second_Medium;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.TreeSet;

//2560 打家劫舍4
public class house_robber_4 {
    public int minCapability(int[] nums, int k) {
        int max = -1, min = Integer.MAX_VALUE;
        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        int left = min, right = max;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (!count(nums, k, mid)) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }

    public boolean count(int[] nums, int k, int bound) {
        boolean flag = false;
        int count = 0;
        for (int num : nums) {
            if (num <= bound && !flag) {
                count++;
                flag = true;
            }else {
                flag = false;
            }
        }
        System.out.println(bound + " " + count);
        return count >= k;
    }
}
