package Exercises.Second_Medium;

import java.util.*;

//1705 吃苹果的最大数目
public class maximum_number_of_eaten_apples {
    public int eatenApples(int[] apples, int[] days){
        int max_day = 0, day = days.length;
        int[][] sort_apple = new int[day][2];
        for(int i = 0; i < day; i++){
            sort_apple[i][0] = i;
            sort_apple[i][1] = days[i];
            max_day = Math.max(max_day, i + days[i]);
        }
        Arrays.sort(sort_apple, ((nums1, nums2) -> nums1[0] + nums1[1] - nums2[0] - nums2[1]));
        max_day = sort_apple[day - 1][0] + sort_apple[day - 1][1];
        int[] eatenApple = new int[max_day];
        for(int[] first_rot : sort_apple){
            int current_day = first_rot[0];
            int current_period = first_rot[1];
            int current_apple = apples[current_day];
            for(int i = current_day; i < current_day + current_period; i++){
                if(current_apple > 0 && eatenApple[i] <= 0){
                    eatenApple[i]++;
                    current_apple--;
                }
            }
        }
        int sum_apple = 0;
        for(int apple : eatenApple){
            if(apple > 0){
                sum_apple++;
            }
        }
        return sum_apple;
    }

    public static void main(String[] args) {
        maximum_number_of_eaten_apples mn = new maximum_number_of_eaten_apples();
        int[] apples = {2,1,10};
        int[] days = {2,10,1};
        mn.eatenApples(apples, days);
    }
}
