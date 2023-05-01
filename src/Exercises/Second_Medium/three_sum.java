package Exercises.Second_Medium;
import java.util.*;
//15 三数之和
public class three_sum {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> ans = new ArrayList<>();
        int len = nums.length;
        if(len < 3){
            return ans;
        }
        Arrays.sort(nums);
        for(int i = 0; i < len - 2; i++){
            if (nums[i] > 0) {
                return ans;
            }
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int target = (-nums[i]);
            int left = i + 1, right = len - 1;
            while (left < right){
                int num_left = nums[left], num_right = nums[right];
                if(num_left + num_right < target){
                    left++;
                }
                else if(num_left + num_right > target){
                    right--;
                }
                else {
                    List<Integer> list = new ArrayList<>();
                    int size = ans.size();
                    if(size == 0){
                        list.add(nums[i]);
                        list.add(num_left);
                        list.add(num_right);
                        ans.add(list);
                    }
                    else {
                        List<Integer> pre_list = ans.get(size - 1);
                        if(pre_list.get(1) != num_left && pre_list.get(2) != num_right){
                            list.add(nums[i]);
                            list.add(num_left);
                            list.add(num_right);
                            ans.add(list);
                        }
                    }
                    left++;
                    right--;
                }
            }
        }
        return ans;
    }
}
