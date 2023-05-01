package Exercises.First_Easy;

import java.util.*;
//819 最常见的单词
public class most_common_word {
    public String mostCommonWord(String paragraph, String[] banned) {
        Map<String, Integer> map = new HashMap<>();
        Set<String> set = new HashSet<>(Arrays.asList(banned));
        char[] chars = (paragraph + ".").toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for(char ch : chars) {
            if(!Character.isLetter(ch)) {
                if(stringBuilder.length() > 0) {
                    String str = stringBuilder.toString();
                    if(!set.contains(str)) {
                        map.put(str, map.getOrDefault(str, 0) + 1);
                    }
                }
                stringBuilder = new StringBuilder();
            }else {
                stringBuilder.append(Character.toLowerCase(ch));
            }
        }
        int maxCount = 0;
        String string = "";
        for(String str : map.keySet()) {
            int count = map.get(str);
            if(count > maxCount) {
                string = str;
                maxCount = count;
            }
        }
        return string;
    }
}
