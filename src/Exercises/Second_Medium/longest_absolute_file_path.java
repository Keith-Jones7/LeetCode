package Exercises.Second_Medium;

import java.util.*;

//388 文件的最长绝对路径
public class longest_absolute_file_path {
    public int lengthLongestPath(String input) {
        String[] splits = input.split("\n");
        Stack<Integer> stack = new Stack<>();
        int res = 0;
        for(String split : splits){
            int k = 0;
            //通过'\t'个数以及stack大小，先判断是哪一层的
            while(split.charAt(k) == '\t') {
                k++;
            }
            while(stack.size() > k) {
                stack.pop();
            }
            int len = split.length() - k;
            if(!stack.empty()) {
                len += stack.peek();
            }
            if(split.contains(".")) {
                res = Math.max(len, res);
            }else{
                stack.push(len + 1);
            }
        }
        return res;
    }
}
