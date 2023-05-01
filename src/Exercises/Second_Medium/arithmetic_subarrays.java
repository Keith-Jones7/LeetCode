package Exercises.Second_Medium;
import java.util.*;
//1630 等差子数组
public class arithmetic_subarrays {
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        List<Boolean> ans = new ArrayList<>();
        for(int i = 0; i < l.length; i++) {
            if(r[i] - l[i] <= 1) {
                ans.add(true);
            }else {
                ans.add(isArithmetic(getSubarray(nums, l[i], r[i])));
            }
        }
        return ans;
    }
    public int[] getSubarray(int[] nums, int left, int right) {
        int[] sub = new int[right - left + 1];
        int index = 0;
        while (left + index <= right) {
            sub[index] = nums[left + index];
            index++;
        }
        return sub;
    }
    public boolean isArithmetic(int[] arr) {
        Arrays.sort(arr);
        int interval = arr[1] - arr[0];
        for(int i = 1; i < arr.length; i++) {
            if(arr[i] - arr[i - 1] != interval) {
                return false;
            }
        }
        return true;
    }
}
