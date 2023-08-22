package Exercises.Third_Hard;
//849 到最近的人的最大距离
public class maximize_distance_to_closest_person {
    public int maxDistToClosest(int[] seats) {
        int max = 0;
        int pre = -1, index = 0, len = seats.length;
        while (index < len) {
            if (seats[index] == 1) {
                if (pre == -1) {
                    max = index - pre - 1;
                }else {
                    max = Math.max(max, (index - pre) / 2);
                }
                pre = index;
            }
            index++;
        }
        max = Math.max(max, index - pre - 1);
        return max;
    }
}
