package Exercises.Second_Medium;
//2024 考试的最大困扰度

public class maximize_the_confusion_of_an_exam {
    public int maxConsecutiveAnswers(String answerKey, int k) {
        char[] chars = answerKey.toCharArray();
        return Math.max(getMaxLength(chars, 'T', k), getMaxLength(chars, 'F', k));
    }
    public int getMaxLength(char[] chars, char c, int k) {
        int left = 0;
        int right = 0;
        int count = 0;
        int maxLen = 0;
        while (right < chars.length) {
            if(chars[right] == c) {
                count++;
            }
            right++;
            while (count > k) {
                if(chars[left++] == c) {
                    count--;
                }
            }
            maxLen = Math.max(maxLen, right - left - 1);
        }
        return maxLen;
    }
}
