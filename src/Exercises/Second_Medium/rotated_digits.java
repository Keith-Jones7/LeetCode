package Exercises.Second_Medium;

import java.util.*;

//788 旋转数字
public class rotated_digits {
    public int rotatedDigits(int n) {
        Set<Integer> rotated = new HashSet<>();
        rotated.add(2);
        rotated.add(5);
        rotated.add(6);
        rotated.add(9);
        Set<Integer> invalid = new HashSet<>();
        invalid.add(3);
        invalid.add(4);
        invalid.add(7);
        int cnt = 0;
        for (int i = 1; i <= n; i++) {
            boolean flag = false;
            for (char ch : Integer.toString(i).toCharArray()) {
                if (invalid.contains(ch - '0')) {
                    flag = false;
                    break;
                }
                if (rotated.contains(ch - '0')) {
                    flag = true;
                }
            }
            if (flag) {
                cnt++;
            }
        }
        return cnt;
    }
}
