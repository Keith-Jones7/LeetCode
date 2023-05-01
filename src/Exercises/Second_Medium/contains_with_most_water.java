package Exercises.Second_Medium;
//11 盛水最多的容器
public class contains_with_most_water {
    public int maxArea(int[] height) {
        int left = 0, right = height.length - 1;
        int max = 0;
        while (left < right) {
            int min = 0, interval = right - left;
            if(height[left] < height[right]) {
                min = height[left];
                left++;
            }
            else {
                min = height[right];
                right--;
            }
            max = Math.max(max, min * interval);
        }
        return max;
    }
}
