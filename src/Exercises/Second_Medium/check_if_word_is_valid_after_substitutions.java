package Exercises.Second_Medium;

import java.util.Stack;

//1003 检查替换后的词是否有效
public class check_if_word_is_valid_after_substitutions {
    public boolean isValid(String s) {
        char[] chars = s.toCharArray();
        int[] arr = new int[chars.length];
        int index = 0;
        for (char ch : chars) {
            if (ch == 'a') {
                arr[index++] = 1;
            }else if (ch == 'b') {
                if (index == 0 || arr[index - 1] != 1) {
                    return false;
                }else {
                    arr[index++] = 2;
                }
            }else {
                if (index == 0 || arr[index - 1] != 2) {
                    return false;
                }else {
                    index -= 2;
                }
            }
        }
        return index == 0;
    }
}
