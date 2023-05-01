package Exercises.Second_Medium;
import java.util.*;
//438 找到字符串中的所有字母异位词
public class find_all_anagrams_in_a_string {
    public static List<Integer> findAnagrams(String s, String p){
        List<Integer> list = new ArrayList<>();
        if(s.length() < p.length()){
            return list;
        }
        int[] p_count = new int[26];
        int[] s_count = new int[26];
        char[] p_char = p.toCharArray();
        char[] s_char = s.toCharArray();
        for(char ch : p_char){
            p_count[ch - 'a']++;
        }
        for(int i = 0 ; i < s_char.length; i++){
            if(i < p_char.length - 1){
                s_count[s_char[i] - 'a']++;
            }
            else {
                int index = i - (p_char.length - 1);
                s_count[s_char[i] - 'a'] ++;
                if(Arrays.equals(p_count, s_count)){
                    list.add(index);
                }
                s_count[s_char[index] - 'a']--;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        String s = "abab";
        String p = "ab";
        findAnagrams(s, p);
    }
}
