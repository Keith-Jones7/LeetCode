package Exercises.Second_Medium;
//754 到达终点数字
public class reach_a_number {
    public int reachNumber(int target) {
        target = (target > 0) ? target : -target;
        int index = 1;
        int sum = 1;
        while (true) {
            if (sum == target || ((sum > target) && (sum - target) % 2 == 0)) {
                return index;
            }
            index++;
            sum += index;
        }
    }
}
