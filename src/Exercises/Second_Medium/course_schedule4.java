package Exercises.Second_Medium;
import java.util.*;
//1462 课程表4
public class course_schedule4 {
    public List<Boolean> checkIfPrerequisite(int numCourses, int[][] prerequisites, int[][] queries) {
        boolean[][] dist = new boolean[numCourses][numCourses];
        for (int[] prerequisite : prerequisites) {
            int out = prerequisite[0];
            int in = prerequisite[1];
            dist[out][in] = true;
        }
        for (int i = 0; i < numCourses; i++) {
            for (int j = 0; j < numCourses; j++) {
                for (int k = 0; k < numCourses; k++) {
                    dist[k][j] |= (dist[k][i] && dist[i][j]);
                }
            }
        }
        List<Boolean> list = new ArrayList<>();
        for (int[] query : queries) {
            int out = query[0];
            int in = query[1];
            System.out.println(dist[out][in]);
            list.add(dist[out][in]);
        }
        return list;
    }
}
