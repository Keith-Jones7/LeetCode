package Exercises.First_Easy;
//1422 分割字符串的最大得分
public class maximum_score_after_splitting_a_string {
    public int maxScore(String s) {
        char[] chars = s.toCharArray();
        int len = chars.length;
        int[] score_0 = new int[len];
        int[] score_1 = new int[len];
        if (chars[len - 1] == '1') {
            score_1[len - 1]++;
        }
        for (int i = 0; i < len - 1; i++) {
            if(chars[i] == '0') {
                if (i > 0) {
                    score_0[i] = score_0[i - 1] + 1;
                }else {
                    score_0[i] = 1;
                }
            }else {
                if (i > 0) {
                    score_0[i] = score_0[i - 1];
                }else {
                    score_0[i] = 0;
                }
            }
            if(chars[len - 1 - i] == '1') {
                score_1[len - 2 - i] = score_1[len - 1 - i] + 1;
            }else {
                score_1[len - 2 - i] = score_1[len - 1 - i];
            }
        }
        int max = -1;
        for (int i = 0; i < len; i++) {
            max = Math.max(max, score_0[i] + score_1[i]);
        }
        return max;
    }
}
