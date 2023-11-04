package Exercises.First_Easy;
import java.util.*;
//2103 环和杆
public class rings_and_rods {
    public int countPoints(String rings) {
        Set<Character>[] sets = new Set[10];
        for (int i = 0; i < rings.length(); i += 2) {
            char ch1 = rings.charAt(i);
            char ch2 = rings.charAt(i + 1);
            if (sets[ch2 - '0'] == null) {
                sets[ch2 - '0'] = new HashSet<>();
            }
            sets[ch2 - '0'].add(ch1);
        }
        int cnt = 0;
        for (Set<Character> set : sets) {
            if (set != null && set.size() == 3) {
                cnt++;
            }
        }
        return cnt;
    }
}
