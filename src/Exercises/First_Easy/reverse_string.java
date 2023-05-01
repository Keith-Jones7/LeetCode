package Exercises.First_Easy;
//344 反转字符串
public class reverse_string {
    public void reverseString(char[] s){
        int left = 0, right = s.length - 1;
        while (left < right){
            char temp = s[left];
            s[left++] = s[right];
            s[right--] = temp;
        }
    }
    public void reverseString2(char[] s){
        int len = s.length;
        for(int i = 0; i < len/2; i++){
            char temp = s[i];
            s[i] = s[len - i - 1];
            s[len - i - 1] = temp;
        }
    }
}
