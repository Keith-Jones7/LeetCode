package Exercises.Second_Medium;
import java.util.*;
//241 为运算表达式设计优先级
public class different_ways_to_add_parentheses {
    public List<Integer> diffWaysToCompute(String expression) {
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);
            if(c == '+' || c == '-' || c == '*') {
                List<Integer> list1 = diffWaysToCompute(expression.substring(0, i));
                List<Integer> list2 = diffWaysToCompute(expression.substring(i + 1));
                for(int num1 : list1) {
                    for(int num2 : list2) {
                        if(c == '+') {
                            list.add(num1 + num2);
                        }else if(c == '-') {
                            list.add(num1 - num2);
                        }else {
                            list.add(num1 * num2);
                        }
                    }
                }
            }
        }
        if(list.isEmpty()) {
            list.add(Integer.parseInt(expression));
        }
        return list;
    }


}
