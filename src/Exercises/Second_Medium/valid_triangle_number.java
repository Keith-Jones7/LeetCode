package Exercises.Second_Medium;

import java.util.Arrays;

//611 有效三角形的个数
public class valid_triangle_number {
    public int triangleNumber(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        int len = nums.length;
        for(int i = 0; i < len - 2; i++) {
            if(i == 0) {
                continue;
            }
            int x1 = nums[i];
            for(int j = i + 1; j < len - 1; j++) {

            }
        }
        return count;
    }
}
