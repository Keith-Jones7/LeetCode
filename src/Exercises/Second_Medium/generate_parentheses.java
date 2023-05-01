package Exercises.Second_Medium;
import java.util.*;
//22 括号生成
public class generate_parentheses {
    List<String> list = new ArrayList<>();
    StringBuilder stringBuilder = new StringBuilder();
    public List<String> generateParenthesis(int n) {
        getLists(n, 0, 0);
        return list;
    }
    public void getLists(int n, int left, int right) {
        if(left > n || right > n) {
            return;
        }
        if(left == n && left == right) {
            list.add(stringBuilder.toString());
            return;
        }
        if(left < n) {
            stringBuilder.append('(');
            getLists(n, left + 1, right);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
        if(left > right) {
            stringBuilder.append(')');
            getLists(n, left, right + 1);
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
