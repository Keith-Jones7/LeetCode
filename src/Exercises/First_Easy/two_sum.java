package Exercises.First_Easy;

import java.util.HashMap;

//1 两数之和
public class two_sum {
    public static void main(String[] args) {
        int []nums = {2,7,11,15};
        int target = 9;
        two_sum solution = new two_sum();
        int []result = solution.twoSum2(nums, target);
        System.out.println(result[0] + "+" +result[1]);
    }
    public int[] twoSum(int[] nums, int target){
        int [] result = new int[0];
        for(int i = 0; i< nums.length;i++)
            for(int j = i + 1; j < nums.length; j++){
                if(nums[i] + nums[j] == target) {
                    result = new int[2];
                    result[0] = i;
                    result[1] = j;
                    break;
                }
            }
        return result;
    }
    public int[] twoSum2(int[] nums, int target){
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] result = new int[2];
        for(int i = 0; i < nums.length; i++){
            if(hash.containsKey(target - nums[i])){
                result[0] = i;
                result[1] = hash.get(target - nums[i]);
            }
            hash.put(nums[i], i);
        }
        return result;
    }
}
