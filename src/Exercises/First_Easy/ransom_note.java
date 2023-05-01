package Exercises.First_Easy;

import java.util.HashMap;

//383 赎金信
public class ransom_note {
    public boolean canConstruct(String ransomNote, String magazine){//哈希表记录次数
        HashMap<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < magazine.length(); i++){
            char ch = magazine.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i = 0; i < ransomNote.length(); i++){
            char ch = ransomNote.charAt(i);
            if(map.getOrDefault(ch, 0) == 0){
                return false;
            }
            else{
                map.put(ch, map.get(ch) - 1);
            }
        }
        return true;
    }
    public boolean canConstruct2(String ransomNote, String magazine){//数组记录次数
        if(magazine.length() < ransomNote.length()){
            return false;
        }
        int[] count = new int[26];
        char[] chars1 = magazine.toCharArray();
        char[] chars2 = ransomNote.toCharArray();
        for(char ch : chars1){
            count[ch - 'a']++;
        }
        for(char ch : chars2){
            count[ch - 'a']--;
            if(count[ch - 'a'] < 0){
                return false;
            }
        }
        return true;
    }
}
