package Exercises.First_Easy;
import java.util.*;
//2185 统计包含特定前缀的字符串
public class counting_words_with_a_given_prefix {
    public int prefixCount(String[] words, String pref) {
        char[] pre = pref.toCharArray();
        int cnt = 0;
        for (String word : words) {
            if (isPref(word, pre)) {
                cnt++;
            }
        }
        return cnt;
    }
    public boolean isPref(String word, char[] pre) {
        char[] chars = word.toCharArray();
        for (int i = 0; i < pre.length; i++) {
            if (i == chars.length || chars[i] != pre[i]) {
                return false;
            }
        }
        return true;
    }
}
