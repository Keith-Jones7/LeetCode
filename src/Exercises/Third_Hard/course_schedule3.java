package Exercises.Third_Hard;
import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class course_schedule3 {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses, Comparator.comparingInt(o -> o[1]));
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(((o1, o2) -> (o2 - o1)));
        int curTime = 0;
        for (int[] course : courses) {
            int duration = course[0];
            int lastDay = course[1];
            if (curTime + duration <= lastDay) {
                curTime += duration;
                priorityQueue.add(duration);
            }else {
                if (!priorityQueue.isEmpty() && priorityQueue.peek() > duration) {
                    curTime += (duration - priorityQueue.poll());
                    priorityQueue.add(duration);
                }
            }
        }
        return priorityQueue.size();
    }
}
