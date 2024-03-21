package Exercises.Second_Medium;

import java.util.*;

//2671 频率跟踪器
public class frequency_tracker {

}
class FrequencyTracker {

    Map<Integer, Integer> map1;
    Map<Integer, Integer> map2;
    public FrequencyTracker() {
        map1 = new HashMap<>();
        map2 = new HashMap<>();
    }

    public void add(int number) {
        int val1 = map1.getOrDefault(number, 0);
        map1.put(number, val1 + 1);
        int val2 = map2.getOrDefault(val1, 0);
        if (val2 == 1) {
            map2.remove(val1);
        }else if (val2 > 1) {
            map2.put(val1, val2 - 1);
        }
        map2.put(val1 + 1, map2.getOrDefault(val1 + 1, 0) + 1);
    }

    public void deleteOne(int number) {
        int val1 = map1.getOrDefault(number, 0);
        if (val1 > 0) {
            int val2 = map2.get(val1);
            if (val2 == 1) {
                map2.remove(val1);
            }else {
                map2.put(val1, val2 - 1);
            }
            map2.put(val1 - 1, map2.getOrDefault(val1 - 1, 0) + 1);
        }
        if (val1 == 1) {
            map1.remove(number);
        }else if (val1 > 1) {
            map1.put(number, val1 - 1);
        }
    }

    public boolean hasFrequency(int frequency) {
        return map2.containsKey(frequency);
    }
}
