package Exercises.First_Easy;
//1732 找到最高海拔
public class find_the_highest_altitude {
    public int largestAltitude(int[] gain) {
        int max = 0;
        int sum = 0;
        for (int j : gain) {
            sum += j;
            max = Math.max(max, sum);
        }
        return max;
    }
}
