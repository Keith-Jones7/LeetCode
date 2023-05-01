package Exercises.Second_Medium;
import java.util.*;
//1807 替换字符串中的括号内容
public class evaluate_the_bracket_pairs_of_a_string {
    public String evaluate(String s, List<List<String>> knowledge) {
        StringBuilder stringBuilder = new StringBuilder();
        Map<String, String> map = new HashMap<>();
        for (List<String> list : knowledge) {
            map.put(list.get(0), list.get(1));
        }
        String[] strs = s.split("\\(");
        stringBuilder.append(strs[0]);
        for (int i = 1; i < strs.length; i++) {
            int index = 0;
            char[] chars = strs[i].toCharArray();
            StringBuilder temp = new StringBuilder();
            while (index < chars.length && chars[index] != ')') {
                temp.append(chars[index++]);
            }
            stringBuilder.append(map.getOrDefault(temp.toString(), "?"));
            index++;
            temp = new StringBuilder();
            while (index < chars.length) {
                temp.append(chars[index++]);
            }
            stringBuilder.append(temp);
        }
        return stringBuilder.toString();
    }
}
