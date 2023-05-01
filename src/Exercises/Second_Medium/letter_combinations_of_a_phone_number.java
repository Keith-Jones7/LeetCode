package Exercises.Second_Medium;
import java.util.*;
//17 电话号码的字母组合
public class letter_combinations_of_a_phone_number {
    List<String> list;
    int[] preSum = {0, 3, 6, 9, 12, 15, 19, 22, 26};
    public List<String> letterCombinations(String digits) {
        list = new ArrayList<>();
        if(digits.length() == 0) {
            return list;
        }
        char[] chars = digits.toCharArray();
        list.add("");
        int count = 1;
        for (char aChar : chars) {
            int num = aChar - '0';
            DFS(num);
            count *= (preSum[num - 1] - preSum[num - 2]);
        }
        return list.subList(list.size() - count, list.size());
    }
    public void DFS(int num) {
        int size = list.size();
        for(int i = 0; i < size; i++) {
            String s = list.get(i);
            for(int j = preSum[num - 2]; j < preSum[num - 1]; j++) {
                list.add(s + (char)('a' + j));
            }
        }
    }
}
