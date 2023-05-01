package Exercises.First_Easy;

import java.util.Arrays;
import java.util.*;

//1460 通过翻转子数组使两个数组相等
public class make_two_arrays_equal_by_reversing_sub_array {
    public boolean canBeEqual(int[] target, int[] arr) {
        int[] count = new int[1001];

        for (int i = 0; i < target.length; i++) {
            count[target[i]]++;
            count[arr[i]]--;
        }
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }
        return true;
    }
}
