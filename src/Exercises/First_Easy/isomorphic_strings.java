package Exercises.First_Easy;

import java.util.*;

//205 同构字符串
public class isomorphic_strings {
    public boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        char[] chars1 = s.toCharArray();
        char[] chars2 = t.toCharArray();
        for(int i = 0; i < chars1.length; i++) {
            if(map.containsKey(chars1[i])) {
                if(map.get(chars1[i]) != chars2[i]) {
                    return false;
                }
            }else {
                if(map.containsValue(chars2[i])) {
                    return false;
                }
                map.put(chars1[i], chars2[i]);
            }
        }
        return true;
    }
}
