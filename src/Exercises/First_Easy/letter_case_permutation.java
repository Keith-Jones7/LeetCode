package Exercises.First_Easy;
import java.util.*;
//784 字母大小写全排列
public class letter_case_permutation {
    char[] chars;
    List<String> list = new ArrayList<>();
    Queue<StringBuilder> queue = new ArrayDeque<>();
    public List<String> letterCasePermutation(String s) {
        chars = s.toCharArray();
        queue.add(new StringBuilder());
        letter(0);
        for (StringBuilder stringBuilder : queue) {
            list.add(stringBuilder.toString());
        }
        return list;
    }
    public void letter(int index) {
        if (index == chars.length) {
            return;
        }
        int size = queue.size();
        for (int i = 0; i < size; i++) {
            assert !queue.isEmpty();
            StringBuilder stringBuilder = queue.poll();
            if (Character.isDigit(chars[index])) {
                queue.add(new StringBuilder(stringBuilder.append(chars[index])));
            }else {
                queue.add(new StringBuilder(stringBuilder.append(Character.toLowerCase(chars[index]))));
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                queue.add(new StringBuilder(stringBuilder.append(Character.toUpperCase(chars[index]))));
            }
        }
        letter(index + 1);
    }
}
