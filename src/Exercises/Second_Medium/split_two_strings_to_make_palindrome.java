package Exercises.Second_Medium;
//1616 分割两个字符串得到回文串
public class split_two_strings_to_make_palindrome {

    public boolean checkPalindromeFormation(String a, String b) {
        return check(a, b) || check(b, a);
    }
    public boolean check(String a, String b) {
        int len = a.length();
        int index = 0;
        while (index < len) {
            char ch1 = a.charAt(index);
            char ch2 = b.charAt(len - 1 -index);
            index++;
            if (ch1 != ch2) {
                break;
            }
        }
        if (index > len / 2) {
            return true;
        }
        return isPalindrome(b, index, len - 1 - index) || isPalindrome(a, index, len - 1 - index);
    }
    public boolean isPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start++) != s.charAt(end--)) {
                return false;
            }
        }
        return true;
    }
}
