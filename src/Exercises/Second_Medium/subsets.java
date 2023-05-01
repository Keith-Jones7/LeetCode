package Exercises.Second_Medium;

import java.util.ArrayList;
import java.util.List;

public class subsets {
    List<List<Integer>> list;
    public List<List<Integer>> subsets(int[] nums) {
        list = new ArrayList<>();
        list.add(new ArrayList<>());
        for (int num : nums) {
            addNumToList(num);
        }
        return list;

    }
    public void addNumToList(int num) {
        List<List<Integer>> tempList = new ArrayList<>();
        for(List<Integer> subList : list) {
            List<Integer> integerList = new ArrayList<>(subList);
            integerList.add(num);
            tempList.add(integerList);
        }
        list.addAll(tempList);
    }
}
