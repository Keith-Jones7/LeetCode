package Exercises.Second_Medium;

//150 逆波兰表达式求值
public class evaluate_reverse_polish_notation {
    public int evalRPN(String[] tokens) {
        int[] stack = new int[tokens.length + 2];
        int index = 0;
        stack[index++] = 0;
        stack[index++] = 0;
        for(String token : tokens) {
            int num1 = stack[--index];
            int num2 = stack[--index];
            System.out.println(num1 + "   " + num2);
            switch (token) {
                case "+" -> stack[index++] = (num2 + num1);
                case "-" -> stack[index++] = (num2 - num1);
                case "*" -> stack[index++] = (num2 * num1);
                case "/" -> stack[index++] = (num2 / num1);
                default -> {
                    stack[index++] = num2;
                    stack[index++] = num1;
                    stack[index++] = Integer.parseInt(token);
                }
            }
        }
        return stack[index];
    }
}
