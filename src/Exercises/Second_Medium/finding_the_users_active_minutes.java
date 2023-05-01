package Exercises.Second_Medium;

import java.util.*;

//1817 查找用户活跃分钟数
public class finding_the_users_active_minutes {
    public int[] findingUserActiveMinutes(int[][] logs, int k) {
        HashMap<Integer, Set<Integer>> map = new HashMap<>();
        for (int[] log : logs) {
            int id = log[0];
            int time = log[1];
            Set<Integer> set = map.getOrDefault(id, new HashSet<>());
            set.add(time);
            map.put(id, set);
        }
        int[] arr = new int[k];
        for (Set<Integer> set : map.values()) {
            arr[set.size() - 1]++;
        }
        return arr;
    }
}
