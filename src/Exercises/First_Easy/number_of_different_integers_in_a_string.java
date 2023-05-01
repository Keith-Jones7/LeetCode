package Exercises.First_Easy;

import java.util.*;

//1805 字符串中不同整数的数目
public class number_of_different_integers_in_a_string {
    public int numDifferentIntegers(String word) {
        Set<String> set = new HashSet<>();
        char[] chars = word.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < 58) {
                int j = i;
                while (j < chars.length && chars[j] < 58) {
                    j++;
                }
                while (i < j && chars[i] == 48) {
                    i++;
                }
                set.add(word.substring(i, j));
                i = j;
            }
        }
        return set.size();
    }
}
