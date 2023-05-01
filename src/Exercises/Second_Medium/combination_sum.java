package Exercises.Second_Medium;
import java.util.*;
//39 组合总和
public class combination_sum {
    List<List<Integer>> ans = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        for(int i = 0; i < candidates.length; i++) {
            combinationSum(candidates, target, i, new ArrayList<>());
        }
        return ans;
    }
    public void combinationSum(int[] candidates, int target, int index, List<Integer> list) {
        if(target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(candidates[index] > target) {
            return;
        }
        for(int i = index; i < candidates.length; i++) {
            if(candidates[i] > target) {
                break;
            }
            list.add(candidates[i]);
            System.out.println(candidates[i] + "  " + target);
            combinationSum(candidates, target - candidates[i], index, list);
            list.remove(list.size() - 1);
        }
    }
}
