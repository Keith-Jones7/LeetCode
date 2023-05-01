package Exercises.Second_Medium;

import java.util.Arrays;

//621 任务调度器
public class task_scheduler {
    public int leastInterval(char[] tasks, int n) {
        if(n == 0) {
            return tasks.length;
        }
        int[] count = new int[26];
        for(char task : tasks) {
            count[task - 'A']++;
        }
        Arrays.sort(count);
        int maxCount = 0;
        for(int i = 25; i >= 0; i--) {
            if(count[i] != count[25]) {
                break;
            }
            maxCount++;
        }
        return Math.max((count[25] - 1) * (n + 1) + maxCount , tasks.length);
    }

}
