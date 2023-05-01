package Exercises.Third_Hard;
//798 得分最高的最小轮调
public class smallest_rotation_with_highest_score {
    public int bestRotation(int[] nums) {
        int len = nums.length;
        int[] diff = new int[len];
        for(int i = 0; i < len; i++) {
            diff[(i + 1 - nums[i] + len) % len]--;
            diff[(i + 1) % len]++;
        }
        int ans = 0, max = diff[0], sum = 0;
        for(int i = 0; i < nums.length; i++) {
            sum += diff[i];
            if(max < sum) {
                max = sum;
                ans = i;
            }
        }
        return ans;
    }
}
