package Exercises.First_Easy;
import java.util.*;
import java.lang.reflect.Array;

//2315 统计星号
public class count_asterisks {
    public int countAsterisks(String s) {
        int count = 0;
        boolean flag = true;
        char[] chars = s.toCharArray();
        for (char ch : chars) {
            if (ch == '|') {
                flag = (!flag);
            }else if (ch == '*' && flag) {
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public long putMarbles(int[] weights, int k) {
        int len = weights.length;
        if (len == 1) {
            return weights[0];
        }
        int left = weights[0], right = weights[len - 1];
        int[] twoSum = new int[len - 1];
        for (int i = 0; i < len - 1; i++) {
            twoSum[i] = weights[i] + weights[i + 1];
        }
        Arrays.sort(twoSum);
        long max = left + right, min = left + right;
        for (int i = 0; i < twoSum.length && i < k - 1; i++) {
            min += twoSum[i];
            max += twoSum[twoSum.length - 1 - i];
        }
        return max - min;
    }
}
