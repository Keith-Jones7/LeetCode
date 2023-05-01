package Exercises.Second_Medium;

import com.sun.source.tree.BinaryTree;

import java.util.*;

//1814 统计一个数组中好子对的数目
public class count_nice_pairs_in_an_array {
    public int countNicePairs(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] -= revNum(nums[i]);
        }
        int count = 0, MOD = (int)1e9 + 7;
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int val = map.getOrDefault(num, 0);
            count += val;
            count %= MOD;
            map.put(num, val + 1);
        }
        return count;
    }
    public int revNum(int num) {
        int rev = 0;
        while (num > 0) {
            rev = rev * 10 + (num % 10);
            num /= 10;
        }
        return rev;
    }
}
