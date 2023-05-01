package Exercises.First_Easy;
//1455 检查单词是否为句中其他单词的前缀
public class check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence {
    public int isPrefixOfWord(String sentence, String searchWord) {
        char[] chars_sentence = sentence.toCharArray();
        char[] chars_word = searchWord.toCharArray();
        int index1 = 0, index2 = 0, index3 = 1;
        while (index1 < chars_sentence.length) {
            if (chars_sentence[index1] == ' ') {
                index1++;
                index3++;
                index2 = 0;
                continue;
            }
            if (chars_sentence[index1] != chars_word[index2]) {
                while (index1 < chars_sentence.length && chars_sentence[index1] != ' ') {
                    index1++;
                }
                index2 = 0;
                continue;
            }
            index1++;
            index2++;
            if (index2 == chars_word.length) {
                return index3;
            }
        }
        return -1;
    }
}
