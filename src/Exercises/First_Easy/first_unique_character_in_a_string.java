package Exercises.First_Easy;


import java.util.HashMap;

//387 字符串中的第一个唯一字符
public class first_unique_character_in_a_string {
    public int firstUniqueChar(String s){
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            if(map.containsKey(s.charAt(i))){
                map.replace(s.charAt(i), -1);
            }
            else {
                map.put(s.charAt(i), i);
            }
        }
        int min = -1;
        for(int i = 0; i < s.length(); i++){
            if(map.get(s.charAt(i)) != -1){
                return i;
            }
        }
        return min;
    }
}
