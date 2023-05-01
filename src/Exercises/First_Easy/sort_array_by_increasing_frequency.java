package Exercises.First_Easy;

import java.util.Arrays;

//1636 按照频率将数组升序排序
public class sort_array_by_increasing_frequency {
    public int[] frequencySort(int[] nums) {
        int[][] count = new int[201][2];
        for(int num : nums) {
            count[100 + num][0]++;
            count[100 + num][1] = num;
        }
        Arrays.sort(count, (x1, x2) -> {
            if(x1[0] == x2[0]) {
                return x1[1] - x2[1];
            }
            return x2[0] - x1[0];
        });
        int index = nums.length - 1;
        for (int[] ints : count) {
            for (int j = 0; j < ints[0]; j++) {
                if(index < 0) {
                    break;
                }
                nums[index--] = ints[1];
            }
        }
        return nums;
    }
}

