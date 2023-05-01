package Exercises.First_Easy;
//1662 检查两个字符串数组是否相等
public class check_if_two_string_arrays_are_equivalent {
    public boolean arrayStringAreEqual(String[] word1, String[] word2) {
        int index1 = 0, index2 = 0;
        int i = 0, j = 0;
        while (i < word1.length && j < word2.length) {
            if (index1 == word1[i].length() || index2 == word2[i].length()) {
                if (index1 == word1[i].length()) {
                    index1 = 0;
                    i++;
                }
                if (index2 == word2[j].length()) {
                    index2 = 0;
                    j++;
                }
                continue;
            }
            if (word1[i].charAt(index1) != word2[j].charAt(index2)) {
                return false;
            }
            index1++;
            index2++;
        }
        return i == word1.length && j == word2.length && index1 == word1[i - 1].length() && index2 == word2[j - 1].length();
    }
    public boolean arrayStringAreEqual2(String[] word1, String[] word2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (String str : word1) {
            stringBuilder1.append(str);
        }
        for (String str : word2) {
            stringBuilder2.append(str);
        }
        return stringBuilder1.toString().equals(stringBuilder2.toString());
    }
}
