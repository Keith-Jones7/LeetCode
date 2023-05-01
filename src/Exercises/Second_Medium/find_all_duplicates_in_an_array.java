package Exercises.Second_Medium;
import java.util.*;
//442 数组中重复的数据
public class find_all_duplicates_in_an_array {
    public List<Integer> findDuplicate(int[] nums) {
        List<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i = 0; i < nums.length; i++) {
            nums[(nums[i] - 1) % n] += n;
        }
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] > (2 * n)) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
