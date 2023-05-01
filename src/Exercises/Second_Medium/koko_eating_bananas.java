package Exercises.Second_Medium;

import java.util.Arrays;

//875 爱吃香蕉的珂珂
public class koko_eating_bananas {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1, right = (int)1e9;
        while (left < right) {
            int mid = left + (right - left) / 2;
            int time = 0;
            for(int pile : piles) {
                time += (pile + mid - 1) / mid;
            }
            if(time <= h) {
                right = mid;
            }else {
                left = mid + 1;
            }
        }
        return left;
    }
}
