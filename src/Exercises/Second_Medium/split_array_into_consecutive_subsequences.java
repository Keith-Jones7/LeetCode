package Exercises.Second_Medium;
import java.util.*;
//659 分割数组为连续子序列
public class split_array_into_consecutive_subsequences {
    public boolean isPossible(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>(), need = new HashMap<>();
        for(int num : nums) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        for(int num : nums) {
            if(freq.getOrDefault(num, 0) == 0) {
                continue;
            }
            if(need.getOrDefault(num, 0) > 0) {
                freq.put(num, freq.get(num) - 1);
                need.put(num, need.get(num) - 1);
                need.put(num + 1, need.getOrDefault(num + 1, 0) + 1);
            }
            else if(freq.getOrDefault(num + 1, 0) > 0 && freq.getOrDefault(num + 2, 0) > 0) {
                freq.put(num, freq.get(num) - 1);
                freq.put(num + 1, freq.get(num + 1) - 1);
                freq.put(num + 2, freq.get(num + 2) - 1);
                need.put(num + 3, need.getOrDefault(num + 3, 0) + 1);
            }
            else {
                return false;
            }
        }
        return true;
    }
}
