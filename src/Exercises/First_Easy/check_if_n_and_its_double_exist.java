package Exercises.First_Easy;

import java.util.Arrays;

//1346 检查整数及其两倍数是否存在
public class check_if_n_and_its_double_exist {
    public boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            if (binarySearch(arr, arr[i] * 2, i)) {
                return true;
            }
        }
        return false;
    }
    public boolean binarySearch(int[] arr, int target, int index) {
        int left = 0, right = arr.length - 1, mid;
        while (left < right) {
            mid = left + (right - left) / 2;
            if(arr[mid] == target && mid != index) {
                return true;
            }else if(arr[mid] < target) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        return arr[left] == target;
    }
}
