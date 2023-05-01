package Exercises.First_Easy;

import java.util.*;

//219 存在重复元素
public class contains_duplicate_2 {
    public boolean containsNearbyDuplicate(int[] nums, int k){
        Set<Integer> set = new HashSet<>();
        int len = nums.length;
        for(int i = 0; i < Math.min(len, k + 1); i++){
            int num = nums[i];
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        for(int i = k + 1; i < len ; i++){
            set.remove(nums[i - k]);
            int num = nums[i];
            if(set.contains(num)){
                return true;
            }
            set.add(num);
        }
        return false;
    }

}
