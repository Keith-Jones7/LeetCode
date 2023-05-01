package Exercises.Second_Medium;
//1218 最长定差子序列

import java.util.*;
public class longest_arithmetic_subsequence_of_given_difference {
    public int longestSubsequence(int[] arr, int difference) {
        int length_ = 0;
        Map<Integer, Integer> dp = new HashMap<Integer, Integer>();
        for(int num:arr) {
            dp.put(num, dp.getOrDefault(num - difference, 0) + 1);
            length_ = Math.max(length_, dp.get(num));
        }
        return length_;
    }
}
