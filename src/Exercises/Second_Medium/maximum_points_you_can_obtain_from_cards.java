package Exercises.Second_Medium;
// 1423 可获得的最大点数
public class maximum_points_you_can_obtain_from_cards {
    public int maxScore(int[] cardPoints, int k) {
        int left = 0, right = 0;
        int len = cardPoints.length, size = len - k;
        int sum = 0;
        int s = 0;
        while (right < size) {
            int val = cardPoints[right++];
            sum += val;
            s += val;
        }
        int min = sum;
        while (right < len) {
            sum -= cardPoints[left++];
            int val = cardPoints[right++];
            sum += val;
            s += val;
            min = Math.min(min, sum);
        }
        return s - min;
    }
}
