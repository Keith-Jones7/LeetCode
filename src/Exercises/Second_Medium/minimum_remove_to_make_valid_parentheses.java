package Exercises.Second_Medium;

import java.util.Stack;

//1249 移除无效的括号
public class minimum_remove_to_make_valid_parentheses {
    public String minRemoveToMakeValid(String s){
        char[] chars = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        boolean[] add = new boolean[chars.length];
        for(int i = 0; i < chars.length; i++) {
            if(chars[i] == '(') {
                stack.push(i);
                add[i] = false;
            }else if(chars[i] == ')') {
                if(stack.empty()) {
                    add[i] = false;
                }else {
                    int index = stack.pop();
                    add[index] = true;
                    add[i] = true;
                }
            }else {
                add[i] = true;
            }
        }
        for(int i = 0; i < chars.length; i++) {
            if(add[i]) {
                stringBuilder.append(chars[i]);
            }
        }
        return stringBuilder.toString();
    }
}
