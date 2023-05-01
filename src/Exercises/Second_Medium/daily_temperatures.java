package Exercises.Second_Medium;
import java.util.Stack;
//739 每日温度
public class daily_temperatures {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int day = temperatures.length;
        int[] ans = new int[day];
        for(int i = day - 1; i >= 0; i--) {
            while (!stack.empty()) {
                int index = stack.peek();
                if(temperatures[i] >= temperatures[index]) {
                    stack.pop();
                }else {
                    break;
                }
            }
            if(stack.empty()) {
                ans[i] = 0;
            }else {
                ans[i] = stack.peek() - i;
            }
            stack.push(i);
        }
        return ans;
    }
}
