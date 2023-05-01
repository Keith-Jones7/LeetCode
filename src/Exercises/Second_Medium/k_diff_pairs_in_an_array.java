package Exercises.Second_Medium;
import java.util.*;
//532 数组中的k-diff数对
public class k_diff_pairs_in_an_array {
    public int findPairs(int[] nums, int k) {
        Arrays.sort(nums);
        if(k == 0) {
            return countSame(nums);
        }
        HashSet<Integer> set = new HashSet<>();
        int count = 0;
        for(int i = 0; i < nums.length; i++) {
            if(set.contains(nums[i])) {
                continue;
            }
            set.add(nums[i]);
            int left = 0, right = i, target = nums[i] - k;
            boolean flag = false;
            while (left < right) {
                int mid = left + (right - left) / 2;
                if(nums[mid] == target) {
                    flag = true;
                    break;
                }else if(nums[mid] < target) {
                    left = mid + 1;
                }else {
                    right = mid - 1;
                }
            }
            if(flag || nums[left] == target) {
                count++;
            }
        }
        return count;
    }
    public int countSame(int[] nums) {
        int count = 0, index = 0, cur;
        while (index < nums.length) {
            cur = nums[index];
            index++;
            boolean flag = false;
            while (index < nums.length && nums[index] == cur) {
                index++;
                flag = true;
            }
            if(flag) {
                count++;
            }
        }
        return count;
    }
}
