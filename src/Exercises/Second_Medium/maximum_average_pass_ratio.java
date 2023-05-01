package Exercises.Second_Medium;
import java.util.*;
public class maximum_average_pass_ratio {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            long val1 = (long) o2[1] * o2[1] * (o1[1] - o1[0]);
            long val2 = (long) o1[1] * o1[1] * (o2[1] - o2[0]);
            return Long.compare(val2, val1);
        });

        priorityQueue.addAll(Arrays.asList(classes));

        for (int i = 0; i < extraStudents; i++) {
            int[] arr = priorityQueue.poll();
            assert arr != null;
            arr[0]++;
            arr[1]++;
            priorityQueue.add(arr);

        }

        double ans = 0;
        for (int[] arr : priorityQueue) {
            ans += ((arr[0] + 0.0) / (arr[1]));
        }
        return ans / classes.length;
    }
}
