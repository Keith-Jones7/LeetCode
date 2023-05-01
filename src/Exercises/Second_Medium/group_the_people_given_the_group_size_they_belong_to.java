package Exercises.Second_Medium;
import java.util.*;
//1282 用户分组
public class group_the_people_given_the_group_size_they_belong_to {
    public List<List<Integer>> groupThePeople(int[] groupSize) {
        List<List<Integer>> list = new ArrayList<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        for (int i = 0; i < groupSize.length; i++) {
            int size = groupSize[i];
            if (!map.containsKey(size)) {
               map.put(size, new ArrayList<>());
            }
            List<Integer> subList = map.get(size);
            subList.add(i);

        }
        for (Integer size : map.keySet()) {
            List<Integer> subList = map.get(size);
            for (int i = 0; i < subList.size();) {
                List<Integer> group = new ArrayList<>();
                for (int j = 0; j < size; j++) {
                    group.add(subList.get(i++));
                }
                list.add(group);
            }
        }
        return list;
    }
}
