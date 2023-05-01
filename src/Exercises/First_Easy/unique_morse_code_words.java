package Exercises.First_Easy;

import java.util.*;

//804 唯一摩尔斯密码词
public class unique_morse_code_words {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",
                ".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> stringSet = new HashSet<>();
        for(String str : words) {
            StringBuilder stringBuilder = new StringBuilder();
            for(char ch : str.toCharArray()) {
                stringBuilder.append(morse[ch - 'a']);
            }
            stringSet.add(stringBuilder.toString());
        }
        return stringSet.size();
    }
}
