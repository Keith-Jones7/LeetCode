package Exercises.First_Easy;
import java.util.*;
//720 词典中最长的单词
public class longest_word_in_dictionary {
    public String longestWord(String[] words) {
        Set<String> set = new HashSet<>(Arrays.asList(words));
        String ans = "";
        for(String word : words) {
            if(word.length() > ans.length() || (word.length() == ans.length() && word.compareTo(ans) < 0)) {
                boolean good = true;
                for(int i = 1; i < word.length(); i++) {
                    if(!set.contains(word.substring(0, i))) {
                        good = false;
                        break;
                    }
                }
                if(good) {
                    ans = word;
                }
            }
        }
        return ans;
    }

}

