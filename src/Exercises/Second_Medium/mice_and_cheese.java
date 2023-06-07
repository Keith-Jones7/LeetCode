package Exercises.Second_Medium;

import java.util.Arrays;

//2611 老鼠和奶酪
public class mice_and_cheese {
    public int miceAndCheese(int[] reward1, int[] reward2, int k) {
        int len = reward1.length, sumReward = 0;
        for (int i = 0; i < len; i++) {
            reward1[i] -= reward2[i];
            sumReward += reward2[i];
        }
        Arrays.sort(reward1);
        for (int i = 0; i < k; i++) {
            sumReward += reward1[len - 1 - i];
        }
        return sumReward;
    }
}
