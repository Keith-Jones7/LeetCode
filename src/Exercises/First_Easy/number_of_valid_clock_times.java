package Exercises.First_Easy;
import java.util.*;
//6208 有效时间的数目
public class number_of_valid_clock_times {
    public int countTime(String time) {
        int count1 = 1, count2 = 1;
        char ch1 = time.charAt(0);
        char ch2 = time.charAt(1);
        if (ch1 == '?') {
            if (ch2 == '?') {
                count1 = 24;
            }else {
                if (ch2 - '0' < 4) {
                    count1 = 3;
                }else {
                    count1 = 2;
                }
            }
        }else {
            if (ch2 == '?') {
                if (ch1 - '0' < 2) {
                    count1 = 10;
                }else {
                    count1 = 4;
                }
            }
        }
        char ch3 = time.charAt(3);
        char ch4 = time.charAt(4);
        if (ch3 == '?') {
            if (ch4 == '?') {
                count2 = 60;
            }else {
                count2 = 6;
            }
        }else {
            if (ch4 == '?') {
                count2 = 10;
            }
        }
        return count1 * count2;
    }

}
