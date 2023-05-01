package Exercises.First_Easy;
//520 检测大写字母
public class detect_capital {
    public boolean detectCapitalUse(String word){
        if(word.length() < 2){
            return true;
        }
        if(word.toLowerCase().equals(word)||word.toUpperCase().equals(word)){
            return true;
        }
        return word.substring(1).toLowerCase().equals(word.substring(1));
    }
    public static boolean detectCapitalUse2(String word){
        if(word.length() < 2){
            return true;
        }
        boolean Lower = (word.charAt(0) - 'a' >= 0);
        if(Lower){
            for(int i = 1; i < word.length(); i++){
                if(word.charAt(i) - 'a' < 0){
                    return false;
                }
            }
        }
        else {
            for(int i = 1; i < word.length() - 1; i++){
                if(word.charAt(i) - 'a' >= 0 != word.charAt(i + 1) - 'a' >=0){
                   return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String word = "Leetcode";
        detectCapitalUse2(word);
    }
}
