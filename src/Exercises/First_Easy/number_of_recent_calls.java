package Exercises.First_Easy;
import java.util.*;
//933 最近的请求次数
public class number_of_recent_calls {
    Queue<Integer> queue;
    public number_of_recent_calls() {
        queue = new ArrayDeque<>();
    }
    public int pint(int t) {
        queue.offer(t);
        while (!queue.isEmpty() && (queue.peek() + 3000 < t)) {
            queue.poll();
        }
        return queue.size();
    }
}
