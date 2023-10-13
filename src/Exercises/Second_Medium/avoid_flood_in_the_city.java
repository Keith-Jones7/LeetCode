package Exercises.Second_Medium;
import java.util.*;
//1488 避免洪水泛滥
public class avoid_flood_in_the_city {
    public int[] avoidFlood(int[] rains) {
        Map<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> treeSet = new TreeSet<>();
        int[] ans = new int[rains.length];
        for (int i = 0; i < rains.length; i++) {
            if (rains[i] > 0) {
                ans[i] = -1;
                if (map.containsKey(rains[i])) {
                    Integer index = treeSet.ceiling(map.get(rains[i]));
                    if (index != null) {
                        ans[index] = rains[i];
                    }else {
                        return new int[0];
                    }
                    treeSet.remove(index);
                }
                map.put(rains[i], i);
            }else {
                treeSet.add(i);
                ans[i] = 1;
            }
        }
        return ans;
    }
}
