package Exercises.Second_Medium;

import java.util.*;

//2013 检测正方形
public class detect_squares {
    HashMap<Integer, Integer> count_map;
    HashMap<Integer, Set<Integer>> hashMap1;
    HashMap<Integer, Set<Integer>> hashMap2;
    final int N = 1006;
    public detect_squares(){
        count_map = new HashMap<>();
        hashMap1 = new HashMap<>();
        hashMap2 = new HashMap<>();
    }
    public void add(int[] point){
        int x = point[0], y = point[1], val = x + y * N;
        int intercept1 = y + x, intercept2 = y - x;
        count_map.put(val, count_map.getOrDefault(val, 0) + 1);
        Set<Integer> set = hashMap1.getOrDefault(intercept1, new HashSet<>());
        set.add(val);
        hashMap1.put(intercept1, set);
        set = hashMap2.getOrDefault(intercept2, new HashSet<>());
        set.add(val);
        hashMap2.put(intercept2, set);
    }
    public int count(int[] point){
        int x = point[0], y = point[1];
        int intercept1 = y + x, intercept2 = y - x;
        return countCross(intercept1, x, y, hashMap1) + countCross(intercept2, x, y, hashMap2);
    }
    public int countCross(int intercept, int x, int y, HashMap<Integer, Set<Integer>> hashMap){
        int count = 0;
        Set<Integer> set = hashMap.get(intercept);
        if(set == null){
            return 0;
        }
        System.out.println("x : " + x + "  y : " + y + "  intercept : " + intercept);
        for(int coordinate : set){
            int temp_y = coordinate / N;
            int temp_x = coordinate % N;
            if(temp_x == x){
                continue;
            }
            count += (count_map.get(coordinate)
                    * count_map.getOrDefault(x + temp_y * N, 0)
                    * count_map.getOrDefault(temp_x + y * N, 0));
        }
        return count;
    }

    public static void main(String[] args) {
        detect_squares test = new detect_squares();
        test.add(new int[]{3, 10});
        test.add(new int[]{11, 2});
        test.add(new int[]{3, 2});
        test.count(new int[]{11, 10});
        test.count(new int[]{14, 8});
        test.add(new int[]{11, 2});
        test.count(new int[]{11, 10});
    }
}
