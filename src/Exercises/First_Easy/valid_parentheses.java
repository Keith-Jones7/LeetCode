package Exercises.First_Easy;
//20 有效的括号
import java.util.Stack;

public class valid_parentheses {
    public static void main(String[] args) {
        valid_parentheses solution = new valid_parentheses();
        String s = "]";

        boolean result = solution.isValid(s);
        System.out.println(result);
    }

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        int left1 = 0, left2 = 0, left3 = 0, right1 = 0, right2 = 0, right3 = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                stack.push(s.charAt(i));
                left1 = left1 + ((s.charAt(i) == '(') ? 1 :0);
                left2 = left2 + ((s.charAt(i) == '[') ? 1 :0);
                left3 = left3 + ((s.charAt(i) == '{') ? 1 :0);
            }
            if (s.charAt(i) == ')') {
                right1++;
                if(!stack.isEmpty()&&stack.peek() == '(') {
                    stack.pop();
                    left1--;
                    right1--;
                }
            }
            if (s.charAt(i) == ']') {
                right2++;
                if(!stack.isEmpty()&&stack.peek() == '[') {
                    stack.pop();
                    left2--;
                    right2--;
                }
            }
            if (s.charAt(i) == '}') {
                right3++;
                if(!stack.isEmpty()&&stack.peek() == '{') {
                    stack.pop();
                    left3--;
                    right3--;
                }
            }
        }
        if(!(left1 == 0&&left2==0&&left3==0&&right1==0&&right2==0&&right3==0)) return false;
        return stack.isEmpty();
    }
    public boolean isValid2(String s)
    {
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') stack.push(s.charAt(i));
            if (s.charAt(i) == ')') {
                if(!stack.isEmpty()&&stack.peek() == '(') stack.pop();
                else return false;
            }
            if (s.charAt(i) == ']') {
                if(!stack.isEmpty()&&stack.peek() == '[') stack.pop();
                else return false;
            }
            if (s.charAt(i) == '}') {
                if(!stack.isEmpty()&&stack.peek() == '{') stack.pop();
                else return false;
            }
        }
        return stack.isEmpty();
    }
}