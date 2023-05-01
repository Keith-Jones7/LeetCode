package Exercises.Second_Medium;
//424 替换后的最长重复字符
public class longest_repeating_character_replacement {
    public int characterReplacement(String s, int k) {
        char[] chars = s.toCharArray();
        int[] count = new int[26];
        int left = 0, right = 0, max = -1, len = chars.length;
        while (right < len) {
            count[chars[right] - 'A']++;
            max = Math.max(max, count[chars[right] - 'A']);
            if(right - left + 1 - max > k) {
                count[chars[left++] - 'A']--;
            }
            right++;
        }
        return Math.min(len, max + k);
    }
}
