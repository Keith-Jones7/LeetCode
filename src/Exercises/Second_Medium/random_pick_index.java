package Exercises.Second_Medium;

import java.util.*;

//398 随机数索引
public class random_pick_index {
    int[][] nums_index;
    int len;
    public random_pick_index(int[] nums) {
        len = nums.length;
        nums_index = new int[len][2];
        for(int i = 0; i < len; i++) {
            nums_index[i][0] = nums[i];
            nums_index[i][1] = i;
        }

        Arrays.sort(nums_index, Comparator.comparingInt(x -> x[0]));
    }
    public int pick(int target) {
        int index1 = binarySearch(target);
        int index2 = binarySearch(target + 1);
        System.out.println(index1 + "   "  + index2);
        Random random = new Random();
        return nums_index[random.nextInt(index1, index2)][1];
    }
    public int binarySearch(int target) {
        int left = 0, right = len - 1, mid;
        if(nums_index[left][0] == target) {
            return 0;
        }
        if(nums_index[right][0] < target) {
            return len;
        }
        while (left < right) {
            mid = left + (right - left) / 2;
            if(mid >= target) {
                right = mid - 1;
            }else {
                left = mid + 1;
            }
        }
        while (left >= 0 && nums_index[left][0] >= target) {
            left--;
        }while (left < len && nums_index[left][0] < target) {
            left++;
        }
        return left;
    }
}
