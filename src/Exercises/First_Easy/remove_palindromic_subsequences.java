package Exercises.First_Easy;
//1332 删除回文子序列
public class remove_palindromic_subsequences {
    public int removePalindromeSub(String s){
        if(isPalindromic(s)){
            return 1;
        }
        else {
            return 2;
        }
    }
    public boolean isPalindromic(String s){
        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length/2; i++){
            if(chars[i] != chars[chars.length - 1 - i]){
                return false;
            }
        }
        return true;
    }
}
