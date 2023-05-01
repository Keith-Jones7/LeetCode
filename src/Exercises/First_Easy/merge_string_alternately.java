package Exercises.First_Easy;
//1768 交替合并字符串
public class merge_string_alternately {
    public String mergeAlternately(String word1, String word2) {
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();
        int index1 = 0, index2 = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (index1 < chars1.length && index2 < chars2.length) {
            stringBuilder.append(chars1[index1++]);
            stringBuilder.append(chars2[index2++]);
        }
        while (index1 < chars1.length) {
            stringBuilder.append(chars1[index1++]);
        }
        while (index2 < chars2.length) {
            stringBuilder.append(chars2[index2++]);
        }
        return stringBuilder.toString();
    }
}
