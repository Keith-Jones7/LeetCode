package Exercises.First_Easy;

import java.util.ArrayList;
import java.util.List;

//1078 Bigram分词
public class occurrences_after_bigram {
    public String[] findOcurrences(String text, String first, String second) {
        String[] texts = text.split(" ");
        int[] hashcode = new int[texts.length];
        int first_hash = first.hashCode();
        int second_hash = second.hashCode();
        hashcode[0] = texts[0].hashCode();
        List<Integer> list = new ArrayList<>();
        for(int i = 1; i < hashcode.length; i++){
            hashcode[i] = texts[i].hashCode();
            if(hashcode[i] == second_hash && hashcode[i - 1] == first_hash && (i + 1) < hashcode.length){
                list.add(i + 1);
            }
        }
        String[] ans = new String[list.size()];
        for(int i = 0; i < ans.length; i++){
            ans[i] = texts[list.get(i)];
        }
        return ans;
    }
}