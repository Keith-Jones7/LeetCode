package Exercises.Second_Medium;

import java.util.*;

//面试题 17.05 数字与字母
public class find_longest_subarray_lcci {
    public String[] findLongestSubarray(String[] array) {
        int len = array.length, countDigit = 0, countChar = 0, left = 0, right = 0, maxLen = 0;
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        for (int i = 0; i < len; i++) {
            if (!Character.isDigit(array[i].charAt(0))) {
                countDigit++;
            }else {
                countChar++;
            }
            int diff = countDigit - countChar;
            if (!map.containsKey(diff)) {
                map.put(diff, i);
            }else {
                int index = map.get(diff);
                if (maxLen < (i - index)) {
                    maxLen = i - index;
                    left = index;
                    right = i;
                }
            }
        }
        return Arrays.copyOfRange(array, left + 1, right);
    }
}
