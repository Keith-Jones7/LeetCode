package Exercises.Second_Medium;
import java.util.*;
//40 组合总和2
public class combination_sum_2 {
    List<List<Integer>> ans;
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        ans = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2(candidates, target, 0, new ArrayList<>());
        return ans;
    }
    public void combinationSum2(int[] candidates, int target, int index, List<Integer> list) {
        if(target == 0) {
            ans.add(new ArrayList<>(list));
            return;
        }
        if(index == candidates.length || candidates[index] > target) {
            return;
        }
        for(int i = index; i < candidates.length; i++) {
            if(candidates[i] > target) {
                break;
            }
            if(i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            list.add(candidates[i]);
            combinationSum2(candidates, target - candidates[i], i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
