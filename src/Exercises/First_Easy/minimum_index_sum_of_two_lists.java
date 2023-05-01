package Exercises.First_Easy;

import java.util.*;

//599 两个列表的最小索引总和
public class minimum_index_sum_of_two_lists {
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        List<String> ans = new ArrayList<>();
        int minSum = 2000;
        int count = 0;
        for(String str : list1) {
            map.put(str, count++);
        }
        for(int i = 0; i < list2.length; i++) {
            int index = map.getOrDefault(list2[i], -1);
            if(index > -1) {
                if((index + i) < minSum) {
                    ans.clear();
                    ans.add(list2[i]);
                    minSum = (index + i);
                }
                else if(index + i == minSum) {
                    ans.add(list2[i]);
                }
            }
        }
        return ans.toArray(new String[] {});
    }
}
