package Exercises.First_Easy;
//1678 设计Goal解析器
public class goal_parser_interpretation {
    public String interpret(String command) {
        StringBuilder stringBuilder = new StringBuilder();
        int gap = 0;
        for (char ch : command.toCharArray()) {
            if (ch == 'G') {
                stringBuilder.append('G');
            }else if (ch == '(') {
                gap = 0;
            }else if (ch == ')') {
                if (gap == 0) {
                    stringBuilder.append('o');
                }
            }else {
                stringBuilder.append(ch);
                gap++;
            }
        }
        return stringBuilder.toString();
    }
}
