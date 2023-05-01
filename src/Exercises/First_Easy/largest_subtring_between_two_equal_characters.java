package Exercises.First_Easy;
//1624 两个相同字符之间的最长字符串
public class largest_subtring_between_two_equal_characters {
    public int maxLengthBetweenEqualCharacters(String s) {
        int[] start = new int[26];
        int[] end = new int[26];
        char[] chars = s.toCharArray();
        for (int i = 0; i < 26; i++) {
            start[i] = end[i] = -1;
        }
        for (int i = 0; i < chars.length; i++) {
            if (start[chars[i] - 'a'] == -1) {
                start[chars[i] - 'a'] = i;
            }
            int j = chars.length - 1 - i;
            if (end[chars[j] - 'a'] == -1) {
                end[chars[j] - 'a'] = j;
            }
        }
        int maxLen = -1;
        for (int i = 0; i < 26; i++) {
            maxLen = Math.max(end[i] - start[i] - 1, maxLen);
        }
        return maxLen;
    }
}
