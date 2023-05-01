package Exercises.Second_Medium;
//334 递增的三元子序列
public class increasing_triplet_subsequence {
    public boolean increasingTriplet(int[] nums){
        if(nums.length < 3){
            return false;
        }
        int min = nums[0];
        int min2 = Integer.MAX_VALUE;
        for(int num : nums){
            if(num <= min){
                min = num;
            }
            else if(num <= min2){
                min2 = num;
            }
            else {
                return true;
            }
        }
        return false;
    }
}
