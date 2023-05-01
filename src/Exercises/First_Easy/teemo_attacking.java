package Exercises.First_Easy;
//495 提莫攻击
public class teemo_attacking {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        int total_Poison_time = 0;
        for (int i = 0; i < timeSeries.length - 1; i++) {
            total_Poison_time += Math.min(duration, timeSeries[i + 1] - timeSeries[i]);
        }
        return total_Poison_time + duration;
    }
}
