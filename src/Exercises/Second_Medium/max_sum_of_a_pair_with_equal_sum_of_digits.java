package Exercises.Second_Medium;
import java.util.*;
import java.util.HashMap;

//2342 数位和相等数对的最大和
public class max_sum_of_a_pair_with_equal_sum_of_digits {
    public int maximumSum(int[] nums) {
        int[] map = new int[82];
        int max = -1;
        for (int num : nums) {
            int bitSum = getBitSum(num);
            int key = map[bitSum];
            if (key > 0) {
                max = Math.max(max, num + key);
            }
            map[bitSum] = Math.max(map[bitSum], num);
        }
        return max;
    }
    public int getBitSum(int num) {
        int sum = 0;
        while (num > 0) {
            sum += (num % 10);
            num /= 10;
        }
        return sum;
    }
}

