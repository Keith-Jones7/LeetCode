package Exercises.Second_Medium;
//2131 连接两字母单词得到的最长字符串
public class longest_palindrome_by_concatenating_two_letter_words {
    public int longestPalindrome(String[] words) {
        int[][] count = new int[26][26];
        int len = 0;
        for (String word : words) {
            int ch0 = word.charAt(0) - 'a';
            int ch1 = word.charAt(1) - 'a';
            if (count[ch1][ch0] > 0) {
                len += 4;
                count[ch1][ch0]--;
                continue;
            }
            count[ch0][ch1]++;
        }
        for (int i = 0; i < 26; i++) {
            if(count[i][i] > 0) {
                len += 2;
                break;
            }
        }
        return len;
    }
}
