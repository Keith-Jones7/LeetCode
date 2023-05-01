package Exercises.First_Easy;

import java.util.Arrays;

//1385 两个数组间的距离值
public class find_the_distance_value_between_two_arrays {
    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int count = 0;
        Arrays.sort(arr2);
        for(int num : arr1) {
            if(getInterval(num, arr2) > d) {
                count++;
            }
        }
        return count;
    }
    public int getInterval(int val, int[] arr) {
        int left = 0, right = arr.length - 1, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if(arr[mid] == val) {
                return 0;
            }else if(arr[mid] < val) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        if(arr[left] - val < 0) {
            if(left == arr.length - 1) {
                return val - arr[left];
            }else {
                return Math.min(val - arr[left], Math.abs(val - arr[left + 1]));
            }
        }else {
            if(left == 0) {
                return arr[left] - val;
            }else {
                return Math.min(arr[left] - val, Math.abs(arr[left - 1] - val));
            }
        }
    }
}
