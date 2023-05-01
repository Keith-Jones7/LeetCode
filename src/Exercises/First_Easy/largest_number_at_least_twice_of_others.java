package Exercises.First_Easy;
//747 至少是其他数字的两倍的最大数
public class largest_number_at_least_twice_of_others {
    public int dominantMax(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        int first_max = -1, max = -1, index = 0, max_index = 0;
        for(int num : nums){
            if(num > max){
                first_max = max;
                max = num;
                max_index = index;
            }
            else if(num > first_max){
                first_max = num;
            }
            index++;
        }
        if(max >= 2 * first_max){
            return max_index;
        }
        else {
            return -1;
        }
    }
}
