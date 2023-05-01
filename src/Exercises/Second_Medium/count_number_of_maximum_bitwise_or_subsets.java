package Exercises.Second_Medium;

//2044 统计按位或能得到的最大值的子集数目
public class count_number_of_maximum_bitwise_or_subsets {
    public int countMaxOrSubsets(int[] nums) {
        int count = 0, maxOr = 0;
        for(int i = 0; i < 1 << nums.length; i++) {
            int tempOr = 0;
            for(int j = 0; j < nums.length; j++) {
                if(((i >> j) & 1) == 1) {
                    tempOr |= nums[j];
                }
            }
            if(tempOr > maxOr) {
                maxOr = tempOr;
                count = 1;
            }
            else if(tempOr == maxOr){
                count++;
            }
        }
        return count;
    }

}
