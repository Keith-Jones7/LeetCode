package Exercises.Second_Medium;
import java.util.*;
//1094 拼车
public class car_pooling {
    public boolean carPooling(int[][] trips, int capacity) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(Comparator.comparingInt(o -> o[0]));
        Arrays.sort(trips, (Comparator.comparingInt(o -> o[1])));
        int tempSize = 0;
        for (int[] trip : trips) {
            int size = trip[0];
            int from = trip[1];
            int to = trip[2];
            while (!priorityQueue.isEmpty() && priorityQueue.peek()[0] <= from) {
                int[] num = priorityQueue.poll();
                tempSize -= num[1];
            }
            priorityQueue.add(new int[]{to, size});
            tempSize += size;
            if (tempSize > capacity) {
                return false;
            }
        }
        return true;
    }
}
