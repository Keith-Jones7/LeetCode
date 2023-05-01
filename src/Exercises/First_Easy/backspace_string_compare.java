package Exercises.First_Easy;
//844 比较含退格的字符串
public class backspace_string_compare {
    public boolean backspaceCompare(String s, String t) {
        char[] chars1 = backspace(s.toCharArray());
        char[] chars2 = backspace(t.toCharArray());
        for(int i = 0; i < chars1.length; i++) {
            if(i >= chars2.length) {
                break;
            }
            if(chars1[i] == chars2[i] && chars1[i] == ' ') {
                break;
            }
            if(chars1[i] != chars2[i]) {
                return false;
            }
        }
        return true;
    }
    public char[] backspace(char[] chars) {
        int index = 0;
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == '#') {
                index--;
            }else {
                chars[index++] = chars[i];
            }
            if(index < 0) {
                index = 0;
            }
        }
        for(int i = index; i < chars.length; i++) {
            chars[index] = ' ';
        }
        return chars;
    }
}
