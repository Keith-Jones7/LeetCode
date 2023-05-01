package Exercises.Second_Medium;
//5 最长回文子串
public class longest_palindromic_substring {
    public String longestPalindrome(String s){
        char[] chars = s.toCharArray();
        int len = chars.length;
        if(len < 2){
            return s;
        }
        int max_right = -1, max_left = 0;
        for(int i = 0; i < len; i++){
            int left = i, right = i;
            while (left >= 0 && chars[left] == chars[i]){
                left--;
            }
            while (right < len && chars[right] == chars[i]){
                right++;
            }
            while (left >= 0 && right < len && chars[left] == chars[right]){
                left--;
                right++;
            }
            if(max_right - max_left < right - left){
                max_left = left;
                max_right = right;
            }
        }
        return s.substring(max_left + 1, max_right);
    }
}
