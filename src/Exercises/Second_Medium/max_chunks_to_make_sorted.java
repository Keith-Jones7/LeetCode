package Exercises.Second_Medium;

import java.util.Stack;

//769 最多能完成排序的块
public class max_chunks_to_make_sorted {
    public int maxChunksToSorted(int[] arr) {
        int ans = 0, max = -1;
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
            if (max == i) {
                ans++;
            }
        }
        return ans;
    }
}
