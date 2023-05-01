package Exercises.Second_Medium;

import java.util.*;

//846 一手顺子
public class hands_of_straights {
    public boolean isNStraightHand(int[] hand, int groupSize){
        int size = hand.length;
        if(size % groupSize != 0){
            return false;
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> keys = new ArrayList<>();
        for(int num: hand){
            if(!map.containsKey(num)){
                keys.add(num);
                map.put(num, 1);
            }
            else {
                map.put(num, map.get(num) + 1);
            }
        }
        Collections.sort(keys);
        for(int key : keys){
            if(map.get(key) < 0){
                return false;
            }
            if(map.get(key) == 0){
                continue;
            }
            int count_start = map.get(key);
            map.put(key, 0);
            for(int i = 1; i < groupSize; i++){
                if(!map.containsKey(key + i)){
                    return false;
                }
                map.put(key + i, map.get(key + i) - count_start);
            }
        }
        return true;
    }
}
