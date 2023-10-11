package Exercises.Second_Medium;
import java.util.*;
//2512 奖励最顶尖的K名学生
public class reward_top_k_students {
    public List<Integer> topStudents(String[] positive_feedback,
                                     String[] negative_feedback,
                                     String[] report,
                                     int[] student_id,
                                     int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>((o1, o2) -> {
            if (o1[1] == o2[1]) {
                return o1[0] - o2[0];
            }
            return o2[1] - o1[1];
        });
        Set<String> positiveSet = new HashSet<>(Arrays.asList(positive_feedback));
        Set<String> negativeSet = new HashSet<>(Arrays.asList(negative_feedback));
        for (int i = 0; i < report.length; i++) {
            int id = student_id[i];
            String[] splits = report[i].split(" ");
            int score = 0;
            for (String str : splits) {
                if (positiveSet.contains(str)) {
                    score = score + 3;
                }else if (negativeSet.contains(str)) {
                    score = score - 1;
                }
            }
            priorityQueue.add(new int[]{id, score});
        }
        List<Integer> list = new ArrayList<>();
        for  (int i = 0; i < k; i++) {
            int[] arr = priorityQueue.poll();
            assert arr!= null;
            list.add(arr[0]);
        }
        return list;
    }
}
