package Exercises.Second_Medium;
import java.util.*;
//1405 最长快乐字符串

public class longest_happy_string {
    public String longestDiverseString(int a, int b, int c){
        StringBuilder stringBuilder = new StringBuilder();
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((x, y) -> (y[0] - x[0]));
        if(a > 0){
            priorityQueue.offer(new int[]{a, 0});
        }
        if(b > 0){
            priorityQueue.offer(new int[]{b, 1});
        }
        if(c > 0){
            priorityQueue.offer(new int[]{c, 2});
        }
        int append = -1;
        while (!priorityQueue.isEmpty()){
            int[] add1 = priorityQueue.poll();
            if(add1[1] == append){
                if(priorityQueue.isEmpty()){
                    break;
                }
                int[] add2 = priorityQueue.poll();
                int count = Math.min(1, add2[0]);
                stringBuilder.append((char) ('a' + add2[1]));
                add2[0] = add2[0] - count;
                append = add2[1];
                if(add2[0] > 0){
                    priorityQueue.offer(add2);
                }
                priorityQueue.offer(add1);
            }
            else {
                int count = Math.min(2, add1[0]);
                stringBuilder.append(String.valueOf((char) ('a' + add1[1])).repeat(Math.max(0, count)));
                add1[0] = add1[0] - count;
                append = add1[1];
                if(add1[0] > 0){
                    priorityQueue.offer(add1);
                }
            }

        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        longest_happy_string test = new longest_happy_string();
        test.longestDiverseString(1, 1, 7);
    }
}
