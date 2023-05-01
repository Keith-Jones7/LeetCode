package Exercises.First_Easy;
//125 验证回文串
public class valid_palindrome {
    public boolean isPalindrome(String s) {
        char[] chars = s.toCharArray();
        int left = 0, right = chars.length - 1;
        while (left < right) {
            if(!Character.isLetter(chars[left]) && !Character.isDigit(chars[left])) {
                left++;
                continue;
            }
            if(!Character.isLetter(chars[right]) && !Character.isDigit(chars[right])) {
                right--;
                continue;
            }
            if(chars[left] == chars[right] || Character.toLowerCase(chars[left]) == Character.toLowerCase(chars[right])) {
                left++;
                right--;
            }else {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        valid_palindrome test = new valid_palindrome();
        String s = "racecay";
        test.isPalindrome(s);
    }
}
