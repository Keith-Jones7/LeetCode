package Exercises.First_Easy;
//1832 判断句子是否为全字母句
public class check_if_the_sentence_is_pangram {
    public boolean checkIfPangram(String sentence) {
        boolean[] judges = new boolean[26];
        for (char ch: sentence.toCharArray()) {
            judges[ch - 'a'] = true;
        }
        boolean ans = true;
        for (boolean judge : judges) {
            ans &= judge;
        }
        return ans;
    }
}
