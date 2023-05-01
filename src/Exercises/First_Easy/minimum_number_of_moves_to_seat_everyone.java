package Exercises.First_Easy;

import java.util.Arrays;

//2037 使每位学生都有座位的最少移动次数
public class minimum_number_of_moves_to_seat_everyone {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int ans = 0;
        for (int i = 0; i < seats.length; i++) {
            ans += (Math.abs(seats[i] - students[i]));
        }
        return ans;
    }
}
