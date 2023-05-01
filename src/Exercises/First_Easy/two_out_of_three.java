package Exercises.First_Easy;
import java.util.*;
//2032 至少在两个数组中出现的值
public class two_out_of_three {
    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {
        int[] count = new int[101];
        List<Integer> list = new ArrayList<>();
        for (int num : nums1) {
            count[num] |= 1;
        }
        for (int num : nums2) {
            count[num] |= 2;
        }
        for (int num : nums3) {
            count[num] |= 4;
        }
        for (int i = 1; i < 101; i++) {
            if (count[i] == 3 || count[i] == 5 || count[i] == 6 || count[i] == 7) {
                list.add(i);
            }
        }
        return list;
    }
}
