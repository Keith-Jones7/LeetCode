package Exercises.First_Easy;
import java.util.*;
//1450 在既定时间内做作业的学生人数
public class number_of_students_doing_homework_at_a_given_time {
    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
        int count = 0;
        for (int i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                count++;
            }
        }
        return count;
    }
}

