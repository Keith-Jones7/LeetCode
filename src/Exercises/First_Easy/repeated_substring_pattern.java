package Exercises.First_Easy;
//459 重复的子字符串
public class repeated_substring_pattern {
    char[] chars;
    int len;
    public boolean repeatedSubstringPattern(String s) {
        chars = s.toCharArray();
        len = chars.length;
        for(int i = 1; i <= len / 2; i++) {
            if(len % i == 0 && isRepeat(i)) {
                return true;
            }
        }
        return false;
    }
    public boolean isRepeat(int subLen) {
        for(int i = 0; i < len; i++) {
            if(chars[i] != chars[i % subLen]) {
                return false;
            }
        }
        return true;
    }
}
