package Exercises.Second_Medium;
import java.util.*;
//12 整数转罗马数字
public class integer_to_roman {
    Map<Integer, String> map;
    public String intToRoman(int num) {
        map = new HashMap<>();
        map.put(0, "");
        map.put(1, "I");
        map.put(5, "V");
        map.put(10, "X");
        map.put(50, "L");
        map.put(100, "C");
        map.put(500, "D");
        map.put(1000, "M");
        map.put(4, "IV");
        map.put(9, "IX");
        map.put(40, "XL");
        map.put(90, "XC");
        map.put(400, "CD");
        map.put(900, "CM");
        int[] count = calIndices(num);
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < count.length; i++) {
            if(count[i] == 0) {
                continue;
            }
            int pow = (int)Math.pow(10, 3 - i);
            stringBuilder.append(indicesToRoman(count[i], pow));
        }
        return stringBuilder.toString();
    }
    public int[] calIndices(int num) {
        int[] count = new int[4];
        int index = 0;
        int mod = 1000;
        while (num > 0) {
            count[index++] = num / mod;
            num = num % mod;
            mod /= 10;
        }
        return count;
    }
    public String indicesToRoman(int count, int pow) {
        if(map.containsKey(count * pow)) {
            return map.get(count * pow);
        }
        if(count > 5) {
            return map.get(5 * pow) + indicesToRoman(count - 5, pow);
        }
        return String.valueOf(map.get(pow)).repeat(Math.max(0, count));
    }
}
