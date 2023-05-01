package Exercises.First_Easy;
//242 有效的字母异位词
public class valid_anagram {
    public boolean isAnagram(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int[] s1 = new int[26];
        int[] s2 = new int[26];
        char[] ch1 = s.toCharArray();
        char[] ch2 = t.toCharArray();
        for(int i = 0; i < s.length(); i++){
            s1[ch1[i] - 'a']++;
            s2[ch2[i] - 'a']++;
        }
        for(int i = 0; i < 26; i++){
            if(s1[i] != s2[i]){
                return false;
            }
        }
        return true;
    }
}
