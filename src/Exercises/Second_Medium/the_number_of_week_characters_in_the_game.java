package Exercises.Second_Medium;

import java.util.Arrays;

//1996 游戏中弱角色的数量
public class the_number_of_week_characters_in_the_game {
    public int numberOfWeekCharacters(int[][] properties){
        Arrays.sort(properties, (x, y) -> (x[0] == y[0] ? y[1] - x[1] : y[0] - x[0]));
        int count = 0;
        int max_defend = 0;
        for (int[] property : properties) {
            if (max_defend > property[1]) {
                count++;
            } else {
                max_defend = property[1];
            }
        }
        return count;
    }
}
