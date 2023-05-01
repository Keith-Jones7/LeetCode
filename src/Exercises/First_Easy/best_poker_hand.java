package Exercises.First_Easy;

import java.util.Arrays;

//2347 最好的扑克手牌
public class best_poker_hand {
    public String bestHand(int[] ranks, char[] suits) {
        boolean flag = true;
        char ch = suits[0];
        for (char suit : suits) {
            if (suit != ch) {
                flag = false;
                break;
            }
        }
        if (flag) {
            return "Flush";
        }
        int[] count = new int[13];
        for (int rank : ranks) {
            count[rank - 1]++;
        }
        Arrays.sort(count);
        for (int i = 12; i >= 0; i--) {
            if (count[i] > 2) {
                return "Three of a Kind";
            }
            if (count[i] > 1) {
                return "Pair";
            }
        }
        return "High Card";
    }
}
