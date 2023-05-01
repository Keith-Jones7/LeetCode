package Exercises.First_Easy;

import java.util.Arrays;
import java.util.Comparator;

//1337 矩阵中战斗力最弱的K行
public class the_k_weakest_rows_in_a_matrix {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[][] count = new int[mat.length][2];
        for(int i = 0; i < count.length; i++) {
            count[i][0] = i;
            count[i][1] = countOne(mat[i]);
        }
        Arrays.sort(count, Comparator.comparingInt(x -> x[1]));
        int[] ans = new int[k];
        for(int i = 0; i < k; i++) {
            ans[i] = count[i][0];
        }
        return ans;
    }
    public int countOne(int[] arr) {
        int left = 0, right = arr.length - 1, mid;
        if(arr[left] == 0) {
            return left;
        }
        if(arr[right] == 1) {
            return arr.length;
        }
        while (left < right) {
            mid = left + (right - left) / 2;
            if(arr[mid] > 0) {
                left = mid + 1;
            }else {
                right = mid - 1;
            }
        }
        while (left < arr.length && arr[left] == 1) {
            left++;
        }
        return left;
    }
}
