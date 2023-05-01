package Exercises.First_Easy;
//1995 统计特殊四元组
public class count_special_quadruplets {
    public int countQuadruplets(int[] nums){
        int count = 0;
        for(int i = 0; i < nums.length; i++){
            for(int j = i + 1; j < nums.length; j++){
                for(int k = j + 1; k < nums.length; k++){
                    for(int z = k + 1; z < nums.length; z++){
                        if(nums[i] + nums[j] + nums[k] == nums[z]){
                            count++;
                        }
                    }
                }
            }
        }
        return count;
    }
}
