package Exercises.First_Easy;

import java.util.*;

//1592 重新排列单词间的空格
public class rearrange_spaces_between_words {
    public String reorderSpaces(String text) {
        int len = text.length();
        String[] words = text.trim().split("\\s+");
        int cntSpace = len;
        for (String word : words) {
            cntSpace -= word.length();
        }
        int avg = words.length == 1 ? 0 : cntSpace / (words.length - 1);
        int cntWord = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (String word : words) {
            stringBuilder.append(word);
            cntWord++;
            if (cntWord == words.length) {
                stringBuilder.append(" ".repeat(cntSpace));
            }else {
                stringBuilder.append(" ".repeat(avg));
                cntSpace -= avg;
            }
        }
        return stringBuilder.toString();
    }
}
