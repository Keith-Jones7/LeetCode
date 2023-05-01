package Exercises.Second_Medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

//870 优势排列
public class advantage_shuffle {
    public int[] advantageCount(int[] nums1, int[] nums2) {
        int len = nums1.length;
        Integer[] idx = new Integer[len];
        for (int i = 0; i < len; i++) {
            idx[i] = i;
        }
        Arrays.sort(idx, Comparator.comparingInt(i -> nums2[i]));
        Arrays.sort(nums1);
        int left = 0, right = len - 1;
        for (int num : nums1) {
            if (num > nums2[idx[left]]) {
                nums2[idx[left++]] = num;
            } else {
                nums2[idx[right--]] = num;
            }
        }
        return nums2;
    }
}
