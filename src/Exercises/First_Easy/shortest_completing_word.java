package Exercises.First_Easy;

import java.util.*;

//748 最短补全词
public class shortest_completing_word {
    public static String shortestCompletingWord(String licensePlate, String[] words){
        Map<Integer, Integer> map = new HashMap<>();
        licensePlate = licensePlate.toLowerCase();
        char[] chars = licensePlate.toCharArray();
        for(char ch : chars){
            if(Character.isLetter(ch)){
                map.put(ch - 'a', map.getOrDefault(ch - 'a', 0) + 1);
            }
        }
        String result  = "aaaaaaaaaaaaaaaa";
        for(String str: words){
            char[] temp_char = str.toCharArray();
            Map<Integer, Integer> temp_map = new HashMap<>();
            for(char ch : temp_char){
                temp_map.put(ch - 'a', temp_map.getOrDefault(ch - 'a', 0) + 1);
            }
            boolean bool = true;
            for(char ch : chars){
                if(Character.isLetter(ch)){
                    bool = bool && (map.get(ch - 'a') <= temp_map.getOrDefault(ch - 'a', 0));
                }
            }
            if(bool && str.length() < result.length()){
                result = str;
            }
        }
        return result;
    }
    public static String shortestCompletingWord2(String licensePlate, String[] words){
        int[] count = new int[26];
        licensePlate = licensePlate.toLowerCase();
        for(int i = 0; i < licensePlate.length(); i++){
            char ch = licensePlate.charAt(i);
            if(Character.isLetter(ch)){
                count[ch - 'a']++;
            }
        }
        String result = "aaaaaaaaaaaaaaaa";
        for(String str: words){
            if(isContain(count, str) && str.length() < result.length()){
                result = str;
            }
        }
        return result;

    }
    public static boolean isContain(int[] count, String word){
        int[] count_word = new int[26];
        char[] chars = word.toCharArray();
        for(char ch : chars){
            count_word[ch - 'a']++;
        }
        for(int i = 0; i < count.length; i++){
            if(count_word[i] < count[i]){
                return false;
            }
        }
        return true;
    }
}
