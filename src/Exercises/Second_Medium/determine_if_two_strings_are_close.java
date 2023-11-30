package Exercises.Second_Medium;

import java.util.Arrays;

//1657 确定两个字符串是否接近
public class determine_if_two_strings_are_close {
    public boolean closeStrings(String word1, String word2) {
        if (word1.length() != word2.length()) {
            return false;
        }
        int[] cnt1 = new int[26];
        int[] cnt2 = new int[26];
        for (int i = 0; i < word1.length(); i++) {
            cnt1[word1.charAt(i) - 'a']++;
            cnt2[word2.charAt(i) - 'a']++;
        }
        for (int i = 0; i < 26; i++) {
            if (cnt1[i] == 0 && cnt2[i] != 0) {
                return false;
            }
        }
        Arrays.sort(cnt1);
        Arrays.sort(cnt2);
        for (int i = 0; i < 26; i++) {
            if (cnt1[i] != cnt2[i]) {
                return false;
            }
        }
        return true;
    }
}
