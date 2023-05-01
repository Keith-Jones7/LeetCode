package Exercises.Second_Medium;
//921 使括号有效的最少添加
public class minimum_add_to_make_parentheses_valid {
    public int minAddToMakeValid(String s) {
        char[] chars = s.toCharArray();
        int[] stack = new int[chars.length];
        int index = 0;
        for (char ch : chars) {
            if (index == 0) {
                stack[index++] = ch;
            }else {
                if (stack[index - 1] != ch && ch == ')') {
                    index--;
                    System.out.println(ch);
                }else {
                    stack[index++] = ch;
                }
            }
        }
        return index;
    }
}
