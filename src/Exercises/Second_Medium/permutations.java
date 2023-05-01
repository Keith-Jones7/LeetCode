package Exercises.Second_Medium;
//46 全排列
import java.util.*;
public class permutations {
    public List<List<Integer>> permute(int[] nums){
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return permute(list);
    }
    public List<List<Integer>> permute(List<Integer> list){
        if(list.size() == 1){
            List<List<Integer>> ans = new ArrayList<>();
            ans.add(list);
            return ans;
        }
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            List<Integer> list2 = new ArrayList<>(list);
            int x = list2.remove(i);
            List<List<Integer>> ans = permute(list2);
            for(List<Integer> sub_list : ans){
                sub_list.add(x);
                result.add(sub_list);
            }
        }
        return result;
    }
}
