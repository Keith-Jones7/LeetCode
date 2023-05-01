package Exercises.First_Easy;

import java.util.HashMap;
import java.util.Map;

//13 罗马数字转整数
public class roman_to_integer {
    public int romanToInt(String s) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        char[] chars = s.toCharArray();
        int num = map.get(chars[0]);
        int pre_num = num;
        for(int i = 1; i < chars.length; i++) {
            int cur_num = map.get(chars[i]);
            if(cur_num > pre_num) {
                num -= (pre_num * 2);
            }
            num += cur_num;
            pre_num = cur_num;
        }
        return num;
    }
}
