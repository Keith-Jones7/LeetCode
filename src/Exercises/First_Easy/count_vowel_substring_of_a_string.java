package Exercises.First_Easy;

import java.util.HashSet;

//2062 统计字符串中的元音子字符串
public class count_vowel_substring_of_a_string {
    public int countVowelSubstrings(String word) {
        if(word.length() < 5){
            return 0;
        }
        int count = 0;
        HashSet<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('e');
        vowel.add('i');
        vowel.add('o');
        vowel.add('u');
        for(int i = 0; i < word.length() - 4; i++){
            if(!vowel.contains(word.charAt(i))){
                continue;
            }
            else{
                for(int j = i + 5; j <= word.length(); j++){
                    if(isVowelSubstring(word.substring(i, j)) == 1){
                        count++;
                    }
                    else if(isVowelSubstring(word.substring(i, j)) == -1){
                        break;
                    }
                }
            }
        }
        return count;
    }
    public int isVowelSubstring(String word){
        int[] count = new int[5];
        for(int i = 0; i < word.length(); i++){
            char ch = word.charAt(i);
            if(ch == 'a'){
                count[ch - 'a']++;
                continue;
            }
            if(ch == 'e'){
                count[ch - 'd']++;
                continue;
            }
            if(ch == 'i'){
                count[ch - 'g']++;
                continue;
            }
            if(ch == 'o'){
                count[ch - 'l']++;
                continue;
            }
            if(ch == 'u'){
                count[ch - 'q']++;
                continue;
            }
            return -1;
        }
        for(int num:count){
            if(num == 0) {
                return 0;
            }
        }
        return 1;
    }

    public static void main(String[] args) {
        count_vowel_substring_of_a_string cvsa = new count_vowel_substring_of_a_string();
        String word = "cuaieuouac";
        int count = cvsa.countVowelSubstrings(word);
    }
}
