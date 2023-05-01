package Exercises.First_Easy;
//409 最长回文子串
public class longest_palindrome {
    public int longestPalindrome(String s){
        int[] count = new int[58];
        int count_single = 0, count_multi = 0, ans = 0;
        char[] chars = s.toCharArray();
        for(char ch : chars){
            count[ch - 'A']++;
        }
        for(int c : count){
            if(c == 0){
                continue;
            }
            int single = c % 2;
            int multi = c - single;
            count_single += single;
            count_multi += multi;
        }
        ans += count_multi + (count_single > 0 ? 1 : 0);
        return ans;
    }
}
