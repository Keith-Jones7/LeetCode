package Exercises.Second_Medium;
//6 Z字形变换
import java.util.*;

public class zigzag_conversion {
    /**
     * @param s the String to be converted as zigzag
     * @param numRows the number of row converting
     */
    public String convert(String s, int numRows) {
        if(numRows == 1) {
            return s;
        }
        List<List<Character>> lists = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            lists.add(new ArrayList<>());
        }

        char[] chars = s.toCharArray();
        int index = 0;
        boolean flag = true;
        for(char ch : chars) {
            List<Character> list = lists.get(index);
            list.add(ch);
            if(index == 0) {
                index++;
                flag = true;
            }
            else if(index == numRows - 1) {
                index--;
                flag = false;
            }
            else {
                if(flag) {
                    index++;
                }
                else {
                    index--;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0; i < numRows; i++) {
            List<Character> list = lists.get(i);
            for (Character character : list) {
                stringBuilder.append(character);
            }
        }
        return stringBuilder.toString();
    }
}
