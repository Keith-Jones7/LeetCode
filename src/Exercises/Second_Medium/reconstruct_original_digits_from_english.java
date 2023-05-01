package Exercises.Second_Medium;

import java.util.*;

//423 从英文中重建数字
public class reconstruct_original_digits_from_english {
    public static String originalDigits(String s){
        Map<Character, Integer> map = new HashMap<>();
        char[] str = s.toCharArray();
        for(char ch : str){
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        int[] count = new int[10];
        count[0] = map.getOrDefault('z', 0);
        count[6] = map.getOrDefault('x', 0);
        count[2] = map.getOrDefault('w', 0);
        count[4] = map.getOrDefault('u', 0);
        count[8] = map.getOrDefault('g', 0);
        count[3] = map.getOrDefault('t', 0) - count[2] - count[8];
        count[7] = map.getOrDefault('s', 0) - count[6];
        count[5] = map.getOrDefault('v', 0) - count[7];
        count[1] = map.getOrDefault('o', 0)  - count[2] - count[4];
        count[9] = (map.getOrDefault('n', 0) - count[1] - count[7])/2;
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < count[i]; j ++){
                sb.append(i);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "owoztneoer";
        originalDigits(s);
    }
}
