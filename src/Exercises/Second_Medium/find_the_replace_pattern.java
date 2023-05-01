package Exercises.Second_Medium;
import java.util.*;
//890 查找和替换模式
public class find_the_replace_pattern {
    char[] pattern_count;
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        pattern_count = pattern.toCharArray();
        List<String> list = new ArrayList<>();
        for(String word : words) {
            if(isSamePattern(word)) {
                list.add(word);
            }
        }
        return list;
    }
    public boolean isSamePattern(String word) {
        if(word.length() != pattern_count.length) {
            return false;
        }
        char[] chars = word.toCharArray();
        int[] map = new int[26];
        int[] count = new int[26];
        for(int i = 0; i < 26; i++) {
            map[i] = -1;
            count[i] = 0;
        }
        for(int i = 0; i < chars.length; i++) {
            if(map[pattern_count[i] - 'a'] == -1 && count[chars[i] - 'a'] == 0) {
                map[pattern_count[i] - 'a'] = chars[i] - 'a';
                count[chars[i] - 'a']++;
            }else if(map[pattern_count[i] - 'a'] != chars[i] - 'a') {
                return false;
            }
        }
        return true;
    }
}
