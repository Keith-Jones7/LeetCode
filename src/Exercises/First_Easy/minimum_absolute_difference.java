package Exercises.First_Easy;
import java.util.*;
//1200 最小绝对差
public class minimum_absolute_difference {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min_abs_difference = Integer.MAX_VALUE;
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i + 1] - arr[i] <= min_abs_difference) {
                if(arr[i + 1] - arr[i] < min_abs_difference) {
                    min_abs_difference = arr[i + 1] - arr[i];
                    ans.clear();
                }
                List<Integer> list = new ArrayList<>();
                list.add(arr[i]);
                list.add(arr[i + 1]);
                ans.add(list);
            }
        }
        return ans;
    }
}
