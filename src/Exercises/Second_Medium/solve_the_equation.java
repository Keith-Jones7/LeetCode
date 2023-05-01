package Exercises.Second_Medium;
//640 求解方程
public class solve_the_equation {
    public String solveEquation(String equation) {
        char[] chars = equation.toCharArray();
        int index = 0;
        while (chars[index] != '=') {
            index++;
        }
        int[] equation_left = coef(equation, chars, 0, index);
        int[] equation_right = coef(equation, chars, index + 1, chars.length);
        int val = equation_left[0] - equation_right[0];
        int constant = equation_right[1] - equation_left[1];
        if (val == 0 && constant == 0) {
            return "Infinite solution";
        }else if(val == 0) {
            return "No solution";
        }else {
            return "x=" + constant / val;
        }
    }
    public int[] coef(String str, char[] chars, int left, int right) {
        int[] coefs = new int[2];
        int sign = 1;
        int index = left;
        while (index < right) {
            if(chars[index] == '+' || chars[index] == '-') {
                if(chars[index] == '+') {
                    sign = 1;
                }else {
                    sign = -1;
                }
                index++;
            }else {
                int _coef = sign;
                int start = index;
                while (index < right && chars[index] != '+' && chars[index] != '-') {
                    index++;
                }
                int end = index;
                boolean isVar = false;
                if (chars[index - 1] == 'x') {
                    end = end - 1;
                    isVar = true;
                }
                if(start != end) {
                    _coef *= Integer.parseInt(str.substring(start, end));
                }
                if (isVar) {
                    coefs[0] += _coef;
                }else {
                    coefs[1] += _coef;
                }
            }
        }
        return coefs;
    }
}
