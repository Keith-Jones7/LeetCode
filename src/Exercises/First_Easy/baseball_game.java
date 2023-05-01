package Exercises.First_Easy;

import java.util.Stack;

//682 棒球比赛
public class baseball_game {
    public int calPoints(String[] ops) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        for (String op : ops) {
            switch (op) {
                case "+" -> {
                    int peek = stack.pop();
                    int se_peek = stack.pop();
                    int score = peek + se_peek;
                    stack.push(se_peek);
                    stack.push(peek);
                    stack.push(score);
                    sum += score;
                }
                case "D" -> {
                    int score = stack.peek() * 2;
                    stack.push(score);
                    sum += score;
                }
                case "C" -> {
                    int score = stack.pop();
                    sum -= score;
                }
                default -> {
                    int score = Integer.parseInt(op);
                    stack.push(score);
                    sum += score;
                }
            }
        }
        return sum;
    }
}
