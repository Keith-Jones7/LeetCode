package Exercises.First_Easy;

import java.util.Arrays;

//1189 "气球"的最大数量
public class maximum_number_of_balloons {
    public int maxNumberOfBalloons(String text){
        int[] count = new int[26];
        char[] chars = text.toCharArray();
        for(char ch : chars){
            count[ch - 'a']++;
        }
        int[] count2 = {count[0], count[1], count['l' - 'a']/2, count['o' - 'a']/2, count['n' - 'a']};
        Arrays.sort(count2);
        return count2[0];
    }
}
