package Exercises.First_Easy;

import java.util.*;

//2099 找到和最大的长度为k的子序列
public class find_subsequence_of_length_k_with_the_largest_sum {
    public int[] maxSubsequence(int[] nums, int k){
        int[] max_sub = new int[k];
        int[][] nums_index = new int[nums.length][2];
        for(int i = 0; i < nums.length; i++){
            nums_index[i][0] = nums[i];
            nums_index[i][1] = i;
        }
        Arrays.sort(nums_index, Comparator.comparingInt(a -> a[0]));
        int[][] nums_index2 = new int[k][2];
        for(int i = 0; i < k; i++){
            nums_index2[i][0] = nums_index[nums.length - 1 - i][0];
            nums_index2[i][1] = nums_index[nums.length - 1 - i][1];
        }
        Arrays.sort(nums_index2, Comparator.comparingInt(a -> a[1]));
        for(int i = 0; i < k; i++){
            max_sub[i] = nums_index2[i][0];
        }
        return max_sub;
    }
}
