package Exercises.Second_Medium;
import java.util.*;

public class online_stock_span {
}
class StockSpanner {
    Stack<Integer> stack;
    Stack<Integer> index;
    int count_pop;
    public StockSpanner() {
        stack = new Stack<>();
        index = new Stack<>();
    }

    public int next(int price) {
        count_pop = 1;
        while (!stack.empty() && stack.peek() <= price) {
            stack.pop();
            count_pop += index.pop();
        }
        stack.push(price);
        index.push(count_pop);
        return count_pop;
    }
}
