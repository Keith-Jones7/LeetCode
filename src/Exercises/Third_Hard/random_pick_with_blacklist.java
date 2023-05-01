package Exercises.Third_Hard;

import java.util.*;


//710 黑名单中的随机数
public class random_pick_with_blacklist {
    Map<Integer, Integer> map;
    Random random = new Random();
    int bound;
    public random_pick_with_blacklist(int n, int[] blacklist) {
        map = new HashMap<>();
        int m = blacklist.length;
        bound = n - m;
        Set<Integer> set = new HashSet<>();
        for(int black : blacklist) {
            if(black >= bound) {
                set.add(black);
            }
        }
        int index = n - m;
        for(int black : blacklist) {
            if(black < bound) {
                while (set.contains(index)) {
                    index++;
                }
                map.put(black, index++);
            }
        }
    }

    public int pick() {
        int rand = random.nextInt(bound);
        return map.getOrDefault(rand, rand);
    }

}
