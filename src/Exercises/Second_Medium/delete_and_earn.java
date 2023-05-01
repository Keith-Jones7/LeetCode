package Exercises.Second_Medium;
//740 删除并获得点数

public class delete_and_earn {
    public int deleteAndEarn(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int nums_max = 0;
        for(int i = 0; i < nums.length; i++) {
            nums_max = Math.max(nums[i], nums_max);
        }
        int[] value = new int[nums_max + 1];
        for(int i = 0; i < nums.length; i++) {
            value[nums[i]] += nums[i];
        }
        int dp_n_2 = value[0];
        int dp_n_1 = Math.max(value[0], value[1]);
        int dp_n = 0;
        for(int i = 2; i < value.length; i++) {
            dp_n = Math.max(dp_n_2 + value[i], dp_n_1);
            dp_n_2 = dp_n_1;
            dp_n_1 = dp_n;
        }
        return dp_n;
    }
}
