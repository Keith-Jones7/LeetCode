package Exercises.Second_Medium;

import java.util.*;

//904 水果成篮
public class fruit_into_baskets {
    public int totalFruit(int[] fruits) {
        int cnt = 0;
        int left = 0, right = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        while (right < fruits.length) {
            if (map.size() < 2) {
                map.put(fruits[right], map.getOrDefault(fruits[right], 0) + 1);
                right++;
            }else if(map.size() == 2){
                if (map.containsKey(fruits[right])) {
                    map.put(fruits[right], map.get(fruits[right]) + 1);
                    right++;
                }else {
                    while (map.size() == 2) {
                        map.put(fruits[left], map.get(fruits[left]) - 1);
                        if (map.get(fruits[left]) == 0) {
                            map.remove(fruits[left]);
                        }
                        left++;
                    }
                }
            }
            cnt = Math.max(cnt, right - left);
        }
        return cnt;
    }
}
