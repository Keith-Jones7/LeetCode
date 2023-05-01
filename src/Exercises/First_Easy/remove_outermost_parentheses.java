package Exercises.First_Easy;
//1021 删除最外层的括号
public class remove_outermost_parentheses {
    public String removeOuterParentheses(String s) {
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        boolean flag = false;
        int count = 0;
        for(char ch : chars) {
            if(!flag && ch == '(') {
                flag = true;
                continue;
            }
            if(flag && ch == ')' && count == 0) {
                flag = false;
                continue;
            }
            if(ch == '(') {
                count++;
            }else {
                count--;
            }
            stringBuilder.append(ch);
        }
        return stringBuilder.toString();
    }
}
