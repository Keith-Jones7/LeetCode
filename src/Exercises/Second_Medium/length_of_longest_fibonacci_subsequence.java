package Exercises.Second_Medium;

import java.util.Arrays;

//873 最长的斐波那契子序列的长度
public class length_of_longest_fibonacci_subsequence {
    public int lenLongestFibSubseq(int[] arr) {
        int max = -1;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int temp1 = arr[i];
                int temp2 = arr[j];
                int sum = temp1 + temp2;
                int cur = 2;
                while (Arrays.binarySearch(arr, sum) >= 0) {
                    int temp = temp2;
                    temp1 = temp2;
                    temp2 = sum;
                    sum = temp1 + temp2;
                    cur++;
                }
                max = Math.max(max, cur);
            }
        }
        return max < 3 ? 0 : max;
    }
}
