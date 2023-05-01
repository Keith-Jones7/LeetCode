package Exercises.First_Easy;

import java.util.*;

//2325 解密消息
public class decode_the_message {
    public String decodeMessage(String key, String message) {
        int[] map = new int[26];
        int charIndex = 1, countSize = 0;
        for (char ch : key.toCharArray()) {
            if (countSize == 26) {
                break;
            }
            if (ch != ' ' && map[ch - 'a'] == 0) {
                map[ch - 'a'] = charIndex;
                charIndex++;
                countSize++;
            }
        }
        char[] chars = message.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != ' ') {
                chars[i] = (char) ((map[chars[i] - 'a'] + 'a' - 1));
            }
        }
        return new String(chars);
    }
}
