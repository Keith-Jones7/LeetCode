package Exercises.Second_Medium;
//713 乘积小于k的子数组
public class subarray_product_less_than_k {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int len = nums.length;
        int index = 0, sum = 0, product = 1;
        for(int i = 0; i < len; i++) {
            if(nums[i] >= k) {
                index = -1;
                product = 1;
            }else {
                if(index == -1) {
                    index = i;
                    product = nums[i];
                    sum += 1;
                }else {
                    product *= (nums[i]);
                    while (product >= k) {
                        product /= (nums[index++]);
                    }
                    sum += (i - index + 1);
                }
            }
        }
        return sum;
    }
}
