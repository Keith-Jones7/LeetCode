package Exercises.Second_Medium;
//1813 句子相似性
public class sentence_similarity_3 {
    public boolean areSentencesSimilar(String sentence1, String sentence2) {
        if (sentence1.length() > sentence2.length()) {
            return areSentencesSimilar(sentence2, sentence1);
        }
        String[] strs1 = sentence1.split(" ");
        String[] strs2 = sentence2.split(" ");
        int left1 = 0, right1 = strs1.length - 1;
        int left2 = 0, right2 = strs2.length - 1;
        while (left1 < right1 && left2 < right2) {
            if (strs1[left1].equals(strs2[left2])) {
                left1++;
                left2++;
            }
            else if (strs1[right1].equals(strs2[right2])) {
                right1--;
                right2--;
            }else {
                return false;
            }
        }
        return left1 >= right1;
    }
}
