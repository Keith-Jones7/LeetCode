package Exercises.Third_Hard;

import java.util.Arrays;

//899 有序队列
public class orderly_queue {
    public String orderlyQueue(String s, int k) {
        if (k > 1) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            return new String(chars);
        }
        int len = s.length();
        s += s;
        String min = s.substring(0, len);
        for (int i = len; i < s.length(); i++) {
            String temp = s.substring(i - len, i);
            if (temp.compareTo(min) < 0) {
                min = temp;
            }
        }
        return min;
    }
}
