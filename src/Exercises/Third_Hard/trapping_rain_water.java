package Exercises.Third_Hard;
//42 接雨水
public class trapping_rain_water {
    public int trap(int[] height) {
        int length = height.length;
        int count = 0;
        int[] leftmax = new int[length];
        int[] rightmax = new int[length];
        for(int i = 0; i < length; i++) {
            if(i == 0) {
                leftmax[i] = 0;
                rightmax[length - 1 - i] = 0;
            }
            else {
                leftmax[i] = Math.max(height[i - 1], leftmax[i - 1]);
                rightmax[length - 1 - i] = Math.max(height[length - i], rightmax[length - i]);
            }
        }
        for(int i = 0; i < length;i++ ) {
            count = count + Math.max(0, Math.min(leftmax[i], rightmax[i]) - height[i]);
        }
        return count;
    }
}
