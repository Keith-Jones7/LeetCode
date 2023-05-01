package Exercises.Second_Medium;
//1664 生成平衡数组的方案数
public class ways_to_make_a_fair_array {
    public int wayToMakeFair(int[] nums) {
        int len = nums.length;
        int sum0 = 0, sum1 = 0;
        for (int i = 0; i < len; i += 2) {
            sum0 += nums[i];
        }
        for (int i = 1; i < len; i += 2) {
            sum1 += nums[i];
        }
        int temp0 = 0, temp1 = 0, count = 0;
        for (int i = 0; i < len; i++) {
            if ((i & 1) == 0) {
                sum0 -= nums[i];
                if (temp1 + sum0 == sum1 + temp0) {
                    count++;
                }
                temp0 += nums[i];
            }else {
                sum1 -= nums[i];
                if (temp1 + sum0 == sum1 + temp0) {
                    count++;
                }
                temp1 += nums[i];
            }
        }
        return count;
    }
}
