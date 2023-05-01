package Exercises.First_Easy;
//217 存在重复元素
import java.util.*;
public class contains_duplicate {
    public boolean containsDuplicate(int[] nums){
        Set<Integer> nums_set = new HashSet<>();
        for(int num:nums){
            nums_set.add(num);
        }
        return !(nums.length == nums_set.size());
    }
}
