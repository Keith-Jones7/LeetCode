package Exercises.First_Easy;
//2309 兼具大小写的最好英文字母
public class greatest_english_letter_in_upper_and_lower_case {
    public String greatestLetter(String s) {
        int[] map = new int[26];
        for (char ch : s.toCharArray()) {
            if (ch - 'a' >= 0 && ch - 'z' <= 0) {
                map[ch - 'a'] |= 1;
            }else {
                map[ch - 'A'] |= 2;
            }
        }
        for (int i = 25; i >= 0; i--) {
            if (map[i] == 3) {
                return "" + (char)('A' + i);
            }
        }
        return "";
    }
}
