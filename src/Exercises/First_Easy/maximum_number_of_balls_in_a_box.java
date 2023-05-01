package Exercises.First_Easy;
//1742 盒子中小球的最大数量
public class maximum_number_of_balls_in_a_box {
    public int countBalls(int lowLimit, int highLimit) {
        int[] countMap = new int[46];
        int index = 0, countFirst = lowLimit;
        for (; countFirst > 0; countFirst /= 10) {
            index += (countFirst % 10);
        }
        countMap[index++]++;
        for (int i = lowLimit + 1; i <= highLimit; i++) {
            int count = i - 1;
            for (; count % 10 == 9; count /= 10) {
                index -= 9;
            }
            countMap[index++]++;
        }
        int ans = 0;
        for (int num : countMap) {
            ans = Math.max(ans, num);
        }
        return ans;
    }
}
