package Exercises.First_Easy;
//1668 最大重复子字符串
public class maximum_repeating_substring {
    public int maxRepeating(String sequence, String word) {
        int index = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (; index < sequence.length() / word.length(); index++) {
            stringBuilder.append(word);
            if (!sequence.contains(stringBuilder.toString())) {
                break;
            }
        }
        return index;
    }
}
