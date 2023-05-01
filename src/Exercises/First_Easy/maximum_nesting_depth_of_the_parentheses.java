package Exercises.First_Easy;
//1614 括号的最大嵌套深度
public class maximum_nesting_depth_of_the_parentheses {
    public int maxDepth(String s){
        char[] chars = s.toCharArray();
        int max_depth = 0;
        int depth = 0;
        for(char ch: chars){
            if(ch == '('){
                depth++;
            }
            if(ch == ')'){
                depth--;
            }
            max_depth = Math.max(depth, max_depth);
        }
        return max_depth;
    }
}
