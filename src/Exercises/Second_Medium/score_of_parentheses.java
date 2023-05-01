package Exercises.Second_Medium;
//856 括号的分数
public class score_of_parentheses {
    public int scoreOfParentheses(String s) {
        char[] chars = s.toCharArray();
        int index = -1, score = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == '(') {
                index++;
            }else {
                if (chars[i - 1] == '(') {
                    score += (1 << index);
                }
                index--;
            }
        }
        return score;
    }
}
