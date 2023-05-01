package Exercises.Second_Medium;
//3 无重复字符的最长子串
import java.util.*;
public class longest_substring_without_repeating_characters {
    public int lengthOfLongestSubstring(String s) {
        int length = 0;
        Map<Character, Integer> dp = new HashMap<>();
        for(int i = 0; i < s.length(); i++) {
            if(!dp.containsKey(s.charAt(i))) {
                dp.put(s.charAt(i),i);
                length = Math.max(length, dp.size());
            }
            else {
                i = dp.get(s.charAt(i));
                dp.clear();
            }
        }
        return length;
    }
}
