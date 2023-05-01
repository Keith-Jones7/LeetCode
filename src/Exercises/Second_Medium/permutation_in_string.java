package Exercises.Second_Medium;

import java.util.Arrays;

//567 字符串的排列
public class permutation_in_string {
    public boolean checkInclusion(String s1, String s2){
        char[] chars1 = s1.toCharArray();
        int len1 = chars1.length;
        if(len1 > s2.length()){
            return false;
        }
        int[] count = new int[26];
        for (char c : chars1) {
            count[c - 'a']++;
        }
        char[] chars2 = s2.toCharArray();
        int[] count2 = new int[26];
        for(int i = 0; i < len1; i++){
            count2[chars2[i] - 'a']++;
        }
        if(Arrays.equals(count, count2)){
            return true;
        }
        for(int i = len1; i < chars2.length; i++){
            count2[chars2[i] - 'a']++;
            count2[chars2[i - len1] - 'a']--;
            if(Arrays.equals(count, count2)){
                return true;
            }
        }
        return false;
    }
}
