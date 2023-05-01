package Exercises.Second_Medium;
import java.util.*;
//658 找到K个最接近的元素
public class find_k_closest_element {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int index = binarySearch(arr, x);
        List<Integer> list = new ArrayList<>();
        for (int i = index; i < index + k; i++) {
            list.add(i);
        }
        return list;
    }
    public int binarySearch(int[] arr, int target) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (target - arr[mid] > arr[mid + target] - target) {
                left = mid + 1;
            }else {
                right = mid;
            }
        }
        return left;
    }
}
