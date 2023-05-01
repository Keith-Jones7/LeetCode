package Exercises.Second_Medium;

import java.util.Stack;

//71 简化路径
public class simplify_path {
    public String simplifyPath(String path){
        String[] paths = path.split("/");
        Stack<String> stack = new Stack<>();
        for(String str : paths) {
            if(str.equals("..")){
                if(!stack.empty()){
                    stack.pop();
                }
            }
            else {
                if (!str.equals(".") && str.length() != 0) {
                    stack.push(str);
                }
            }
        }
        if(stack.empty()){
            return "/";
        }
        int size = stack.size();
        String[] new_paths = new String[size];
        for(int i = 0; i < size; i++){
            new_paths[i] = "/" + stack.pop();
        }
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i < size; i++){
            ans.append(new_paths[size - 1 - i]);
        }
        return ans.toString();
    }

    public static void main(String[] args) {
        simplify_path test = new simplify_path();
        String path = "/home/";
        test.simplifyPath(path);
    }
}
