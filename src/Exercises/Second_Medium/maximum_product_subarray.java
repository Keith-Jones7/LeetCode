package Exercises.Second_Medium;
//152 乘积最大子数组
public class maximum_product_subarray {
    public int maxProduct(int[] nums){
        int max = nums[0];
        int local_max = nums[0];
        int local_min = nums[0];
        if(nums.length == 1){
            return max;
        }
        for(int i = 1; i < nums.length; i++){
            if(nums[i] < 0){
                int temp = local_max;
                local_max = local_min;
                local_min = temp;
            }
            local_max = Math.max(nums[i], local_max * nums[i]);
            local_min = Math.min(nums[i], local_min * nums[i]);
            max = Math.max(max, local_max);
        }
        return max;
    }
}
