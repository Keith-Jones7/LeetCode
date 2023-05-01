package Exercises.First_Easy;

import java.util.ArrayList;
import java.util.List;

//448 找到所有数组中消失的数字
public class find_all_numbers_disappeared_in_an_array {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] isExist = new boolean[nums.length];
        for (int num : nums) {
            isExist[num - 1] = true;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i <= nums.length; i++) {
            if(!isExist[i - 1]) {
                list.add(i);
            }
        }
        return list;
    }
    public List<Integer> findDisappearedNumbers2(int[] nums) {
        int len = nums.length;
        List<Integer> list = new ArrayList<>();
        for(int num : nums) {
            nums[Math.abs(num )- 1]= -Math.abs(nums[Math.abs(num )- 1]);
        }
        for(int i = 0; i < len; i++) {
            if(nums[i] > 0) {
                list.add(i + 1);
            }
        }
        return list;
    }
    public List<Integer> findDisappearedNumbers3(int[] nums) {
        int len = nums.length;
        for(int num : nums) {
            nums[(num - 1) % len] += len;
        }
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < len) {
                list.add(i + 1);
            }
        }
        return list;
    }
}
