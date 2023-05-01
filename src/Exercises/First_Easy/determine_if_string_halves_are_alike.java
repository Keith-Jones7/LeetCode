package Exercises.First_Easy;

import java.util.*;

//1704 判断字符串的两半是否相似
public class determine_if_string_halves_are_alike {
    public boolean halvesAreAlike(String s) {
        char[] chars = s.toCharArray();
        int index1 = 0, count1 = 0;
        int index2 = chars.length / 2, count2 = 0;
        Set<Character> characterSet = new HashSet<>();
        characterSet.add('a');
        characterSet.add('e');
        characterSet.add('i');
        characterSet.add('o');
        characterSet.add('u');
        characterSet.add('A');
        characterSet.add('E');
        characterSet.add('I');
        characterSet.add('O');
        characterSet.add('U');
        for (; index2 < chars.length; index1++, index2++) {
            if (characterSet.contains(chars[index1])) {
                count1++;
            }
            if (characterSet.contains(chars[index2])) {
                count2++;
            }
        }
        return count1 == count2;
    }
}
