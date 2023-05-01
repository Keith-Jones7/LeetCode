package Exercises.First_Easy;

import java.util.Arrays;

//1051 高度检查器
public class height_checker {
    public int heightChecker(int[] heights) {
        int count = 0;
        int[] sorted = Arrays.copyOf(heights, heights.length);
        Arrays.sort(sorted);
        for(int i = 0; i < heights.length; i++) {
            if(heights[i] != sorted[i]) {
                count++;
            }
        }
        return count;
    }
}
