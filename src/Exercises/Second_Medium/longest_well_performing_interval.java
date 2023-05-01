package Exercises.Second_Medium;
//1124 表现良好的最长时间段
public class longest_well_performing_interval {
    public int longestWPI(int[] hours) {
        int len = hours.length;
        int[] stack = new int[len + 1];
        int[] preSum = new int[len + 1];
        int index = 0;
        stack[index++] = 0;
        for (int i = 0; i < len; i++) {
            hours[i] = hours[i] > 8 ? 1 : -1;
            preSum[i + 1] = preSum[i] + hours[i];
            if (preSum[i] < preSum[stack[index - 1]]) {
                stack[index++] = i;
            }
        }
        int ans = 0;
        for (int i = len; i > 0; i--) {
            while (index > 0 && preSum[i] > preSum[stack[index - 1]]) {
                ans = Math.max(i - stack[index - 1], ans);
                index--;
            }
        }
        return ans;
    }
}
