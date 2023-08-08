package Exercises.First_Easy;
//
public class circular_sentence {
    public boolean isCircularSentence(String sentence) {
        int len = sentence.length();
        for (int i = 1; i < len - 1; i++) {
            if (sentence.charAt(i) == ' ' && !(sentence.charAt(i - 1) == sentence.charAt(i + 1))) {
                return false;
            }
        }
        return sentence.charAt(0) == sentence.charAt(len - 1);
    }
}
