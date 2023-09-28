package Exercises.Third_Hard;
import java.util.*;
//2251 花期内花的数目
public class number_of_flowers_in_full_bloom {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] cnt = new int[people.length];
        int[] start = new int[flowers.length];
        int[] end = new int[flowers.length];
        for (int i = 0; i < flowers.length; i++) {
            start[i] = flowers[i][0];
            end[i] = flowers[i][1];
        }
        Arrays.sort(start);
        Arrays.sort(end);
        for (int i = 0; i < people.length; i++) {
            int cnt1 = binarySearch(start, people[i] + 1);
            int cnt2 = binarySearch(end, people[i]);
            if (cnt1 < 0) {
                cnt1 = (-cnt1 - 1);
            }
            if (cnt2 < 0) {
                cnt2 = (-cnt2 - 1);
            }
            cnt[i] = cnt1 - cnt2;
        }
        return cnt;
    }

    public int binarySearch(int[] sorted, int target) {
        int left = 0, right = sorted.length - 1;
        while (left < right) {
            int mid = (right - left) / 2 + left;
            if (sorted[mid] >= target) {
                right = mid + 1;
            }else {
                left = mid;
            }
        }
        return left;
    }
}
