package Exercises.Second_Medium;

//1567 乘积为正数的最长子数组长度
public class maximum_length_of_subarray_with_positive_product {
    public int getMaxlen(int[] nums){
        if(nums.length == 1){
            return nums[0] > 0 ? 1 : 0;
        }
        int max_positive = 0;
        int max_negative = 0;
        int max_len = 0;
        for(int num: nums){
            if(num == 0){
                max_positive = 0;
                max_negative = 0;
            }
            if(num > 0){
                max_positive++;
                max_negative = (max_negative == 0) ? 0 : max_negative + 1;
            }
            if(num < 0){
                int temp = max_positive;
                max_positive = (max_negative == 0) ? 0 : max_negative + 1;
                max_negative = temp + 1;

            }
            max_len = Math.max(max_len, max_positive);
        }
        return max_len;
    }
}
