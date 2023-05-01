package Exercises.First_Easy;
//9 回文数
public class palindrome_number {
    public boolean isPalindrome(int x) {
        if(x < 0) {
            return false;
        }
        if(x < 10) {
            return true;
        }
        String s = Integer.toString(x);
        for(int i = 0; i <= s.length()/2; i++) {
            if(s.charAt(i) != s.charAt(s.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
