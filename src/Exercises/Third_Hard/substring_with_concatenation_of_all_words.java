package Exercises.Third_Hard;

import java.util.*;
//30 串联所有单词的子串
public class substring_with_concatenation_of_all_words {
    Map<String, Integer> map = new HashMap<>();
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        int window = words[0].length();
        int index = 0;
        for(String word : words) {
            if(!map.containsKey(word)) {
                map.put(word, index);
                index++;
            }
        }
        int[] count_words = new int[index];
        for(String word : words) {
            count_words[map.get(word)]++;
        }
        char[] chars = s.toCharArray();
        for(int i = 0; i < window; i++) {
            int[] count_window = Arrays.copyOf(count_words, count_words.length);
            int diff = 0;
            for(int j = i; j < i + window * words.length && j < chars.length - window + 1; j += window) {
                if(j >= chars.length) {
                    break;
                }
                char[] temp = new char[window];
                System.arraycopy(chars, j, temp, 0, j + window - j);
                String temp_str = String.valueOf(temp);
                if(map.containsKey(temp_str)) {
                    count_window[map.get(temp_str)]--;
                }else {
                    diff++;
                }
            }
            for (int j : count_window) {
                if (j != 0) {
                    diff++;
                }
            }
            if(diff == 0) {
                ans.add(i);
            }
            for(int j = i + window; j < chars.length - window * words.length + 1; j += window) {
                char[] temp = new char[window];
                if (j - (j - window) >= 0)
                    System.arraycopy(chars, j - window, temp, 0, j - (j - window));
                String temp_str = String.valueOf(temp);
                if(map.containsKey(temp_str)) {
                    if(count_window[map.get(temp_str)] == 0) {
                        diff++;
                    }else if(count_window[map.get(temp_str)] == -1){
                        diff--;
                    }
                    count_window[map.get(temp_str)]++;
                }else {
                    diff--;
                }
                int i1 = j + window * words.length - window;
                int i2 = j + window * words.length - i1;
                if (i2 >= 0)
                    System.arraycopy(chars, i1, temp, 0, i2);
                temp_str = String.valueOf(temp);
                if(map.containsKey(temp_str)) {
                    if(count_window[map.get(temp_str)] == 1) {
                        diff--;
                    }else if(count_window[map.get(temp_str)] == 0){
                        diff++;
                    }
                    count_window[map.get(temp_str)]--;
                }else {
                    diff++;
                }
                if(diff == 0) {
                    ans.add(j);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        String[] words = {"ababa","babab"};
        String s = "ababababab";
        substring_with_concatenation_of_all_words test = new substring_with_concatenation_of_all_words();
        test.findSubstring(s, words);
    }
}

