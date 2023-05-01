package Exercises.First_Easy;

import java.util.HashMap;

//290 单词规律
public class word_pattern {
    public boolean wordPattern(String pattern, String s){
        HashMap<Character, String> hashMap1 = new HashMap<>();
        HashMap<String, Character> hashMap2 = new HashMap<>();
        char[] chars = pattern.toCharArray();
        String[] words = s.split(" ");
        if(words.length != chars.length){
            return false;
        }
        for(int i = 0; i < words.length; i++){
            char ch = chars[i];
            String str = words[i];
            if(hashMap1.containsKey(ch)){
                if(!hashMap1.get(ch).equals(str)){
                    return false;
                }
            }
            if(hashMap2.containsKey(str)){
                if(!hashMap2.get(str).equals(ch)){
                    return false;
                }
            }
            else {
                hashMap1.put(ch, words[i]);
                hashMap2.put(words[i], ch);
            }
        }
        return true;
    }
}
