package Exercises.First_Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//884 两句话中的不常见单词
public class uncommon_words_from_two_sentences {
    public String[] uncommonFromSentences(String s1, String s2){
        HashMap<String, Integer> hashMap = new HashMap<>();
        String[] words1 = s1.split(" ");
        String[] words2 = s2.split(" ");
        for(String word : words1){
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }
        for(String word: words2){
            hashMap.put(word, hashMap.getOrDefault(word, 0) + 1);
        }
        ArrayList<String> ans = new ArrayList<>();
        for (Map.Entry<String, Integer> stringIntegerEntry : hashMap.entrySet()) {
            if ((int) ((Map.Entry) stringIntegerEntry).getValue() == 1) {
                ans.add((String) ((Map.Entry) stringIntegerEntry).getKey());
            }
        }
        return ans.toArray(new String[0]);
    }
}
